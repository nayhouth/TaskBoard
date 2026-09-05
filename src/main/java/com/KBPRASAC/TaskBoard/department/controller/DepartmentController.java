package com.KBPRASAC.TaskBoard.department.controller;

import com.KBPRASAC.TaskBoard.department.entity.Department;
import com.KBPRASAC.TaskBoard.department.service.DepartmentService;
import com.corebackend.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController
        extends BaseController<Department> {

    public DepartmentController(DepartmentService service) {
        super(service);
    }
}