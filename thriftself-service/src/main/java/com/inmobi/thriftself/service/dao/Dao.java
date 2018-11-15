package com.inmobi.thriftself.service.dao;

import java.util.Collection;
import java.util.List;


public interface Dao<ENTITY, PK> {

    ENTITY getById(PK id);

    void save(final ENTITY entity);

    void save(final List<ENTITY> entity);

    void update(final ENTITY entity);

    void update(final List<ENTITY> entity);

    void saveOrUpdate(final List<ENTITY> entities);

    List<ENTITY> getByIds(final Collection<PK> ids);
}
