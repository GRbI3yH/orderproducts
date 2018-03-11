package ru.grbi3yh.orderproducts.repositories.entityRepositories;

import ru.grbi3yh.orderproducts.repositories.RepositoryImpl;
import ru.grbi3yh.orderproducts.repositories.entities.Client;

import java.util.List;

public class ClientRepository extends RepositoryImpl<Client> {

    protected ClientRepository() {
        super(Client.class);
    }

}
