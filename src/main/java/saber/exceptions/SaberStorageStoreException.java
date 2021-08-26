package saber.exceptions;

/**
 * A custom exception class to indicate storing tasks to storage error
 */
public class SaberStorageStoreException extends SaberException {

    /**
     * A constructor for SaberStorageStoreException
     * @param message the error message
     */
    public SaberStorageStoreException(String message) {
        super(message);
    }
}
