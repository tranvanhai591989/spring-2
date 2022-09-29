package com.example.baithi.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;

    private String employeeName;
    private String dateOfBirth;
    private int gender;


    @ManyToOne
    @JoinColumn(name = "positionId", referencedColumnName = "positionID")
    private Position position;


    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private Set<AbcFitness> abcFitness;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, String dateOfBirth, int gender, Position position, Set<AbcFitness> abcFitness) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.position = position;
        this.abcFitness = abcFitness;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Set<AbcFitness> getAbcFitness() {
        return abcFitness;
    }

    public void setAbcFitness(Set<AbcFitness> abcFitness) {
        this.abcFitness = abcFitness;
    }
}
