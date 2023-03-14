package de.iprotex.polyglotpersistence.api.identifiers;

import java.io.Serializable;

public interface IUniqueId extends Serializable {

    boolean equals(Object o);

    int hashCode();

    String toString();
}
