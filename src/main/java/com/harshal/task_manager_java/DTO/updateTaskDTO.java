package com.harshal.task_manager_java.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class updateTaskDTO {
    String description;
    String deadline;
    Boolean completed;
}
