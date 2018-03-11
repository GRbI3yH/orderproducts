package ru.grbi3yh.orderproducts.repositories.entities;

import javax.persistence.*;

/**
 * Категория
 */
@Entity
@Table(name = "category", schema = "orderProducts")
public class Category extends BaseEntity {

    //Наименование
    @Column(name = "name", nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
