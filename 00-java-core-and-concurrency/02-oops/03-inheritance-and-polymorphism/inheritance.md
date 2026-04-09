# Inheritance in Java

## 🧠 What is Inheritance?

Inheritance is a mechanism in Java where one class **acquires the properties and methods of another class**.

👉 It represents an **"is-a" relationship**

---

## 🔑 Key Idea

> Reuse existing code instead of writing it again.

---

## ⚡ Syntax

```java
class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
}
```

---

## ⚡ Example

```java
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();   // inherited method
        d.bark();  // own method
    }
}
```

---

## ⚡ Types of Inheritance in Java

### 1. Single Inheritance

```java
A → B
```

---

### 2. Multilevel Inheritance

```java
A → B → C
```

---

### 3. Hierarchical Inheritance

```java
      A
     / \
    B   C
```

---

### ❌ Multiple Inheritance (Not Supported with Classes)

```java
A + B → C ❌
```

👉 Java avoids this to prevent ambiguity

---

## ⚡ super Keyword

Used to refer to **parent class**

### Access parent method

```java
super.methodName();
```

### Call parent constructor

```java
super();
```

---

### Example

```java
class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    Dog() {
        super();
        System.out.println("Dog constructor");
    }
}
```

---

## ⚡ Method Overriding

Child class provides its own implementation of parent method

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
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

## ⚠️ Important Rules

* Use `extends` keyword
* Child class inherits public and protected members
* private members are not inherited
* Constructor is not inherited

---

## ⚡ Real-World Example

* Animal → Dog
* Vehicle → Car

👉 Dog *is an* Animal
👉 Car *is a* Vehicle

---

## 🎯 Why it matters (Interview)

* Core pillar of OOPS
* Used in:

  * Code reuse
  * Framework design
* Frequently asked:

  * Types of inheritance
  * Method overriding

---

## 🎯 Interview Questions

**Q1: What is inheritance?**  
A: Mechanism where one class acquires properties of another.

**Q2: Why is multiple inheritance not supported?**  
A: To avoid ambiguity (diamond problem).

**Q3: What is super keyword?**  
A: Used to access parent class members.

**Q4: Are constructors inherited?**  
A: No.

---

## 📌 Summary

* Inheritance enables code reuse
* Uses `extends` keyword
* Supports multiple types except multiple inheritance (classes)
* Important for building scalable systems
