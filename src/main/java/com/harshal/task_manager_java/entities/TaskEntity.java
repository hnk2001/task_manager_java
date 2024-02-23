package com.harshal.task_manager_java.entities;


import lombok.Data;

@Data
public class TaskEntity {
    private int id;
    private String title;
    private String description;
    private String deadline;
    private boolean completed;
}
