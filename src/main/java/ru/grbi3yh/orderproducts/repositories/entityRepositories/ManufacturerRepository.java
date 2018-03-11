package ru.grbi3yh.orderproducts.repositories.entityRepositories;

import ru.grbi3yh.orderproducts.repositories.RepositoryImpl;
import ru.grbi3yh.orderproducts.repositories.entities.Manufacturer;

import java.util.List;

public class ManufacturerRepository extends RepositoryImpl<Manufacturer> {

    protected ManufacturerRepository() {
        super(Manufacturer.class);
    }
}
