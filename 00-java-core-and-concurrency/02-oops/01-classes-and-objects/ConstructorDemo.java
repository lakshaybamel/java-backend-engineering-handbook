public class ConstructorDemo {

    String name;
    int age;

    // Default constructor
    ConstructorDemo() {
        System.out.println("Default Constructor Called");
    }

    // Parameterized constructor
    ConstructorDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor overloading
    ConstructorDemo(String name) {
        this(name, 0); // constructor chaining
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {

        // Default constructor
        ConstructorDemo obj1 = new ConstructorDemo();

        // Parameterized constructor
        ConstructorDemo obj2 = new ConstructorDemo("Lakshay", 22);

        // Constructor chaining
        ConstructorDemo obj3 = new ConstructorDemo("Rahul");

        obj2.display();
        obj3.display();
    }
}