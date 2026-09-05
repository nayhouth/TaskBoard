package com.KBPRASAC.TaskBoard.department.service.impl;

import com.KBPRASAC.TaskBoard.department.entity.Department;
import com.KBPRASAC.TaskBoard.department.repository.DepartmentRepository;
import com.KBPRASAC.TaskBoard.department.service.DepartmentService;
import com.corebackend.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl
        extends BaseServiceImpl<Department>
        implements DepartmentService {

    public DepartmentServiceImpl(DepartmentRepository repository) {
        super(repository);
    }
}