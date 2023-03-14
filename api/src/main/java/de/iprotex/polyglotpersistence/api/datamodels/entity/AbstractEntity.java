package de.iprotex.polyglotpersistence.api.datamodels.entity;

import de.iprotex.polyglotpersistence.api.identifiers.IUniqueId;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public abstract class AbstractEntity implements Serializable {

    private static final long serialVersionUID = 5277839019084822107L;

    protected final IUniqueId id;

    protected final Instant storageTime;

    protected AbstractEntity(IUniqueId id) {
        this.id = id;
        this.storageTime = Instant.now();
    }

    public IUniqueId getId() {
        return id;
    }

    public Instant getStorageTime() {
        return storageTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AbstractEntity that = (AbstractEntity) o;
        return id.equals(that.id) && storageTime.equals(that.storageTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, storageTime);
    }

    @Override
    public String toString() {
        return "AbstractEntity{" +
                "id=" + id +
                ", storageTime=" + storageTime +
                '}';
    }
}
