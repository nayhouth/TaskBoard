package com.KBPRASAC.TaskBoard.workspace.repository;

import com.KBPRASAC.TaskBoard.workspace.entity.Workspace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkspaceRepository extends JpaRepository<Workspace, Long> {
}