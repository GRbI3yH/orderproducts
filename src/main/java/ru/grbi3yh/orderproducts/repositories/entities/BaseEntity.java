package ru.grbi3yh.orderproducts.repositories.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import java.util.UUID;

public class BaseEntity {

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @PrePersist
    public void genId() {
        if (getId() == null) {
            setId(UUID.randomUUID().toString());
        }
    }
}
