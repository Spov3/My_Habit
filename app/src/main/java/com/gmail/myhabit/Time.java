package com.gmail.myhabit;

public class Time {

    private String category;
    private String duration;
    private String description;
    private String date;
    private long time;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() { return description; }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getTime() { return time; }

    public void setTime(long time) {
        this.time = time;
    }
}
