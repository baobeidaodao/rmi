package com.baobeidaodao.rmi.domain.service;

import com.baobeidaodao.rmi.domain.model.User;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author DaoDao
 */
public interface HelloService extends Remote {

    String hello() throws RemoteException;

    String hello(String name) throws RemoteException;

    String hello(User user) throws RemoteException;

}
