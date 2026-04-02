public class RecursionDemo {

    // Factorial using recursion
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Fibonacci using recursion
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        int num = 5;

        System.out.println("Factorial of " + num + ": " + factorial(num));
        System.out.println("Fibonacci of " + num + ": " + fibonacci(num));
    }
}