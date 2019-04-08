package com.baobeidaodao.rmi;

import com.baobeidaodao.rmi.domain.model.User;
import com.baobeidaodao.rmi.domain.service.HelloService;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author DaoDao
 */
public class Client {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 8001);
            HelloService helloService = (HelloService) registry.lookup("helloService");
            String hello = helloService.hello();
            System.out.println(hello);
            hello = helloService.hello("mmm");
            System.out.println(hello);
            User user = new User();
            user.setName("www");
            hello = helloService.hello(user);
            System.out.println(hello);
        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }
}
