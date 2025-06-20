package com.sohamsur.todo.models;

public class DailyItem {

    public DailyItem(int index, String item, String desc) {
        this.index = index;
        this.item = item;
        this.desc = desc;
        this.isCompleted = false;
    }

    public int index;
    public String item;
    public String desc;
    public Boolean isCompleted;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Boolean getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(Boolean completed) {
        isCompleted = completed;
    }
}
