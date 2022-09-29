package com.example.baithi.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FitnessCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fitnessCardId;

    @OneToMany(mappedBy = "fitnessCard", cascade = CascadeType.ALL)
    private Set<AbcFitness> abcFitness;

    private String customerName;
    private String customerIdCard;
    private String dateOfBirth;
    private int gender;
    private String registrationDate;
    private String expiry;

    public FitnessCard() {
    }

    public FitnessCard(int fitnessCardId, Set<AbcFitness> abcFitness, String customerName, String customerIdCard, String dateOfBirth, int gender, String registrationDate, String expiry) {
        this.fitnessCardId = fitnessCardId;
        this.abcFitness = abcFitness;
        this.customerName = customerName;
        this.customerIdCard = customerIdCard;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.registrationDate = registrationDate;
        this.expiry = expiry;
    }

    public int getFitnessCardId() {
        return fitnessCardId;
    }

    public void setFitnessCardId(int fitnessCardId) {
        this.fitnessCardId = fitnessCardId;
    }

    public Set<AbcFitness> getAbcFitness() {
        return abcFitness;
    }

    public void setAbcFitness(Set<AbcFitness> abcFitness) {
        this.abcFitness = abcFitness;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
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

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }
}
