import java.io.*;
import java.util.Scanner;

public class PaymentSystem {
    private double balance = 5000.0;

    // Method declaring a custom checked exception
    public void withdraw(double amount) throws InsufficientFundsException {
        System.out.println("Attempting to withdraw: UGX " + amount);
        
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New Balance: UGX " + balance);
        } else {
            // Throwing the exception when business rules are violated
            throw new InsufficientFundsException("Error: Balance is too low for this transaction.");
        }
    }

    // File handling using modern try-with-resources
    public void readFileWithResources(String fileName) {
        File file = new File(fileName);
        
        // try-with-resources automatically closes the resource
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error: The file could not be found.");
        }
    }

    public static void main(String[] args) {
        PaymentSystem sys = new PaymentSystem();
        try {
            // This will trigger the custom exception
            sys.withdraw(10000.0); 
        } catch (InsufficientFundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}