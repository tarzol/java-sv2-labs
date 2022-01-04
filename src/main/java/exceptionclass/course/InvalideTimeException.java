package exceptionclass.course;

public class InvalideTimeException extends RuntimeException {

    public InvalideTimeException() {
    }

    public InvalideTimeException(String message) {
        super(message);
    }
}
