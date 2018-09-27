/*
 * Stub for class sapphire.policy.atleastoncerpc.AtLeastOnceRPCPolicy.AtLeastOnceRPCServerPolicy
 * Generated by Sapphire Compiler (sc).
 */
package sapphire.stubexample;


import sapphire.common.AppObject;
import sapphire.policy.SapphirePolicy;


public final class AtLeastOnceRPCPolicy$AtLeastOnceRPCServerPolicy_Stub extends sapphire.policy.atleastoncerpc.AtLeastOnceRPCPolicy.AtLeastOnceRPCServerPolicy implements sapphire.kernel.common.KernelObjectStub {

    sapphire.kernel.common.KernelOID $__oid = null;
    java.net.InetSocketAddress $__hostname = null;
    AppObject appObject = null;
    SapphirePolicy.SapphireClientPolicy $__nextClientPolicy = null;

    public AtLeastOnceRPCPolicy$AtLeastOnceRPCServerPolicy_Stub(sapphire.kernel.common.KernelOID oid) {
        this.$__oid = oid;
    }

    public sapphire.kernel.common.KernelOID $__getKernelOID() {
        return this.$__oid;
    }

    public java.net.InetSocketAddress $__getHostname() {
        return this.$__hostname;
    }

    public void $__updateHostname(java.net.InetSocketAddress hostname) {
        this.$__hostname = hostname;
    }

    public void $__setNextClientPolicy(SapphirePolicy.SapphireClientPolicy clientPolicy) {
        this.$__nextClientPolicy = clientPolicy;
    }

    public AppObject $__getAppObject() {
        return this.appObject;
    }

    public Object $__makeKernelRPC(String method, java.util.ArrayList<Object> params) throws java.rmi.RemoteException, Exception {
        if ($__nextClientPolicy != null) {
            return $__nextClientPolicy.onRPC(method, params);
        }

        sapphire.kernel.common.KernelRPC rpc = new sapphire.kernel.common.KernelRPC($__oid, method, params);
        try {
            return sapphire.kernel.common.GlobalKernelReferences.nodeServer.getKernelClient().makeKernelRPC(this, rpc);
        } catch (sapphire.kernel.common.KernelObjectNotFoundException e) {
            throw new java.rmi.RemoteException();
        }
    }

    @Override
    public boolean equals(Object obj) {
        AtLeastOnceRPCPolicy$AtLeastOnceRPCServerPolicy_Stub other = (AtLeastOnceRPCPolicy$AtLeastOnceRPCServerPolicy_Stub) obj;
        if (! other.$__oid.equals($__oid))
            return false;
        return true;
    }
    @Override
    public int hashCode() {
        return $__oid.getID();
    }


    // Implementation of sapphire_replicate()
    public SapphirePolicy.SapphireServerPolicy sapphire_replicate()
            throws java.rmi.RemoteException {
        java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
        String $__method = "public sapphire.policy.SapphirePolicy$SapphireServerPolicy sapphire.policy.DefaultSapphirePolicyUpcallImpl$DefaultSapphireServerPolicyUpcallImpl.sapphire_replicate() throws java.rmi.RemoteException";
        Object $__result = null;
        try {
            $__result = $__makeKernelRPC($__method, $__params);
        } catch (java.rmi.RemoteException e) {
            throw e;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return ((SapphirePolicy.SapphireServerPolicy) $__result);
    }

    // Implementation of sapphire_remove_replica()
    public void sapphire_remove_replica()
            throws java.rmi.RemoteException {
        java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
        String $__method = "public void sapphire.policy.DefaultSapphirePolicyUpcallImpl$DefaultSapphireServerPolicyUpcallImpl.sapphire_remove_replica() throws java.rmi.RemoteException";
        Object $__result = null;
        try {
            $__result = $__makeKernelRPC($__method, $__params);
        } catch (java.rmi.RemoteException e) {
            throw e;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Implementation of sapphire_pin_to_server(InetSocketAddress)
    public void sapphire_pin_to_server(java.net.InetSocketAddress $param_InetSocketAddress_1)
            throws java.rmi.RemoteException, sapphire.common.SapphireObjectNotFoundException, sapphire.common.SapphireObjectReplicaNotFoundException {
        java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
        String $__method = "public void sapphire.policy.DefaultSapphirePolicyUpcallImpl$DefaultSapphireServerPolicyUpcallImpl.sapphire_pin_to_server(java.net.InetSocketAddress) throws java.rmi.RemoteException,sapphire.common.SapphireObjectNotFoundException,sapphire.common.SapphireObjectReplicaNotFoundException";
        $__params.add($param_InetSocketAddress_1);
        Object $__result = null;
        try {
            $__result = $__makeKernelRPC($__method, $__params);
        } catch (java.rmi.RemoteException e) {
            throw e;
        } catch (sapphire.common.SapphireObjectNotFoundException e) {
            throw e;
        } catch (sapphire.common.SapphireObjectReplicaNotFoundException e) {
            throw e;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Implementation of sapphire_pin(String)
    public void sapphire_pin(String $param_String_1)
            throws java.rmi.RemoteException, sapphire.common.SapphireObjectNotFoundException, sapphire.common.SapphireObjectReplicaNotFoundException {
        java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
        String $__method = "public void sapphire.policy.DefaultSapphirePolicyUpcallImpl$DefaultSapphireServerPolicyUpcallImpl.sapphire_pin(java.lang.String) throws java.rmi.RemoteException,sapphire.common.SapphireObjectNotFoundException,sapphire.common.SapphireObjectReplicaNotFoundException";
        $__params.add($param_String_1);
        Object $__result = null;
        try {
            $__result = $__makeKernelRPC($__method, $__params);
        } catch (java.rmi.RemoteException e) {
            throw e;
        } catch (sapphire.common.SapphireObjectNotFoundException e) {
            throw e;
        } catch (sapphire.common.SapphireObjectReplicaNotFoundException e) {
            throw e;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Implementation of sapphire_getRemoteAppObject()
    public AppObject sapphire_getRemoteAppObject()
            throws java.rmi.RemoteException {
        java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
        String $__method = "public sapphire.common.AppObject sapphire.policy.DefaultSapphirePolicyUpcallImpl$DefaultSapphireServerPolicyUpcallImpl.sapphire_getRemoteAppObject() throws java.rmi.RemoteException";
        Object $__result = null;
        try {
            $__result = $__makeKernelRPC($__method, $__params);
        } catch (java.rmi.RemoteException e) {
            throw e;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return ((AppObject) $__result);
    }

    // Implementation of sapphire_getRegion()
    public String sapphire_getRegion() {
        java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
        String $__method = "public java.lang.String sapphire.policy.DefaultSapphirePolicyUpcallImpl$DefaultSapphireServerPolicyUpcallImpl.sapphire_getRegion()";
        Object $__result = null;
        try {
            $__result = $__makeKernelRPC($__method, $__params);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return ((String) $__result);
    }

    // Implementation of onRPC(String, ArrayList)
    public Object onRPC(String $param_String_1, java.util.ArrayList $param_ArrayList_2)
            throws Exception {
        java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
        String $__method = "public java.lang.Object sapphire.policy.DefaultSapphirePolicyUpcallImpl$DefaultSapphireServerPolicyUpcallImpl.onRPC(java.lang.String,java.util.ArrayList<java.lang.Object>) throws java.lang.Exception";
        $__params.add($param_String_1);
        $__params.add($param_ArrayList_2);
        Object $__result = null;
        $__result = $__makeKernelRPC($__method, $__params);
        return $__result;
    }

    // Implementation of onMembershipChange()
    public void onMembershipChange() {
        java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
        String $__method = "public void sapphire.policy.DefaultSapphirePolicy$DefaultServerPolicy.onMembershipChange()";
        Object $__result = null;
        try {
            $__result = $__makeKernelRPC($__method, $__params);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Implementation of onDestroy()
    public void onDestroy() {
        java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
        String $__method = "public void sapphire.policy.DefaultSapphirePolicy$DefaultServerPolicy.onDestroy()";
        Object $__result = null;
        try {
            $__result = $__makeKernelRPC($__method, $__params);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Implementation of onCreate(SapphirePolicy.SapphireGroupPolicy, Annotation[])
    public void onCreate(SapphirePolicy.SapphireGroupPolicy $param_SapphirePolicy$SapphireGroupPolicy_1, java.lang.annotation.Annotation[] $param_arrayOf_Annotation_2) {
        java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
        String $__method = "public void sapphire.policy.DefaultSapphirePolicy$DefaultServerPolicy.onCreate(sapphire.policy.SapphirePolicy$SapphireGroupPolicy,java.lang.annotation.Annotation[])";
        $__params.add($param_SapphirePolicy$SapphireGroupPolicy_1);
        $__params.add($param_arrayOf_Annotation_2);
        Object $__result = null;
        try {
            $__result = $__makeKernelRPC($__method, $__params);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Implementation of getGroup()
    public SapphirePolicy.SapphireGroupPolicy getGroup() {
        java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
        String $__method = "public sapphire.policy.SapphirePolicy$SapphireGroupPolicy sapphire.policy.DefaultSapphirePolicy$DefaultServerPolicy.getGroup()";
        Object $__result = null;
        try {
            $__result = $__makeKernelRPC($__method, $__params);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return ((SapphirePolicy.SapphireGroupPolicy) $__result);
    }
}
