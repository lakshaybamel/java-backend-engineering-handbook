class Animal {

    Animal() {
        System.out.println("Animal constructor");
    }

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    Dog() {
        super(); // calling parent constructor
        System.out.println("Dog constructor");
    }

    void bark() {
        System.out.println("Dog is barking");
    }

    // Method overriding
    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        System.out.println("Creating Dog object:");
        Dog d = new Dog();

        System.out.println();

        d.eat();   // overridden method
        d.bark();  // child method
    }
}