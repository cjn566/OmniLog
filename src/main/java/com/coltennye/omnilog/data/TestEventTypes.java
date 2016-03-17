package com.coltennye.omnilog.data;

import com.coltennye.omnilog.model.EventGroup;
import com.coltennye.omnilog.model.EventType;

import java.util.ArrayList;

/**
 * Created by Colten on 3/15/2016.
 */
public class TestEventTypes {
    private ArrayList<EventType> eventTypes;

    public TestEventTypes() {
        eventTypes = new ArrayList<EventType>();
        eventTypes.add(new EventType(0, "User 1 group 1 event 1").setId(0));
        eventTypes.add(new EventType(0, "User 1 group 1 event 2").setId(1));
        eventTypes.add(new EventType(1, "User 1 group 2 event 1").setId(2));
        eventTypes.add(new EventType(1, "User 1 group 2 event 2").setId(3));
        eventTypes.add(new EventType(2, "User 2 group 1 event 1").setId(4));
        eventTypes.add(new EventType(2, "User 2 group 1 event 2").setId(5));
        eventTypes.add(new EventType(3, "User 2 group 2 event 1").setId(6));
        eventTypes.add(new EventType(3, "User 2 group 2 event 2").setId(7));
    }

    public ArrayList<EventType> getEventTypes() {
        return eventTypes;
    }
}
