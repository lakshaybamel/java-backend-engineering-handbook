public class OverloadingDemo {

    // Method overloading: different number of parameters
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method overloading: different data types
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        OverloadingDemo obj = new OverloadingDemo();

        System.out.println("Add 2 numbers: " + obj.add(2, 3));
        System.out.println("Add 3 numbers: " + obj.add(2, 3, 4));
        System.out.println("Add doubles: " + obj.add(2.5, 3.5));
    }
}