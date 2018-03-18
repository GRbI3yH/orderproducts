package ru.grbi3yh.orderproducts.rest;

import ru.grbi3yh.orderproducts.facade.OrdersFacade;
import ru.grbi3yh.orderproducts.service.DTOs.EmailFioKeyDto;
import ru.grbi3yh.orderproducts.service.DTOs.OrderDto;
import ru.grbi3yh.orderproducts.repositories.entities.Order;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/Orders")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Stateless
public class OrdersRest {

    @EJB(name = "OrdersFacade")
    private OrdersFacade ordersFacade;

    @GET
    @Path("/{guid}")
    public void canceledOrders(@PathParam("guid")String id) {
        ordersFacade.canceledOrders(id);
    }

    @POST
    @Path("/create")
    public void createOrder(OrderDto order) {
        ordersFacade.createOrder(order);
    }

    @POST
    @Path("/getByEmailFioKey")
    public List<Order> getOrders(EmailFioKeyDto keyDto) {
        return ordersFacade.getOrders(keyDto);
    }
}
