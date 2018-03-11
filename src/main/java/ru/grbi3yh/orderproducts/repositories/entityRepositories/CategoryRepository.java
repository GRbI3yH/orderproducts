package ru.grbi3yh.orderproducts.repositories.entityRepositories;

import ru.grbi3yh.orderproducts.repositories.RepositoryImpl;
import ru.grbi3yh.orderproducts.repositories.entities.Category;

public class CategoryRepository extends RepositoryImpl<Category> {

    protected CategoryRepository() {
        super(Category.class);
    }
}
