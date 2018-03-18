package ru.grbi3yh.orderproducts.repositories;

import ru.grbi3yh.orderproducts.repositories.entities.BaseEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

import static java.util.Objects.isNull;

public abstract class RepositoryImpl<E extends BaseEntity> implements Repository<E> {

    @PersistenceContext(unitName = "EntityManager")
    private EntityManager em;

    private final Class<E> entityClass;

    protected RepositoryImpl(Class<? extends BaseEntity> entityClass) {
        this.entityClass = (Class<E>) entityClass;
    }

    public E save(E entity) {

        if (isNew(entity)) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Override
    public E getById(String id) {
        return em.find(entityClass, id);
    }

    @Override
    public void remove(String id) {
        E entity = em.find(entityClass, id);
        if (isNull(entity)) throw new IllegalArgumentException("Entity is not found");
        em.remove(entity);
    }

    protected CriteriaBuilder getCriteriaBuilder(){
        return em.getCriteriaBuilder();
    }

    protected Query createQuery(String createQuery){
        return em.createQuery(createQuery);
    }

    private boolean isNew(E entity) {
        return isNull(entity.getId());
    }
}
