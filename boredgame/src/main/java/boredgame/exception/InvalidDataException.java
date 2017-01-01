package boredgame.exception;

/**
 * Created by BERNARD7 on 31/12/2016.
 */
public class InvalidDataException extends RuntimeException {


    public InvalidDataException(String message) {
        super(message);
    }

    public InvalidDataException(String message, String[] formatArgs) {
        super(String.format(message, formatArgs));
    }
}
