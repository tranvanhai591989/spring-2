package codegym.com.furama_api.model;

import javax.persistence.*;

@Entity
public class Basic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nameB;
    private String dayOpen;
    private String address;

    @ManyToOne
    @JoinColumn(name = "id_e", referencedColumnName = "id")
    private Employee employee;

    public Basic() {
    }

    public Basic(Integer id, String nameB, String dayOpen, String address, Employee employee) {
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
