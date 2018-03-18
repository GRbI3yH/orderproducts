package ru.grbi3yh.orderproducts.facade.impl;

import ru.grbi3yh.orderproducts.facade.OrdersFacade;
import ru.grbi3yh.orderproducts.service.DTOs.EmailFioKeyDto;
import ru.grbi3yh.orderproducts.service.DTOs.OrderDto;
import ru.grbi3yh.orderproducts.repositories.entities.Order;
import ru.grbi3yh.orderproducts.service.OrdersService;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import java.util.List;

@Local
@Stateless(name = "OrdersFacade")
public class OrdersFacadeImpl implements OrdersFacade {

    @EJB(name = "OrdersService")
    private OrdersService ordersService;


    @Override
    public void createOrder(OrderDto order) {
        ordersService.createOrder(order);
    }

    @Override
    public List<Order> getOrders(EmailFioKeyDto keyDto) {
        return ordersService.getOrders(keyDto);
    }

    @Override
    public void canceledOrders(String id) {
        ordersService.canceledOrders(id);
    }
}
