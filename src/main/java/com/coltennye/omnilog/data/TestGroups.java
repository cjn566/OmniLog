package com.coltennye.omnilog.data;

import com.coltennye.omnilog.model.EventGroup;

import java.util.*;

/**
 * Created by Colten on 3/15/2016.
 */
public class TestGroups {
    private ArrayList<EventGroup> groups;

    public TestGroups() {
        groups = new ArrayList<EventGroup>();
        EventGroup g = new EventGroup(1, "User 1 group 1");
        g.setId(0);
        groups.add(g);

        g = new EventGroup(1, "User 1 group 2");
        g.setId(1);
        groups.add(g);

        g = new EventGroup(2, "User 2 group 1");
        g.setId(2);
        groups.add(g);

        g = new EventGroup(2, "User 2 group 2");
        g.setId(3);
        groups.add(g);
    }

    public ArrayList<EventGroup> getGroups() {
        return groups;
    }
}
