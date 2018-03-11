package ru.grbi3yh.orderproducts.facade;

import ru.grbi3yh.orderproducts.repositories.DTOs.EmailFioKeyDto;
import ru.grbi3yh.orderproducts.repositories.entities.Order;

import java.util.List;

public interface OrdersFacade {

    void createOrder(Order order);

    List<Order> getOrders(EmailFioKeyDto keyDto);

    void canceledOrders(String id);
}
