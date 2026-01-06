package com.hanifomarr.tasks.mappers;

import com.hanifomarr.tasks.domain.dto.TaskListDto;
import com.hanifomarr.tasks.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
