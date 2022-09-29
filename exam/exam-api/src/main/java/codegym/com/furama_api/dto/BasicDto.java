package codegym.com.furama_api.dto;

import codegym.com.furama_api.model.Employee;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class BasicDto {
    private Integer id;

    @NotBlank(message = "Không được để trống")
    private String nameB;

    @NotNull(message = "Không được để trống")
    private String dayOpen;

    @NotBlank(message = "Không được để trống")
    private String address;

    private Employee employee;

    public BasicDto() {
    }

    public BasicDto(Integer id, String nameB, String dayOpen, String address, Employee employee) {
        this.id = id;
        this.nameB = nameB;
        this.dayOpen = dayOpen;
        this.address = address;
        this.employee = employee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameB() {
        return nameB;
    }

    public void setNameB(String nameB) {
        this.nameB = nameB;
    }

    public String getDayOpen() {
        return dayOpen;
    }

    public void setDayOpen(String dayOpen) {
        this.dayOpen = dayOpen;
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
}
