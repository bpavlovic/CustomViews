package com.iwedia.epg_grid;

/**
 * Class that contains view width, view object pair
 * 
 * @author Branimir Pavlovic
 * @param <T>
 */
public class HorizTimeObject<T> {
    private int mWidth;
    private boolean isRealEvent = true;
    private int mViewType = 0;
    private T mObject;

    public HorizTimeObject(int width, boolean isRealEvent) {
        this(width, null);
        this.isRealEvent = isRealEvent;
    }

    public HorizTimeObject(int width, T object) {
        this.mWidth = width;
        this.mObject = object;
        if (this.mObject == null) {
            isRealEvent = false;
        }
    }

    public int getWidth() {
        return mWidth;
    }

    public void setWidth(int width) {
        mWidth=width;
    }

    public T getObject() {
        return mObject;
    }

    public boolean isRealEvent() {
        return isRealEvent;
    }

    public int getViewType() {
        return mViewType;
    }

    public void setViewType(int mViewType) {
        this.mViewType = mViewType;
    }
}
