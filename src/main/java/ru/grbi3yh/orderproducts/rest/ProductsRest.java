package ru.grbi3yh.orderproducts.rest;

import ru.grbi3yh.orderproducts.facade.ProductsFacade;
import ru.grbi3yh.orderproducts.repositories.ProductCriteria;
import ru.grbi3yh.orderproducts.repositories.entities.Product;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/Products")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Stateless
public class ProductsRest {

    @EJB(name = "ProductsFacade")
    private ProductsFacade productsFacade;

    @GET
    @Path("/{guid}")
    public Product getProducts(@PathParam("guid")String id) {
        return productsFacade.getProducts(id);
    }

    @POST
    @Path("/getProductsByCriteria")
    public List<Product> getProductsByCriteria(ProductCriteria criteria) {
        return productsFacade.getProductsByCriteria(criteria);
    }

    @POST
    @Path("/getProductsByCriteria")
    public void createProduct(Product product){
        productsFacade.createProduct(product);
    }

    @POST
    @Path("/getTest")
    public String getTest(){
        return productsFacade.getTest();
    }
}
