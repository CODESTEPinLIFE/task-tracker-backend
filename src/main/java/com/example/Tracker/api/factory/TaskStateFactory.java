package com.example.Tracker.api.factory;

import com.example.Tracker.api.dto.TaskDto;
import com.example.Tracker.api.dto.TaskStateDto;

import com.example.Tracker.storage.entity.TaskStateEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class TaskStateFactory {
    private TaskFactory taskFactory;
    public TaskStateDto makeTaskStateDto(TaskStateEntity entity) {

        return TaskStateDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .createAt(entity.getCreatedAt())
                .leftTaskStateId(entity.getLeftTaskState().map(TaskStateEntity::getId).orElse(null))
                .rightTaskStateId(entity.getRightTaskState().map(TaskStateEntity::getId).orElse(null))
                .tasks(
                        entity
                                .getTasks()
                                .stream()
                                .map(taskFactory::makeTaskDto)
                                .collect(Collectors.toList())
                )
                .build();
    }
}
