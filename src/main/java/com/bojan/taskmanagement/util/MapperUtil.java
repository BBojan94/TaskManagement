package com.bojan.taskmanagement.util;

import com.bojan.taskmanagement.dto.TaskDTO;
import com.bojan.taskmanagement.model.Task;

public class MapperUtil {

    public static Task toEntity(TaskDTO dto) {
        Task task = new Task();
        task.setTitle(dto.getTitle());
        task.setDescription(dto.getDescription());
        task.setStatus(dto.getStatus());
        return task;
    }

    public static TaskDTO toDTO(Task task) {
        TaskDTO dto = new TaskDTO();
        dto.setTitle(task.getTitle());
        dto.setDescription(task.getDescription());
        dto.setStatus(task.getStatus());
        return dto;
    }

}
