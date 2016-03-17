package com.coltennye.omnilog.model;

import java.time.LocalDateTime;

/**
 * Created by Colten on 2/11/2016.
 */
public class LogEntryAttribute {
    private int id;
    private int eventTypeAttrId;
    private int logEntryId;
    private String value;

    public LogEntryAttribute(int id, int eventTypeAttrId, int logEntryId, String value) {
        this.id = id;
        this.eventTypeAttrId = eventTypeAttrId;
        this.logEntryId = logEntryId;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEventTypeAttrId() {
        return eventTypeAttrId;
    }

    public void setEventTypeAttrId(int eventTypeAttrId) {
        this.eventTypeAttrId = eventTypeAttrId;
    }

    public int getLogEntryId() {
        return logEntryId;
    }

    public void setLogEntryId(int logEntryId) {
        this.logEntryId = logEntryId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
