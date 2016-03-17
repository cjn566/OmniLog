package com.coltennye.omnilog.model;

/**
 * Created by Colten on 3/15/2016.
 */
public class User {
    private int id;
    private String name;

    public User(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
