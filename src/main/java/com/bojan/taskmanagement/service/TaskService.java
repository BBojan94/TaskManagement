package com.bojan.taskmanagement.service;

import com.bojan.taskmanagement.dto.TaskDTO;
import com.bojan.taskmanagement.exception.ResourceNotFoundException;
import com.bojan.taskmanagement.model.Task;
import com.bojan.taskmanagement.repository.TaskRepository;
import com.bojan.taskmanagement.util.MapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<TaskDTO> getAllTasks() {
        return taskRepository.findAll().stream()
                .map(MapperUtil::toDTO).collect(Collectors.toList());
    }

    public Optional<TaskDTO> getTaskById(Long id) {
        return taskRepository.findById(id).map(MapperUtil::toDTO);
    }

    public TaskDTO createTask(TaskDTO dto) {
        Task task = MapperUtil.toEntity(dto);
        return MapperUtil.toDTO(taskRepository.save(task));
    }

    public TaskDTO updateTask(Long id, TaskDTO Taskdto) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Task not found"));
        task.setTitle(Taskdto.getTitle());
        task.setDescription(Taskdto.getDescription());
        task.setStatus(Taskdto.getStatus());
        return MapperUtil.toDTO(taskRepository.save(task));
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

}
