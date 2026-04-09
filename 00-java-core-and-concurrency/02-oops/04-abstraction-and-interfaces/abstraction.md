# Abstraction in Java

## 🧠 What is Abstraction?

Abstraction is the concept of **hiding implementation details and showing only essential features** to the user.

👉 Focus is on **what to do**, not **how to do**

---

## 🔑 Key Idea

> Hide internal details and expose only required functionality

---

## ⚡ How Abstraction is Achieved

In Java, abstraction is achieved using:

* Abstract classes
* Interfaces

---

## ⚡ Abstract Class

An abstract class is a class that **cannot be instantiated** and may contain:

* Abstract methods (no body)
* Concrete methods (with body)

---

### ⚡ Example

```java
abstract class Animal {

    abstract void sound(); // abstract method

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

---

## ⚡ Usage

```java
Animal a = new Dog();

a.sound(); // Dog barks
a.eat();   // Animal is eating
```

---

## ⚠️ Important Rules

* Cannot create object of abstract class
* Must implement all abstract methods in child class
* Can have constructors and variables
* Can have both abstract and non-abstract methods

---

## ⚡ Real-World Example

ATM Machine:

* You interact with options like:

  * Withdraw
  * Deposit

👉 You don’t see internal implementation

---

## 🎯 Why it matters (Interview)

* Core pillar of OOPS
* Used in:

  * Frameworks
  * API design
* Frequently asked:

  * Abstract class vs interface

---

## 🎯 Interview Questions

**Q1: What is abstraction?**  
A: Hiding implementation details and showing only functionality.

**Q2: How is abstraction achieved in Java?**  
A: Using abstract classes and interfaces.

**Q3: Can we create object of abstract class?**  
A: No.

**Q4: Can abstract class have constructor?**  
A: Yes.

---

## 📌 Summary

* Abstraction hides internal implementation
* Achieved using abstract classes and interfaces
* Focuses on behavior, not implementation
* Improves code design and flexibility
