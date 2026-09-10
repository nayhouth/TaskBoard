package com.KBPRASAC.TaskBoard.workspace.service;

import com.KBPRASAC.TaskBoard.workspace.entity.WorkspaceMember;
import com.corebackend.service.BaseService;

import java.util.List;

public interface WorkspaceMemberService
        extends BaseService<WorkspaceMember> {

    List<WorkspaceMember> getByWorkspaceId(Long workspaceId);

    WorkspaceMember updateRole(Long id, WorkspaceMember member);
}