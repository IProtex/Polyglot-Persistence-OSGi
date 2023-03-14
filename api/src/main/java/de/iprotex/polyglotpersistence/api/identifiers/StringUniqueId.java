package de.iprotex.polyglotpersistence.api.identifiers;

import de.iprotex.polyglotpersistence.api.exceptions.NotUniqueException;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class StringUniqueId implements IUniqueId {

    private static final long serialVersionUID = -5677909190319159440L;

    private static final Set<String> UNIQUE_IDS = new HashSet<>();

    private final String id;

    public StringUniqueId(String id) throws NotUniqueException {
        if (!UNIQUE_IDS.add(id))
            throw new NotUniqueException(String.format("ID '%s' is not unique!", id));

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
