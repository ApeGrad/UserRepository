package Lesson8.Exceptions;

public class RegistrationException extends Exception {
    public static final String MESSAGE_INVALID_LOGIN =  "Invalid login";
    public static final String MESSAGE_INVALID_PASS = "Invalid pass";

    public RegistrationException() {
        super();
    }

    public RegistrationException(String message) {
        super(message);
    }

    public RegistrationException(String message, Throwable cause) {
        super(message, cause);
    }

    public RegistrationException(Throwable cause) {
        super(cause);
    }
}
