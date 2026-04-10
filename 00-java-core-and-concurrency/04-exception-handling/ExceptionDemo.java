// Custom Exception
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionDemo {

    // Method using throws
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // throw keyword
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("Eligible");
        }
    }

    public static void main(String[] args) {

        // Basic Exception
        try {
            int a = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println();

        // Multiple Catch
        try {
            int arr[] = new int[5];
            System.out.println(arr[10]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index Error");
        }

        System.out.println();

        // finally block
        try {
            int x = 5 / 0;
        } catch (Exception e) {
            System.out.println("Exception occurred");
        } finally {
            System.out.println("Finally block executed");
        }

        System.out.println();

        // Custom Exception
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}