package com.KBPRASAC.TaskBoard.workspace.controller;

import com.KBPRASAC.TaskBoard.workspace.entity.Workspace;
import com.KBPRASAC.TaskBoard.workspace.service.WorkspaceService;
import com.corebackend.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/workspaces")
public class WorkspaceController
        extends BaseController<Workspace> {

    public WorkspaceController(WorkspaceService workspaceService) {
        super(workspaceService);
    }
}