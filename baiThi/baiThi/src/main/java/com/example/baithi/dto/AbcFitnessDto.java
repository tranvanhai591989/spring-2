package com.example.baithi.dto;

import com.example.baithi.model.Employee;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.lang.annotation.Annotation;

public class AbcFitnessDto implements Validator {

    private int abcFitnessId;

    @NotBlank(message = "Không được để trống")
    private String establishmentName;

    @NotBlank(message = "Không được để trống")
    private String openingDay;

    @NotBlank(message = "Không được để trống")
    private String address;

    @NotNull(message = "Không được để trống")
    private Employee employee;

    public AbcFitnessDto() {
    }

    public AbcFitnessDto(int abcFitnessId, String establishmentName, String openingDay, String address, Employee employee) {
        this.abcFitnessId = abcFitnessId;
        this.establishmentName = establishmentName;
        this.openingDay = openingDay;
        this.address = address;
        this.employee = employee;
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

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
