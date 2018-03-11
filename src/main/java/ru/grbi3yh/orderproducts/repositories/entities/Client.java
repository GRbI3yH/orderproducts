package ru.grbi3yh.orderproducts.repositories.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Клиент
 */
@Entity
@Table(name = "client", schema = "orderProducts")
public class Client extends BaseEntity {

    //ФИО
    @Column(name = "status")
    private String fio;

    //Адрес
    @Column(name = "address",nullable = false)
    private String address;

    //Телефон
    @Column(name = "phone",nullable = false)
    private Integer phone;

    //Email
    @Column(name = "email")
    private String email;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
