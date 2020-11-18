package com.example.demo.business.entities;

public class Todo {
    private long id;
    private String description;
    private boolean isDone;

    public Todo(long id, String description) {
        this.id = id;
        this.description = description;
        this.isDone = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
