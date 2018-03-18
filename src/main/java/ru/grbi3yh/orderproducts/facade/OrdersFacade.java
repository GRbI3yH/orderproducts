package ru.grbi3yh.orderproducts.facade;

import ru.grbi3yh.orderproducts.service.DTOs.EmailFioKeyDto;
import ru.grbi3yh.orderproducts.service.DTOs.OrderDto;
import ru.grbi3yh.orderproducts.repositories.entities.Order;

import javax.ejb.Local;
import java.util.List;


public interface OrdersFacade {

    void createOrder(OrderDto order);

    List<Order> getOrders(EmailFioKeyDto keyDto);

    void canceledOrders(String id);
}
