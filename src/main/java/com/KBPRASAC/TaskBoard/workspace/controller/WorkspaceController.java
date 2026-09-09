package com.KBPRASAC.TaskBoard.workspace.controller;

import com.KBPRASAC.TaskBoard.workspace.entity.Workspace;
import com.KBPRASAC.TaskBoard.workspace.service.WorkspaceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workspaces")
public class WorkspaceController {

    private final WorkspaceService workspaceService;

    public WorkspaceController(WorkspaceService workspaceService) {
        this.workspaceService = workspaceService;
    }

    @GetMapping
    public ResponseEntity<List<Workspace>> getAll() {
        return ResponseEntity.ok(workspaceService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Workspace> getById(
            @PathVariable Long id) {
        return ResponseEntity.ok(
                workspaceService.getById(id)
        );
    }

    @PostMapping
    public ResponseEntity<Workspace> create(
            @RequestBody Workspace workspace) {
        return ResponseEntity.ok(
                workspaceService.create(workspace)
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<Workspace> update(
            @PathVariable Long id,
            @RequestBody Workspace workspace) {
        return ResponseEntity.ok(
                workspaceService.update(id, workspace)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(
            @PathVariable Long id) {
        workspaceService.delete(id);
        return ResponseEntity.noContent().build();
    }
}