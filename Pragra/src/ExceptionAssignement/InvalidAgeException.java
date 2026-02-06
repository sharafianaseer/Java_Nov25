package ExceptionAssignement;

public class InvalidAgeException extends RuntimeException{

    InvalidAgeException(String message)
    {
        super(message);
    }

}
