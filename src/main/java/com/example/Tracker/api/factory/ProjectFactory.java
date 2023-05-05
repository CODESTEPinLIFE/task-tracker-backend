package com.example.Tracker.api.factory;


import com.example.Tracker.api.dto.ProjectDto;
import com.example.Tracker.storage.entity.ProjectEntity;
import org.springframework.stereotype.Component;

@Component
public class ProjectFactory {
    public ProjectDto makeProjectDto(ProjectEntity projectEntity){
     return ProjectDto.builder().
             id(projectEntity.getId()).
             name(projectEntity.getName()).createdAt(projectEntity.getCreatedAt()).updatedAt(projectEntity.getUpdatedAt()).build();
    }
}
