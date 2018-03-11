package ru.grbi3yh.orderproducts.facade.impl;

import ru.grbi3yh.orderproducts.facade.OrdersFacade;
import ru.grbi3yh.orderproducts.repositories.DTOs.EmailFioKeyDto;
import ru.grbi3yh.orderproducts.repositories.entities.Order;

import java.util.List;

public class OrdersFacadeImpl implements OrdersFacade {

    @Override
    public void createOrder(Order order) {

    }

    @Override
    public List<Order> getOrders(EmailFioKeyDto keyDto) {
        return null;
    }

    @Override
    public void canceledOrders(String id) {

    }
}
