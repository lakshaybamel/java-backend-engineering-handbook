public class MethodDemo {

    // Method with return value
    static int add(int a, int b) {
        return a + b;
    }

    // Method without return value
    static void greet() {
        System.out.println("Hello, Welcome!");
    }

    // Instance method
    void showMessage() {
        System.out.println("This is an instance method");
    }

    public static void main(String[] args) {

        // Calling static methods
        int result = add(5, 3);
        System.out.println("Sum: " + result);

        greet();

        // Calling instance method
        MethodDemo obj = new MethodDemo();
        obj.showMessage();
    }
}