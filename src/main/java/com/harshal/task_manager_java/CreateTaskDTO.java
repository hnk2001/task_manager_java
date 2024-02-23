package com.harshal.task_manager_java;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateTaskDTO {
    String title;
    String description;
    String deadline;
}
