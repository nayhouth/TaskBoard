package com.KBPRASAC.TaskBoard.unit.entity;

import com.KBPRASAC.TaskBoard.department.entity.Department;
import com.corebackend.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "unit")
public class Unit extends BaseEntity {

    private String unitName;

    private String unitCode;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}