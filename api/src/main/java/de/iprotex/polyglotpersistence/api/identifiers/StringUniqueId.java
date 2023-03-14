package de.iprotex.polyglotpersistence.api.identifiers;

import java.util.Objects;

public final class StringUniqueId implements IUniqueId {

    private static final long serialVersionUID = -5677909190319159440L;

    private final String id;

    public StringUniqueId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        StringUniqueId that = (StringUniqueId) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "StringUniqueId{" +
                "id='" + id + '\'' +
                '}';
    }
}
