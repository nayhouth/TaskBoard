package com.KBPRASAC.TaskBoard.task.controller;

import com.KBPRASAC.TaskBoard.task.entity.Task;
import com.KBPRASAC.TaskBoard.task.service.TaskService;
import com.corebackend.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class TaskController
        extends BaseController<Task> {

    public TaskController(TaskService service) {
        super(service);
    }
}