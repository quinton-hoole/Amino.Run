/*
 * Stub for class sapphire.appexamples.minnietwitter.app.User
 * Generated by Sapphire Compiler (sc).
 */
package sapphire.appexamples.minnietwitter.app.stubs;


public final class User_Stub extends sapphire.appexamples.minnietwitter.app.User implements sapphire.common.AppObjectStub {

    sapphire.policy.SapphirePolicy.SapphireClientPolicy $__client = null;
    boolean $__directInvocation = false;

    public User_Stub (sapphire.appexamples.minnietwitter.app.UserInfo $param_UserInfo_1, sapphire.appexamples.minnietwitter.app.TagManager $param_TagManager_2) {
        super($param_UserInfo_1, $param_TagManager_2);
    }


    public void $__initialize(sapphire.policy.SapphirePolicy.SapphireClientPolicy client) {
        $__client = client;
    }

    public void $__initialize(boolean directInvocation) {
        $__directInvocation = directInvocation;
    }

    public Object $__clone() throws CloneNotSupportedException {
        return super.clone();
    }



    // Implementation of initialize(User)
    public void initialize(sapphire.appexamples.minnietwitter.app.User $param_User_1) {
        java.lang.Object $__result = null;
        try {
            if ($__directInvocation)
                super.initialize( $param_User_1);
            else {
                java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
                String $__method = "public void sapphire.appexamples.minnietwitter.app.User.initialize(sapphire.appexamples.minnietwitter.app.User)";
                $__params.add($param_User_1);
                $__result = $__client.onRPC($__method, $__params);
            }
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.rmi.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    // Implementation of getUserInfo()
    public sapphire.appexamples.minnietwitter.app.UserInfo getUserInfo() {
        java.lang.Object $__result = null;
        try {
            if ($__directInvocation)
                $__result = super.getUserInfo();
            else {
                java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
                String $__method = "public sapphire.appexamples.minnietwitter.app.UserInfo sapphire.appexamples.minnietwitter.app.User.getUserInfo()";
                $__result = $__client.onRPC($__method, $__params);
            }
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.rmi.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return ((sapphire.appexamples.minnietwitter.app.UserInfo) $__result);
    }

    // Implementation of getTimeline()
    public sapphire.appexamples.minnietwitter.app.Timeline getTimeline() {
        java.lang.Object $__result = null;
        try {
            if ($__directInvocation)
                $__result = super.getTimeline();
            else {
                java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
                String $__method = "public sapphire.appexamples.minnietwitter.app.Timeline sapphire.appexamples.minnietwitter.app.User.getTimeline()";
                $__result = $__client.onRPC($__method, $__params);
            }
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.rmi.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return ((sapphire.appexamples.minnietwitter.app.Timeline) $__result);
    }

    // Implementation of getFollowing(int, int)
    public java.util.List getFollowing(int $param_int_1, int $param_int_2) {
        java.lang.Object $__result = null;
        try {
            if ($__directInvocation)
                $__result = super.getFollowing( $param_int_1,  $param_int_2);
            else {
                java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
                String $__method = "public java.util.List<sapphire.appexamples.minnietwitter.app.User> sapphire.appexamples.minnietwitter.app.User.getFollowing(int,int)";
                $__params.add($param_int_1);
                $__params.add($param_int_2);
                $__result = $__client.onRPC($__method, $__params);
            }
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.rmi.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return ((java.util.List) $__result);
    }

    // Implementation of getFollowers(int, int)
    public java.util.List getFollowers(int $param_int_1, int $param_int_2) {
        java.lang.Object $__result = null;
        try {
            if ($__directInvocation)
                $__result = super.getFollowers( $param_int_1,  $param_int_2);
            else {
                java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
                String $__method = "public java.util.List<sapphire.appexamples.minnietwitter.app.User> sapphire.appexamples.minnietwitter.app.User.getFollowers(int,int)";
                $__params.add($param_int_1);
                $__params.add($param_int_2);
                $__result = $__client.onRPC($__method, $__params);
            }
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.rmi.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return ((java.util.List) $__result);
    }

    // Implementation of addFollowing(User)
    public void addFollowing(sapphire.appexamples.minnietwitter.app.User $param_User_1) {
        java.lang.Object $__result = null;
        try {
            if ($__directInvocation)
                super.addFollowing( $param_User_1);
            else {
                java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
                String $__method = "public void sapphire.appexamples.minnietwitter.app.User.addFollowing(sapphire.appexamples.minnietwitter.app.User)";
                $__params.add($param_User_1);
                $__result = $__client.onRPC($__method, $__params);
            }
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.rmi.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    // Implementation of addFollower(User)
    public void addFollower(sapphire.appexamples.minnietwitter.app.User $param_User_1) {
        java.lang.Object $__result = null;
        try {
            if ($__directInvocation)
                super.addFollower( $param_User_1);
            else {
                java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
                String $__method = "public void sapphire.appexamples.minnietwitter.app.User.addFollower(sapphire.appexamples.minnietwitter.app.User)";
                $__params.add($param_User_1);
                $__result = $__client.onRPC($__method, $__params);
            }
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.rmi.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
