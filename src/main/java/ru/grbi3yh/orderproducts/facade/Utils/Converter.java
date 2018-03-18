package ru.grbi3yh.orderproducts.facade.Utils;

import ru.grbi3yh.orderproducts.service.DTOs.OrderDto;
import ru.grbi3yh.orderproducts.repositories.entities.Order;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class Converter {

    public OrderDto OrdersToDto(Order order){
        return new OrderDto();
    }

    public Order DtoToOrders(OrderDto Dto){
        return new Order();
    }

}
