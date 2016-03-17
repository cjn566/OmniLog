package com.coltennye.omnilog.model;

import java.util.List;

/**
 * Created by Colten on 2/11/2016.
 */
public class EventTypeAttribute {
    private int id;
    private int eventTypeId;
    private String name;
    private DataType dataType;
    private List<String> selectionOptions;
    private String defaultValue;
    private boolean required;
    private int numberInterval;

    public EventTypeAttribute(int id, int eventTypeId, String name, DataType dataType, List<String> selectionOptions, String defaultValue, boolean required, int numberInterval) {
        this.id = id;
        this.eventTypeId = eventTypeId;
        this.name = name;
        this.dataType = dataType;
        this.selectionOptions = selectionOptions;
        this.defaultValue = defaultValue;
        this.required = required;
        this.numberInterval = numberInterval;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public List<String> getSelectionOptions() {
        return selectionOptions;
    }

    public void setSelectionOptions(List<String> selectionOptions) {
        this.selectionOptions = selectionOptions;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public int getNumberInterval() {
        return numberInterval;
    }

    public void setNumberInterval(int numberInterval) {
        this.numberInterval = numberInterval;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
