package ru.grbi3yh.orderproducts.repositories.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Производитель
 */
@Entity
@Table(name = "manufacturer", schema = "orderProducts")
public class Manufacturer extends BaseEntity {

    //Наименование
    @Column(name = "name", nullable = false)
    private String name;

    // Страна
    @Column(name = "country")
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
