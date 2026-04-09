// Abstract class
abstract class Animal {

    // abstract method
    abstract void sound();

    // concrete method
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Interface
interface Pet {
    void play();
}

// Child class
class Dog extends Animal implements Pet {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}

// Another child class
class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {

        // Using abstract class reference
        Animal a1 = new Dog();
        a1.sound();
        a1.eat();

        System.out.println();

        Animal a2 = new Cat();
        a2.sound();
        a2.eat();

        System.out.println();

        // Using interface reference
        Pet p = new Dog();
        p.play();
    }
}