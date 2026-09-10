package com.KBPRASAC.TaskBoard.workspace.controller;

import com.KBPRASAC.TaskBoard.workspace.entity.WorkspaceMember;
import com.KBPRASAC.TaskBoard.workspace.service.WorkspaceMemberService;
import com.corebackend.controller.BaseController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workspace-members")
public class WorkspaceMemberController
        extends BaseController<WorkspaceMember> {

    private final WorkspaceMemberService workspaceMemberService;

    public WorkspaceMemberController(
            WorkspaceMemberService workspaceMemberService) {

        super(workspaceMemberService);
        this.workspaceMemberService = workspaceMemberService;
    }

    @GetMapping("/workspace/{workspaceId}")
    public List<WorkspaceMember> getByWorkspaceId(
            @PathVariable Long workspaceId) {

        return workspaceMemberService.getByWorkspaceId(workspaceId);
    }

    @PutMapping("/{id}/role")
    public WorkspaceMember updateRole(
            @PathVariable Long id,
            @RequestBody WorkspaceMember member) {

        return workspaceMemberService.updateRole(id, member);
    }
}