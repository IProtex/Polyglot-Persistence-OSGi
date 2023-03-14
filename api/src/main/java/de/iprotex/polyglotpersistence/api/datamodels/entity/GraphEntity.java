package de.iprotex.polyglotpersistence.api.datamodels.entity;

import de.iprotex.polyglotpersistence.api.datamodels.DataModelType;
import de.iprotex.polyglotpersistence.api.identifiers.IUniqueId;

import java.util.Objects;

public abstract class GraphEntity extends AbstractEntity {

    private static final long serialVersionUID = -6367901152969304279L;

    protected final DataModelType dataModelType = DataModelType.GRAPH;

    protected GraphEntity(IUniqueId id) {
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

        GraphEntity that = (GraphEntity) o;
        return dataModelType == that.dataModelType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dataModelType);
    }

    @Override
    public String toString() {
        return "GraphEntity{" +
                "dataModelType=" + dataModelType +
                ", id=" + id +
                ", storageTime=" + storageTime +
                '}';
    }
}
