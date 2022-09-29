package com.example.baithi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AbcFitness {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int abcFitnessId;

    private String establishmentName;

    private String openingDay;
    private String address;

    @ManyToOne
    @JoinColumn(name = "employeeId", referencedColumnName = "employeeId")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "fitnessCardId", referencedColumnName = "fitnessCardId")
    private FitnessCard fitnessCard;

    public AbcFitness() {
    }

    public AbcFitness(int abcFitnessId, String establishmentName, String openingDay, String address, Employee employee, FitnessCard fitnessCard) {
        this.abcFitnessId = abcFitnessId;
        this.establishmentName = establishmentName;
        this.openingDay = openingDay;
        this.address = address;
        this.employee = employee;
        this.fitnessCard = fitnessCard;
    }

    public int getAbcFitnessId() {
        return abcFitnessId;
    }

    public void setAbcFitnessId(int abcFitnessId) {
        this.abcFitnessId = abcFitnessId;
    }

    public String getEstablishmentName() {
        return establishmentName;
    }

    public void setEstablishmentName(String establishmentName) {
        this.establishmentName = establishmentName;
    }

    public String getOpeningDay() {
        return openingDay;
    }

    public void setOpeningDay(String openingDay) {
        this.openingDay = openingDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public FitnessCard getFitnessCard() {
        return fitnessCard;
    }

    public void setFitnessCard(FitnessCard fitnessCard) {
        this.fitnessCard = fitnessCard;
    }
}
