package com.KBPRASAC.TaskBoard.task.service.impl;

import com.KBPRASAC.TaskBoard.task.entity.Task;
import com.KBPRASAC.TaskBoard.task.repository.TaskRepository;
import com.KBPRASAC.TaskBoard.task.service.TaskService;
import com.corebackend.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl
        extends BaseServiceImpl<Task>
        implements TaskService {

    public TaskServiceImpl(TaskRepository repository) {
        super(repository);
    }
}