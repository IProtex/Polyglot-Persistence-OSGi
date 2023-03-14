package de.iprotex.polyglotpersistence.api.datamodels.repository;

import de.iprotex.polyglotpersistence.api.datamodels.entity.AbstractEntity;
import de.iprotex.polyglotpersistence.api.identifiers.IUniqueId;

import java.util.List;

public interface IAbstractRepository<E extends AbstractEntity> {

    void create(E entity);

    E find(IUniqueId id);

    List<E> findAll();

    void update(E entity);

    void delete(IUniqueId id);
}
