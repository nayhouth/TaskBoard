package com.KBPRASAC.TaskBoard.workspace.service.impl;

import com.KBPRASAC.TaskBoard.workspace.entity.Workspace;
import com.KBPRASAC.TaskBoard.workspace.entity.WorkspaceMember;
import com.KBPRASAC.TaskBoard.workspace.entity.WorkspaceRole;
import com.KBPRASAC.TaskBoard.workspace.repository.WorkspaceMemberRepository;
import com.KBPRASAC.TaskBoard.workspace.repository.WorkspaceRepository;
import com.KBPRASAC.TaskBoard.workspace.service.WorkspaceMemberService;
import com.KBPRASAC.TaskBoard.workspace.service.WorkspaceService;
import com.corebackend.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class WorkspaceServiceImpl
        extends BaseServiceImpl<Workspace>
        implements WorkspaceService {

    private final WorkspaceMemberService workspaceMemberService;

    public WorkspaceServiceImpl(
            WorkspaceRepository workspaceRepository,
            WorkspaceMemberService workspaceMemberService) {

        super(workspaceRepository);
        this.workspaceMemberService = workspaceMemberService;
    }

    @Override
    protected void postCreate(Workspace workspace) {

        WorkspaceMember ownerMember = new WorkspaceMember();

        ownerMember.setWorkspace(workspace);
        ownerMember.setUser(workspace.getOwner());
        ownerMember.setRole(WorkspaceRole.OWNER);

        workspaceMemberService.create(ownerMember);

    }
}