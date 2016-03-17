package com.coltennye.omnilog.data;

import com.coltennye.omnilog.model.EventGroup;
import com.coltennye.omnilog.model.User;

import java.util.ArrayList;

/**
 * Created by Colten on 3/15/2016.
 */
public class TestUsers {
    private ArrayList<User> users;

    public TestUsers() {
        users = new ArrayList<User>();
        User g = new User("User 1");
        g.setId(0);
        users.add(g);

        g = new User("User 2");
        g.setId(1);
        users.add(g);
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
