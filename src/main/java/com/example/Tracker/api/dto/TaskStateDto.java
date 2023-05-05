package com.example.Tracker.api.dto;


import com.example.Tracker.storage.entity.TaskEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskStateDto {
    @NonNull
    private Long id;
    @NonNull
    private String name;
    @JsonProperty("left_task_state_id")
    Long leftTaskStateId;

    @JsonProperty("right_task_state_id")
    Long rightTaskStateId;
    @NonNull
    @JsonProperty("create_at")
    private Instant createAt;
    @NonNull
    List<TaskDto> tasks;


}
