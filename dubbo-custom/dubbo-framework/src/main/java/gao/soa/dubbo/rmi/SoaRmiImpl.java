package gao.soa.dubbo.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import gao.soa.dubbo.util.ReflectInvokeUtil;

/**
 * 服务端的rmi
 */
public class SoaRmiImpl extends UnicastRemoteObject implements SoaRmi {
    
    protected SoaRmiImpl() throws RemoteException {
        super();
    }
    
    public String invoke(String param) throws RemoteException {
        return ReflectInvokeUtil.invokeService(param);
    }
}