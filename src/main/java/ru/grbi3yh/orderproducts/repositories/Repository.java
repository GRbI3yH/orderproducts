package ru.grbi3yh.orderproducts.repositories;

import ru.grbi3yh.orderproducts.repositories.entities.BaseEntity;

import java.util.List;

public interface Repository<E extends BaseEntity>{

    E save(E entity);

    E getById(String id);

    void remove(String id);
}
