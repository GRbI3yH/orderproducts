package ru.grbi3yh.orderproducts.service.impl;

import ru.grbi3yh.orderproducts.repositories.ProductCriteria;
import ru.grbi3yh.orderproducts.repositories.entities.Product;
import ru.grbi3yh.orderproducts.repositories.entityRepositories.ProductRepository;
import ru.grbi3yh.orderproducts.service.ProductsService;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Local
@Stateless(name = "ProductsService")
public class ProductsServiceImpl implements ProductsService {

    @Inject
    private ProductRepository productRepository;

    @Override
    public List<Product> getProductsByCriteria(ProductCriteria productCriteria) {
        return null;
    }

    @Override
    public Product getProducts(String id) {
        return productRepository.getById(id);
    }

    @Override
    public void createProduct(Product order) {
        productRepository.save(order);
    }

    @Override
    public String getTest() {
        return "я текст";
    }
}
