package de.iprotex.polyglotpersistence.api.datamodels.entity;

import de.iprotex.polyglotpersistence.api.datamodels.DataModelType;
import de.iprotex.polyglotpersistence.api.identifiers.IUniqueId;

import java.util.Objects;

public abstract class RelationalEntity extends AbstractEntity {

    private static final long serialVersionUID = 7610749359269873517L;

    protected final DataModelType dataModelType = DataModelType.RELATIONAL;

    protected RelationalEntity(IUniqueId id) {
        super(id);
    }

    public DataModelType getDataModelType() {
        return dataModelType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        if (!super.equals(o)) {
            return false;
        }

        RelationalEntity that = (RelationalEntity) o;
        return dataModelType == that.dataModelType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dataModelType);
    }

    @Override
    public String toString() {
        return "RelationalEntity{" +
                "dataModelType=" + dataModelType +
                ", id=" + id +
                ", storageTime=" + storageTime +
                '}';
    }
}
