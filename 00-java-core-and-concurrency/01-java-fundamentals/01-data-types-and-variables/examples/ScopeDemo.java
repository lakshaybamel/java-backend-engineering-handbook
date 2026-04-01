class Demo {

    int instanceVar = 10;          // Instance variable
    static int staticVar = 20;     // Static variable

    void show() {
        int localVar = 5;          // Local variable

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }
}

public class ScopeDemo {
    public static void main(String[] args) {

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1.show();

        // Changing static variable using one object
        obj1.staticVar = 50;

        System.out.println("\nAfter modifying static variable:");
        System.out.println("obj1 staticVar: " + obj1.staticVar);
        System.out.println("obj2 staticVar: " + obj2.staticVar); // same value
    }
}