package ru.grbi3yh.orderproducts.repositories.entityRepositories;

import ru.grbi3yh.orderproducts.repositories.RepositoryImpl;
import ru.grbi3yh.orderproducts.repositories.entities.Order;

public class OrderRepository extends RepositoryImpl<Order> {

    protected OrderRepository() {
        super(Order.class);
    }
}
