package patterns.state;

/**
 * Created by juanamari on 9/4/16.
 */
public class NotEnoughFundsException extends Exception{
    public NotEnoughFundsException(String message){
        super(message);
    }
}
