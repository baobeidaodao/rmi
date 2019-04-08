package com.baobeidaodao.rmi.domain.model;

import java.io.Serializable;

/**
 * @author DaoDao
 */
public class User implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private String name;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
