# Polymorphism in Java

## 🧠 What is Polymorphism?

Polymorphism means **"many forms"**.

👉 In Java, it allows a method to **behave differently based on the object or parameters**.

---

## 🔑 Types of Polymorphism

### 1. Compile-Time Polymorphism (Static Binding)

Achieved using **method overloading**

---

### 2. Runtime Polymorphism (Dynamic Binding)

Achieved using **method overriding**

---

## ⚡ 1. Compile-Time Polymorphism (Method Overloading)

Same method name with different parameters

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

👉 Decided at **compile time**

---

## ⚡ 2. Runtime Polymorphism (Method Overriding)

Child class overrides parent method

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

## ⚡ Dynamic Method Dispatch

```java
Animal a = new Dog();
a.sound();
```

👉 Output: `Dog barks`

👉 Decision is made at **runtime**

---

## ⚡ Upcasting

```java
Animal a = new Dog();
```

* Parent reference → Child object
* Common in runtime polymorphism

---

## ⚡ Downcasting

```java
Dog d = (Dog) a;
```

* Converts parent reference back to child
* Must be done carefully

---

## ⚡ Method Overloading vs Overriding

| Feature     | Overloading  | Overriding |
| ----------- | ------------ | ---------- |
| Binding     | Compile-time | Runtime    |
| Method Name | Same         | Same       |
| Parameters  | Different    | Same       |
| Inheritance | Not required | Required   |

---

## ⚠️ Rules for Method Overriding

* Method name must be same
* Parameters must be same
* Cannot reduce access level
* Cannot override static methods

---

## ⚡ Real-World Example

* Payment system:

  * CreditCardPayment
  * UpiPayment

👉 Same method → different behavior

---

## 🎯 Why it matters (Interview)

* Core OOPS concept
* Used in:

  * Frameworks
  * APIs
* Frequently asked:

  * Overloading vs overriding
  * Runtime polymorphism

---

## 🎯 Interview Questions

**Q1: What is polymorphism?**  
A: Ability of a method to take multiple forms.

**Q2: Types of polymorphism?**  
A: Compile-time and runtime.

**Q3: What is dynamic method dispatch?**  
A: Runtime decision of method call.

**Q4: Difference between overloading and overriding?**  
A: Overloading → compile-time, overriding → runtime.

---

## 📌 Summary

* Polymorphism = many forms
* Achieved via overloading and overriding
* Enables flexible and dynamic behavior
* Important for scalable applications
