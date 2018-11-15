package com.inmobi.thriftself.service.dao.impl;

import com.google.inject.Provider;
import com.inmobi.thriftself.service.dao.Dao;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


import static java.util.Collections.EMPTY_LIST;
import static org.apache.commons.collections4.CollectionUtils.isEmpty;


@Slf4j
public class AbstractDaoImpl<T, Id> implements Dao<T, Id> {

    @Getter
    private final Class<T> entityClass;

    private final Provider<EntityManager> entityManagerProvider;
    private final String primaryKeyName;

    AbstractDaoImpl(Provider<EntityManager> entityManagerProvider, Class<T> entityClass) {
        Objects.requireNonNull(entityManagerProvider);
        Objects.requireNonNull(entityClass);
        this.entityManagerProvider = entityManagerProvider;
        this.entityClass = entityClass;
        this.primaryKeyName = "index";
    }


    EntityManager getEntityManager() {
        return entityManagerProvider.get();
    }

    @Override
    public T getById(Id id) {
        Objects.requireNonNull(id);
        return getEntityManager().find(entityClass, id);
    }


    @Override
    public void save(final T entity) {
        getEntityManager().merge(entity);
    }


    @Override
    public void save(final List<T> entities) {
        final EntityManager em = getEntityManager();
        for (final T entity : entities) {
            log.debug("Entity is {}", entity);
            if (!em.contains(entity)) {
                log.debug("Persisting Entity {}", entity);
                em.persist(entity);
            }
        }
    }


    @Override
    public void update(final T entity) {
        EntityManager em = getEntityManager();
        em.merge(entity);
    }


    @Override
    public void update(final List<T> entities) {
        EntityManager em = getEntityManager();
        for (final T entity : entities) {
            em.merge(entity);
        }
    }


    @Override
    public void saveOrUpdate(final List<T> entities) {
        for (final T entity : entities) {
            if (!getEntityManager().contains(entity)) {
                getEntityManager().persist(entity);
            } else {
                getEntityManager().merge(entity);
            }
        }
    }

    @Override
    public List<T> getByIds(final Collection<Id> ids) {
        if(isEmpty(ids)) {
            return EMPTY_LIST;
        }

        final EntityManager em = getEntityManager();
        final CriteriaBuilder cb = em.getCriteriaBuilder();
        final CriteriaQuery<T> criteriaQuery = cb.createQuery(entityClass);
        final Root<T> root = criteriaQuery.from(entityClass);
        criteriaQuery.select(root);
        criteriaQuery.where(root.get(primaryKeyName).in(ids));
        return em.createQuery(criteriaQuery).getResultList();
    }
}
