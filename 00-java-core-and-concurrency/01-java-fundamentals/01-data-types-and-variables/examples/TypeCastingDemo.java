public class TypeCastingDemo {
    public static void main(String[] args) {

        // Implicit casting (Widening)
        int a = 10;
        double b = a;  // int -> double

        System.out.println("Implicit Casting:");
        System.out.println("int value: " + a);
        System.out.println("double value: " + b);

        // Explicit casting (Narrowing)
        double x = 9.75;
        int y = (int) x;  // double -> int

        System.out.println("\nExplicit Casting:");
        System.out.println("double value: " + x);
        System.out.println("int value: " + y);

        // Type promotion
        byte m = 5;
        byte n = 10;

        int result = m + n; // promoted to int

        System.out.println("\nType Promotion:");
        System.out.println("Result: " + result);
    }
}