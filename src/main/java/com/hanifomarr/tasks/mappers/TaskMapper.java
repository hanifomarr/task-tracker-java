package com.hanifomarr.tasks.mappers;

import com.hanifomarr.tasks.domain.dto.TaskDto;
import com.hanifomarr.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
