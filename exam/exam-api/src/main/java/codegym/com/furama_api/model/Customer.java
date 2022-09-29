package codegym.com.furama_api.model;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String code;

    @ManyToOne
    @JoinColumn(name = "id_b", referencedColumnName = "id")
    private Basic basic;

    private String name;
    private String idCard;
    private String birthDay;
    private int gender;
    private String dayIn;
    private String dayOut;

    public Customer() {
    }

    public Customer(int id, String code, Basic basic, String name, String idCard, String birthDay, int gender, String dayIn, String dayOut) {
        this.id = id;
        this.code = code;
        this.basic = basic;
        this.name = name;
        this.idCard = idCard;
        this.birthDay = birthDay;
        this.gender = gender;
        this.dayIn = dayIn;
        this.dayOut = dayOut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Basic getBasic() {
        return basic;
    }

    public void setBasic(Basic basic) {
        this.basic = basic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getDayIn() {
        return dayIn;
    }

    public void setDayIn(String dayIn) {
        this.dayIn = dayIn;
    }

    public String getDayOut() {
        return dayOut;
    }

    public void setDayOut(String dayOut) {
        this.dayOut = dayOut;
    }
}
