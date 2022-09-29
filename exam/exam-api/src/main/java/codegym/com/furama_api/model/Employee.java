package codegym.com.furama_api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String code;
    private String name;
    private String birthDay;
    private String gender;

    @ManyToOne
    @JoinColumn(name = "id_p", referencedColumnName = "id")
    private Position position;

    @JsonIgnore
    @OneToMany(mappedBy = "employee")
    private Set<Basic> basicSet;


    public Employee() {
    }

    public Employee(Integer id, String code, String name, String birthDay, String gender, Position position) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.position = position;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
