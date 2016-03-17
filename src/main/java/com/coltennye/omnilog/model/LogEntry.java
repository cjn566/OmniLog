package com.coltennye.omnilog.model;

import java.time.LocalDateTime;

/**
 * Created by Colten on 2/11/2016.
 */
public class LogEntry {
    private int id;
    private int eventTypeId;
    private LocalDateTime timeOfEntry;

    public LogEntry(int id, int eventTypeId, LocalDateTime timeOfEntry) {
        this.id = id;
        this.eventTypeId = eventTypeId;
        this.timeOfEntry = timeOfEntry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(int eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public LocalDateTime getTimeOfEntry() {
        return timeOfEntry;
    }

    public void setTimeOfEntry(LocalDateTime timeOfEntry) {
        this.timeOfEntry = timeOfEntry;
    }
}
