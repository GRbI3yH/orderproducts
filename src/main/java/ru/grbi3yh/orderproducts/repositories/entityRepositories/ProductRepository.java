package ru.grbi3yh.orderproducts.repositories.entityRepositories;

import ru.grbi3yh.orderproducts.repositories.RepositoryImpl;
import ru.grbi3yh.orderproducts.repositories.entities.Product;

public class ProductRepository extends RepositoryImpl<Product> {

    protected ProductRepository() {
        super(Product.class);
    }
}
