package Lesson8.Exceptions;

public class CreateException extends Exception{
    public CreateException() {
        super();
    }

    public CreateException(String message) {
        super(message);
    }

    public CreateException(String message, Throwable cause) {
        super(message, cause);
    }

    public CreateException(Throwable cause) {
        super(cause);
    }
}
