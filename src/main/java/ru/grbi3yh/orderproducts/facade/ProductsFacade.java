package ru.grbi3yh.orderproducts.facade;

import ru.grbi3yh.orderproducts.repositories.ProductCriteria;
import ru.grbi3yh.orderproducts.repositories.entities.Product;

import javax.ejb.Local;
import java.util.List;


public interface ProductsFacade {

    List<Product> getProductsByCriteria(ProductCriteria productCriteria);

    Product getProducts(String id);

    void createProduct(Product product);

    String getTest();
}
