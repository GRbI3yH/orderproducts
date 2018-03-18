package ru.grbi3yh.orderproducts.service;

import ru.grbi3yh.orderproducts.repositories.ProductCriteria;
import ru.grbi3yh.orderproducts.repositories.entities.Product;

import javax.ejb.Local;
import java.util.List;


public interface ProductsService {

    List<Product> getProductsByCriteria(ProductCriteria productCriteria);

    Product getProducts(String id);

    void createProduct(Product order);

    String getTest();
}
