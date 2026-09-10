package com.KBPRASAC.TaskBoard.workspace.entity;

import com.KBPRASAC.TaskBoard.user.entity.User;
import com.corebackend.entity.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(
        name = "workspace_member",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uk_workspace_member",
                        columnNames = {"workspace_id", "user_id"}
                )
        }
)
public class WorkspaceMember extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "workspace_id", nullable = false)
    private Workspace workspace;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private WorkspaceRole role;

    public Workspace getWorkspace() {
        return workspace;
    }

    public void setWorkspace(Workspace workspace) {
        this.workspace = workspace;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public WorkspaceRole getRole() {
        return role;
    }

    public void setRole(WorkspaceRole role) {
        this.role = role;
    }
}