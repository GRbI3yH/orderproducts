package ru.grbi3yh.orderproducts.service.impl;

import ru.grbi3yh.orderproducts.facade.Utils.Converter;
import ru.grbi3yh.orderproducts.service.DTOs.EmailFioKeyDto;
import ru.grbi3yh.orderproducts.service.DTOs.OrderDto;
import ru.grbi3yh.orderproducts.repositories.entities.Order;
import ru.grbi3yh.orderproducts.repositories.entities.Status;
import ru.grbi3yh.orderproducts.repositories.entityRepositories.OrderRepository;
import ru.grbi3yh.orderproducts.service.OrdersService;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Local
@Stateless(name = "OrdersService")
public class OrdersServiceImpl implements OrdersService {

    @Inject
    private OrderRepository orderRepository;

    @Inject
    private Converter converter;

    @Override
    public void createOrder(OrderDto order) {
        orderRepository.save(converter.DtoToOrders(order));
    }

    @Override
    public List<Order> getOrders(EmailFioKeyDto keyDto) {
        return null;
    }

    @Override
    public void canceledOrders(String id) {
        Order order = orderRepository.getById(id);
        order.setStatus(Status.CANCELED);
        orderRepository.save(order);
    }
}
