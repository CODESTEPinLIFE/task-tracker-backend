package com.example.Tracker.api.factory;

import com.example.Tracker.api.dto.TaskDto;

import com.example.Tracker.storage.entity.TaskEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskFactory {
    public TaskDto makeTaskDto(TaskEntity entity) {

        return TaskDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .createdAt(entity.getCreatedAt())
                .description(entity.getDescription())
                .build();
    }
}
