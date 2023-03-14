package de.iprotex.polyglotpersistence.api.datamodels.entity;

import de.iprotex.polyglotpersistence.api.datamodels.DataModelType;
import de.iprotex.polyglotpersistence.api.identifiers.IUniqueId;

import java.util.Objects;

public abstract class DocumentOrientedEntity extends AbstractEntity {

    private static final long serialVersionUID = 1355368595490879808L;

    protected final DataModelType dataModelType = DataModelType.DOCUMENT_ORIENTED;

    protected DocumentOrientedEntity(IUniqueId id) {
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

        DocumentOrientedEntity that = (DocumentOrientedEntity) o;
        return dataModelType == that.dataModelType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dataModelType);
    }

    @Override
    public String toString() {
        return "DocumentOrientedEntity{" +
                "dataModelType=" + dataModelType +
                ", id=" + id +
                ", storageTime=" + storageTime +
                '}';
    }
}
