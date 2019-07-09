package com.example.myschedule;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;


// database-i het kapvac baneri hamar mi hat database anunov arandzin backage sarqeq: qceq mejy vor haskanali exni
/*

    database/entities (this is for models)
    database/dao (this is for daos)
    database/DataBaseHelper
 */


@Entity
public class TaskModel {
    @PrimaryKey
    @NonNull
    private String name;
    private String date;
    private String time;
    String description;
    private int priorityColor;


    private int id;


    @Ignore
    TaskModel(@NonNull String name, String date, String time, String description, int priorityColor, int id) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.description = description;
        this.priorityColor = priorityColor;
        this.id = id;

    }

    TaskModel() {
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    void setDescription(String description) {
        this.description = description;
    }

    public int getPriorityColor() {
        return priorityColor;
    }

    void setPriorityColor(int priorityColor) {
        this.priorityColor = priorityColor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
