package com.KBPRASAC.TaskBoard.unit.controller;

import com.KBPRASAC.TaskBoard.unit.entity.Unit;
import com.KBPRASAC.TaskBoard.unit.service.UnitService;
import com.corebackend.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/units")
public class UnitController
        extends BaseController<Unit> {

    public UnitController(UnitService service) {
        super(service);
    }
}