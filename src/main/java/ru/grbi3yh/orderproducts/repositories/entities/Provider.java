package ru.grbi3yh.orderproducts.repositories.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Поставщик
 */
@Entity
@Table(name = "provider", schema = "orderProducts")
public class Provider extends BaseEntity {

    //Наименование
    @Column(name = "name",nullable = false)
    private String name;

    //Юр. адрес
    @Column(name = "address")
    private String address;

    //контактная информация
    @Column(name = "contactInfo")
    private String contactInfo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
