# Interfaces in Java

## 🧠 What is an Interface?

An interface is a blueprint of a class that contains **abstract methods** (by default) and defines **what a class should do**.

👉 It is used to achieve **100% abstraction**

---

## 🔑 Key Idea

> Interface defines behavior, not implementation

---

## ⚡ Syntax

```java
interface Animal {
    void sound(); // abstract method
}
```

---

## ⚡ Implementation

```java
class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
```

---

## ⚡ Usage

```java
Animal a = new Dog();
a.sound();
```

---

## ⚡ Features of Interface

* Methods are **public and abstract by default**
* Variables are **public, static, and final**
* Cannot create object of interface
* Class uses `implements` keyword

---

## ⚡ Multiple Inheritance (Supported)

```java
interface A {
    void show();
}

interface B {
    void display();
}

class Demo implements A, B {
    public void show() {}
    public void display() {}
}
```

👉 Java supports multiple inheritance using interfaces

---

## ⚡ Default Methods (Java 8)

```java
interface Demo {
    default void show() {
        System.out.println("Default method");
    }
}
```

---

## ⚡ Static Methods (Java 8)

```java
interface Demo {
    static void display() {
        System.out.println("Static method");
    }
}
```

---

## ⚡ Functional Interface

Interface with **only one abstract method**

```java
@FunctionalInterface
interface Demo {
    void run();
}
```

👉 Used in **lambda expressions**

---

## ⚡ Marker Interface

Interface with **no methods**

Example:

* Serializable
* Cloneable

👉 Used to mark a class

---

## ⚡ Interface vs Abstract Class (Quick View)

| Feature     | Interface           | Abstract Class      |
| ----------- | ------------------- | ------------------- |
| Methods     | Abstract by default | Abstract + concrete |
| Inheritance | Multiple            | Single              |
| Variables   | final, static       | Any type            |

---

## ⚠️ Important Rules

* Class must implement all methods
* Methods must be `public`
* Cannot instantiate interface

---

## 🎯 Why it matters (Interview)

* Core for:

  * System design
  * APIs
* Frequently asked:

  * Interface vs abstract class
  * Functional interfaces

---

## 🎯 Interview Questions

**Q1: What is an interface?**  
A: Blueprint with abstract methods.

**Q2: Can interface have methods with body?**  
A: Yes (default and static methods).

**Q3: What is functional interface?**  
A: Interface with one abstract method.

**Q4: Why multiple inheritance is allowed in interface?**  
A: No ambiguity like classes.

---

## 📌 Summary

* Interface defines behavior
* Supports multiple inheritance
* Used for abstraction
* Important in modern Java (lambda, streams)
