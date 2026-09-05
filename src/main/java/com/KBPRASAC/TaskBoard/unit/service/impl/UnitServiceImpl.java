package com.KBPRASAC.TaskBoard.unit.service.impl;

import com.KBPRASAC.TaskBoard.unit.entity.Unit;
import com.KBPRASAC.TaskBoard.unit.repository.UnitRepository;
import com.KBPRASAC.TaskBoard.unit.service.UnitService;
import com.corebackend.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UnitServiceImpl
        extends BaseServiceImpl<Unit>
        implements UnitService {

    public UnitServiceImpl(UnitRepository repository) {
        super(repository);
    }
}