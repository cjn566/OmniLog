package com.coltennye.omnilog.model;

/**
 * Created by Colten on 2/11/2016.
 */
public class EventType {
    private int id;
    private int groupId;
    private String name;

    public EventType(int groupId, String name) {
        this.groupId = groupId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public EventType setId(int id) {
        this.id = id;
        return this;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
