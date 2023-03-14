package de.iprotex.polyglotpersistence.api.exceptions;

public class NotUniqueException extends PolyglotPersistenceException {

    private static final long serialVersionUID = 2533972983660156933L;

    public NotUniqueException(String message) {
        super(message);
    }
}
