package e_commerce;

import java.util.Date;

public class Customer {
    private String code;
    private String name;
    private String surname;
    private Date register;
    public Customer(String code, String name, String surname, Date register) {
        this.code = code;
        this.name = name;
        this.surname = surname;
        this.register= register;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getRegister() {
        return register;
    }

    public void setRegister(Date register) {
        this.register = register;
    }
}
