package com.example.Tracker.storage.repository;


import com.example.Tracker.storage.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity,Long> {
}
