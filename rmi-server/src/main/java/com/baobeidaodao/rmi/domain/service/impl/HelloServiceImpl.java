package com.baobeidaodao.rmi.domain.service.impl;

import com.baobeidaodao.rmi.domain.model.User;
import com.baobeidaodao.rmi.domain.service.HelloService;

import java.rmi.RemoteException;

/**
 * @author DaoDao
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello() throws RemoteException {
        return "hello";
    }

    @Override
    public String hello(String name) throws RemoteException {
        return "hello " + name;
    }

    @Override
    public String hello(User user) throws RemoteException {
        String name = user.getName();
        return "hello " + name;
    }

}
