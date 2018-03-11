package ru.grbi3yh.orderproducts.repositories.entityRepositories;

import ru.grbi3yh.orderproducts.repositories.RepositoryImpl;
import ru.grbi3yh.orderproducts.repositories.entities.Provider;

public class ProviderRepository extends RepositoryImpl<Provider>{

    protected ProviderRepository() {
        super(Provider.class);
    }
}
