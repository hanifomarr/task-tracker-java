package com.hanifomarr.tasks.services;

import com.hanifomarr.tasks.domain.entities.TaskList;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskListService {
    List<TaskList> listTaskLists();
    TaskList createTaskLists(TaskList taskList);
    Optional<TaskList> getTaskList(UUID id);
}
