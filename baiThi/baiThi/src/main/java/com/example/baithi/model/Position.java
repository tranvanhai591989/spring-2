package com.example.baithi.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int positionId;
    private String positionName;

    @OneToMany(mappedBy = "position", cascade = CascadeType.ALL)
    private Set<Employee> employeeSet;

    public Position() {
    }

    public Position(int positionId, String positionName, Set<Employee> employeeSet) {
        this.positionId = positionId;
        this.positionName = positionName;
        this.employeeSet = employeeSet;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }
}
