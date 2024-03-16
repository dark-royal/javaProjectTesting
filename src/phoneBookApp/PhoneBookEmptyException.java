package phoneBookApp;

public class PhoneBookEmptyException extends RuntimeException{
    public PhoneBookEmptyException(String message){
        super(message);
    }
}
