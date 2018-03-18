package ru.grbi3yh.orderproducts.service.DTOs;

import ru.grbi3yh.orderproducts.repositories.entities.Client;
import ru.grbi3yh.orderproducts.repositories.entities.Product;

public class OrderDto {

    Client client;

    Product product;

    Integer amount;

    Double price;

}
