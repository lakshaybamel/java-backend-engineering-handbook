public class OperatorsDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Arithmetic
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));

        // Relational
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));

        // Logical
        System.out.println("a > 5 && b < 10: " + (a > 5 && b < 10));

        // Bitwise
        System.out.println("a & b: " + (a & b));

        // Ternary
        int max = (a > b) ? a : b;
        System.out.println("Max: " + max);
    }
}