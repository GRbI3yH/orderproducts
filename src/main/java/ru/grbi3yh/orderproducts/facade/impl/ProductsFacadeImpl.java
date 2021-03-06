package ru.grbi3yh.orderproducts.facade.impl;

import ru.grbi3yh.orderproducts.facade.ProductsFacade;
import ru.grbi3yh.orderproducts.repositories.ProductCriteria;
import ru.grbi3yh.orderproducts.repositories.entities.Product;
import ru.grbi3yh.orderproducts.service.ProductsService;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import java.util.List;

@Local
@Stateless(name = "ProductsFacade")
public class ProductsFacadeImpl implements ProductsFacade{

    @EJB(name = "ProductsService")
    private ProductsService productsService;

    @Override
    public List<Product> getProductsByCriteria(ProductCriteria productCriteria) {
        return null;
    }

    @Override
    public Product getProducts(String id) {
        return productsService.getProducts(id);
    }

    @Override
    public void createProduct(Product product) {
        productsService.createProduct(product);
    }

    @Override
    public String getTest() {
        return productsService.getTest();
    }
}
