package ru.grbi3yh.orderproducts.facade.impl;

import ru.grbi3yh.orderproducts.facade.ProductsFacade;
import ru.grbi3yh.orderproducts.repositories.ProductCriteria;
import ru.grbi3yh.orderproducts.repositories.entities.Product;

import java.util.List;

public class ProductsFacadeImpl implements ProductsFacade{

    @Override
    public List<Product> getProductsByCriteria(ProductCriteria productCriteria) {
        return null;
    }

    @Override
    public Product getProducts(String id) {
        return null;
    }
}
