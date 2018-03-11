package ru.grbi3yh.orderproducts.repositories.entities;

import javax.persistence.*;

/**
 * Заказ
 */
@Entity
@Table(name = "order", schema = "orderProducts")
public class Order extends BaseEntity {

    //Клиент
    @OneToOne
    private Client client;

    //Товар
    @OneToOne
    private Product product;

    //кол-во
    @Column(name = "amount",nullable = false)
    private Integer amount;

    //цена
    @Column(name = "price",nullable = false)
    private Double price;

    //статус
    @Enumerated(EnumType.STRING)
    private Status status;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
