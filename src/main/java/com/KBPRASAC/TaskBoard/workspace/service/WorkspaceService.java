package com.KBPRASAC.TaskBoard.workspace.service;

import com.KBPRASAC.TaskBoard.workspace.entity.Workspace;

import java.util.List;

public interface WorkspaceService {

    List<Workspace> getAll();

    Workspace getById(Long id);

    Workspace create(Workspace workspace);

    Workspace update(Long id, Workspace workspace);

    void delete(Long id);
}