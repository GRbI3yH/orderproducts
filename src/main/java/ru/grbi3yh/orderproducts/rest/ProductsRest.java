package ru.grbi3yh.orderproducts.rest;

import ru.grbi3yh.orderproducts.facade.ProductsFacade;
import ru.grbi3yh.orderproducts.repositories.ProductCriteria;
import ru.grbi3yh.orderproducts.repositories.entities.Product;

import java.util.List;

public class ProductsRest {
    private ProductsFacade productsFacade;

    public Product getProducts(String id) {
        return productsFacade.getProducts(id);
    }

    public List<Product> getProductsByCriteria(ProductCriteria criteria) {
        return productsFacade.getProductsByCriteria(criteria);
    }
}
