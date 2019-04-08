package com.baobeidaodao.rmi;

import com.baobeidaodao.rmi.domain.service.HelloService;
import com.baobeidaodao.rmi.domain.service.impl.HelloServiceImpl;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author DaoDao
 */
public class Server {

    public static void main(String[] args) throws AlreadyBoundException, RemoteException {
        HelloServiceImpl helloServiceImpl = new HelloServiceImpl();
        HelloService helloService = (HelloService) UnicastRemoteObject.exportObject(helloServiceImpl, 0);
        Registry registry = LocateRegistry.createRegistry(8001);
        registry.rebind("helloService", helloService);
        System.out.println("rmi server is ready");
    }

}
