package com.hanifomarr.tasks.services.impl;

import com.hanifomarr.tasks.domain.entities.TaskList;
import com.hanifomarr.tasks.repositories.TaskListRepository;
import com.hanifomarr.tasks.services.TaskListService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListServiceImpl implements TaskListService {

    private final TaskListRepository taskListRepository;

    public TaskListServiceImpl(TaskListRepository taskListRepository) {
        this.taskListRepository = taskListRepository;
    }

    @Override
    public List<TaskList> listTaskLists() {
        return taskListRepository.findAll();
    }
}
