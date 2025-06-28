package exceptions;

public class MultipleBotsException extends RuntimeException {
    public MultipleBotsException(String message) {
        super(message);
    }
}
