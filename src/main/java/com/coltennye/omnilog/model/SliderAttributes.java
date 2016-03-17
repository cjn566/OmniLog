package com.coltennye.omnilog.model;

/**
 * Created by Colten on 2/11/2016.
 */
public class SliderAttributes {
    private int id;
    private int eventTypeAttrId;
    private int lowerValue;
    private int numTicks;
    private String leftLabel;
    private String rightLabel;

    public SliderAttributes(int id, int eventTypeAttrId, int lowerValue, int numTicks, String leftLabel, String rightLabel) {
        this.id = id;
        this.eventTypeAttrId = eventTypeAttrId;
        this.lowerValue = lowerValue;
        this.numTicks = numTicks;
        this.leftLabel = leftLabel;
        this.rightLabel = rightLabel;
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

    public int getLowerValue() {
        return lowerValue;
    }

    public void setLowerValue(int lowerValue) {
        this.lowerValue = lowerValue;
    }

    public int getNumTicks() {
        return numTicks;
    }

    public void setNumTicks(int numTicks) {
        this.numTicks = numTicks;
    }

    public String getLeftLabel() {
        return leftLabel;
    }

    public void setLeftLabel(String leftLabel) {
        this.leftLabel = leftLabel;
    }

    public String getRightLabel() {
        return rightLabel;
    }

    public void setRightLabel(String rightLabel) {
        this.rightLabel = rightLabel;
    }
}
