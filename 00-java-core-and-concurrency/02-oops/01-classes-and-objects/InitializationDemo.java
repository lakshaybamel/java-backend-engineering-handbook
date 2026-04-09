public class InitializationDemo {

    // Instance variable
    int x = 10;

    // Instance Initialization Block (IIB)
    {
        System.out.println("Instance Initialization Block executed");
        x = 20;
    }

    // Constructor
    InitializationDemo() {
        System.out.println("Constructor executed");
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) {

        System.out.println("Creating first object:");
        InitializationDemo obj1 = new InitializationDemo();

        System.out.println("\nCreating second object:");
        InitializationDemo obj2 = new InitializationDemo();
    }
}