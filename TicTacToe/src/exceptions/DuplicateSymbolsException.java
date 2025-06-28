package exceptions;

public class DuplicateSymbolsException extends RuntimeException{
    public DuplicateSymbolsException(String ex)
    {
        System.out.println(ex);
    }
}
