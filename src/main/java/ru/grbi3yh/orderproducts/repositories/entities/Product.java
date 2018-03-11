package ru.grbi3yh.orderproducts.repositories.entities;

import javax.persistence.*;

/**
 * Товар
 */
@Entity
@Table(name = "product", schema = "orderProducts")
public class Product extends BaseEntity {

    //Код товара
    @Column(name = "code",nullable = false)
    private Integer code;

    // Нименование
    @Column(name = "name",nullable = false)
    private String name;

    // Поставщик
    @OneToOne
    private Provider provider;

    // Категория
    @OneToOne
    private Category category;

    // кол-во
    @Column(name = "amount")
    private Integer amount;

    // цена
    @Column(name = "price",nullable = false)
    private Double price;

    // Производитель
    @OneToOne
    private Manufacturer manufacturer;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
