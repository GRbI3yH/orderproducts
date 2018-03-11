package ru.grbi3yh.orderproducts.rest;

import ru.grbi3yh.orderproducts.facade.OrdersFacade;
import ru.grbi3yh.orderproducts.repositories.DTOs.EmailFioKeyDto;
import ru.grbi3yh.orderproducts.repositories.entities.Order;

import java.util.List;

public class OrderRest {

    private OrdersFacade ordersFacade;

    public void canceledOrders(String id) {
        ordersFacade.canceledOrders(id);
    }

    public void createOrder(Order order) {
        ordersFacade.createOrder(order);
    }

    public List<Order> getOrders(EmailFioKeyDto keyDto) {
        return ordersFacade.getOrders(keyDto);
    }
}
