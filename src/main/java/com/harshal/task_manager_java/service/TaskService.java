package com.harshal.task_manager_java.service;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.harshal.task_manager_java.entities.TaskEntity;

@Service
public class TaskService {
    private ArrayList<TaskEntity> tasks = new ArrayList<>();
    private int taskId = 1;

    public TaskEntity addTask(String title, String description, String deadline){
        TaskEntity task = new TaskEntity();
        task.setId(taskId);
        task.setTitle(title);
        task.setDescription(description);
        task.setDeadline(new Date().toString());
        task.setCompleted(false);
        tasks.add(task);
        taskId++;
        return task;
    }

    public ArrayList<TaskEntity> getTasks(){
        return tasks;
    }

    public TaskEntity getTaskById(int id){
        
        for(TaskEntity task : tasks){
            if(task.getId() == id){
                return task;
            }
        }
        return null;
    }
}
