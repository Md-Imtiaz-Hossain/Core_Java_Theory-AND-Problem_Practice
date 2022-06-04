package Theory_Practice.Exception_Handling.CustomException;

public class InsufficientFundsException extends Exception {

    public InsufficientFundsException() {
        super("Insufficient Funds in us account, This massage is Created... ");
    }

    public InsufficientFundsException(String massage) {
        super(massage);
    }
}
