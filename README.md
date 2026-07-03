# QN2-Exceptions

This project demonstrates Java Exception Handling, focusing on custom checked exceptions and robust resource management.

## How to Run
1. Open your terminal in the project directory.
2. Compile the files:
   `javac InsufficientFundsException.java PaymentSystem.java`
3. Run the system:
   `java PaymentSystem`

## Key Concepts
* **Custom Exceptions:** Extends the built-in `Exception` class to handle business-specific errors.
* **Try-with-resources:** Uses modern Java syntax to automatically close file resources, preventing memory leaks.
* **Finally Blocks:** Ensures critical cleanup code runs regardless of whether an exception occurs.
