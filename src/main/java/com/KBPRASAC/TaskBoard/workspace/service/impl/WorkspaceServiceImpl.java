package com.KBPRASAC.TaskBoard.workspace.service.impl;

import com.KBPRASAC.TaskBoard.workspace.entity.Workspace;
import com.KBPRASAC.TaskBoard.workspace.repository.WorkspaceRepository;
import com.KBPRASAC.TaskBoard.workspace.service.WorkspaceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkspaceServiceImpl implements WorkspaceService {

    private final WorkspaceRepository workspaceRepository;

    public WorkspaceServiceImpl(
            WorkspaceRepository workspaceRepository) {
        this.workspaceRepository = workspaceRepository;
    }

    @Override
    public List<Workspace> getAll() {
        return workspaceRepository.findAll();
    }

    @Override
    public Workspace getById(Long id) {
        return workspaceRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Workspace not found: " + id
                        ));
    }

    @Override
    public Workspace create(Workspace workspace) {
        return workspaceRepository.save(workspace);
    }

    @Override
    public Workspace update(Long id, Workspace workspace) {
        Workspace existing = getById(id);

        existing.setName(workspace.getName());
        existing.setDescription(workspace.getDescription());
        existing.setActive(workspace.getActive());

        return workspaceRepository.save(existing);
    }

    @Override
    public void delete(Long id) {
        Workspace existing = getById(id);
        workspaceRepository.delete(existing);
    }
}