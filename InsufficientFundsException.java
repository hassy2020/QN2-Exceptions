// Custom Checked Exception extending the built-in Exception class
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}