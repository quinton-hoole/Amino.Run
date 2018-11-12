package sapphire.appexamples.fundmover;

import sapphire.app.SapphireObject;
import sapphire.policy.serializability.TransactionAlreadyStartedException;
import sapphire.policy.transaction.TransactionExecutionException;
import sapphire.policy.transaction.TransactionManager;
import sapphire.policy.transaction.TwoPCCohortPolicy;
import sapphire.policy.transaction.TwoPCExtResourceCohortPolicy;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class BankAccount implements SapphireObject, TransactionManager {
    private int balance;
    private Boolean isStart = false;
    private Boolean isCommit = false;

    private static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    private static final String DB_URL="jdbc:mariadb://172.17.0.2/fundmover";
    private static final String USER = "root";
    private static final String PASS = "mysecretpw";

    transient private Connection conn;

    private void ensureConnection() {
        if (this.conn == null) {
            try {
                this.conn = DriverManager.getConnection(DB_URL, USER, PASS);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public BankAccount() {
        this.ensureConnection();
    }

    public void credit(int amount) {
        this.balance += amount;
        this.isStart = true;
        }

    public void debit(int amount) {
        this.balance -= amount;
        this.isStart = true;
    }

    public int getBalance() {
        return this.balance;
    }

    @Override
    public void join(UUID transactionId) throws TransactionAlreadyStartedException {
        System.out.println("[bank] xa join");
        try {
            this.ensureConnection();
            Statement statement = this.conn.createStatement();
            String sql = "xa start '" + transactionId.toString() + "1'";
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void leave(UUID transactionId) {
        System.out.println("[bank] xa leave");
    }

    @Override
    public Vote vote(UUID transactionId) throws TransactionExecutionException {
        System.out.println("[bank] xa vote");
        Vote vote = Vote.YES;
        try {
            Statement statement = this.conn.createStatement();
            try {
                if (this.isStart) {
                    String updateSql = String.format("update Accounts set balance=%d where name='seattle'", this.balance);
                    statement.executeUpdate(updateSql);
                    this.isStart = false;
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
                vote=Vote.NO;
            }

            String sql = "xa end '" + transactionId.toString() +"1'";
            statement.execute(sql);
            String sql2 = "xa prepare '" + transactionId.toString() + "1'";
            this.isCommit=true;
            statement.execute(sql2);
        } catch (SQLException e) {
            e.printStackTrace();
            vote=Vote.NO;
        }
               
        return vote;
    }

    @Override
    public void commit(UUID transactionId) {
        System.out.println("[bank] xa commit");

        try {
            Statement statement = this.conn.createStatement();
            String sql = "xa commit '" + transactionId.toString() + "1'";
            statement.execute(sql);
            isCommit=false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void abort(UUID transactionId) {
        System.out.println("[bank] xa abort");

        try {
            Statement statement = this.conn.createStatement();
            if (this.isStart){
                String sql = "xa end '" + transactionId.toString() +"1'";
                statement.execute(sql);
            }
            if (this.isCommit) {
                String sql = "xa rollback '" + transactionId.toString() + "1'";
                statement.execute(sql);
                this.isCommit=false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
