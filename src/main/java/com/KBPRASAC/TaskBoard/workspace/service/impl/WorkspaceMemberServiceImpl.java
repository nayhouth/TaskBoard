package com.KBPRASAC.TaskBoard.workspace.service.impl;

import com.KBPRASAC.TaskBoard.workspace.entity.WorkspaceMember;
import com.KBPRASAC.TaskBoard.workspace.repository.WorkspaceMemberRepository;
import com.KBPRASAC.TaskBoard.workspace.service.WorkspaceMemberService;
import com.corebackend.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkspaceMemberServiceImpl
        extends BaseServiceImpl<WorkspaceMember>
        implements WorkspaceMemberService {

    private final WorkspaceMemberRepository workspaceMemberRepository;

    public WorkspaceMemberServiceImpl(
            WorkspaceMemberRepository workspaceMemberRepository) {

        super(workspaceMemberRepository);
        this.workspaceMemberRepository = workspaceMemberRepository;
    }

    @Override
    public List<WorkspaceMember> getByWorkspaceId(Long workspaceId) {
        return workspaceMemberRepository.findAll()
                .stream()
                .filter(member ->
                        member.getWorkspace()
                                .getId()
                                .equals(workspaceId))
                .toList();
    }

    @Override
    public WorkspaceMember updateRole(
            Long id,
            WorkspaceMember member) {

        WorkspaceMember existing = getById(id)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Workspace member not found: " + id
                        ));

        existing.setRole(member.getRole());

        return repository.save(existing);
    }
}