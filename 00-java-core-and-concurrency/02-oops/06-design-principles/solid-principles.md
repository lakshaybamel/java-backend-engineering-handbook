# SOLID Principles in Java

## 🧠 What are SOLID Principles?

SOLID is a set of **5 design principles** used to write **clean, maintainable, and scalable code**.

---

## 🔑 Full Form

* S → Single Responsibility Principle
* O → Open/Closed Principle
* L → Liskov Substitution Principle
* I → Interface Segregation Principle
* D → Dependency Inversion Principle

---

## ⚡ 1. Single Responsibility Principle (SRP)

> A class should have only **one reason to change**

---

### ❌ Bad Example

```java
class User {
    void saveUser() {}
    void sendEmail() {}
}
```

👉 One class doing multiple things

---

### ✅ Good Example

```java
class UserService {
    void saveUser() {}
}

class EmailService {
    void sendEmail() {}
}
```

---

## ⚡ 2. Open/Closed Principle (OCP)

> Class should be **open for extension, closed for modification**

---

### ❌ Bad Example

```java
class Payment {
    void pay(String type) {
        if (type.equals("UPI")) {}
        else if (type.equals("CARD")) {}
    }
}
```

---

### ✅ Good Example

```java
interface Payment {
    void pay();
}

class UpiPayment implements Payment {
    public void pay() {}
}

class CardPayment implements Payment {
    public void pay() {}
}
```

---

## ⚡ 3. Liskov Substitution Principle (LSP)

> Subclass should be replaceable with parent class

---

### ❌ Bad Example

```java
class Bird {
    void fly() {}
}

class Ostrich extends Bird {
    void fly() {
        throw new RuntimeException();
    }
}
```

---

### ✅ Good Example

```java
class Bird {}

class FlyingBird extends Bird {
    void fly() {}
}

class Ostrich extends Bird {}
```

---

## ⚡ 4. Interface Segregation Principle (ISP)

> Do not force classes to implement unused methods

---

### ❌ Bad Example

```java
interface Worker {
    void work();
    void eat();
}
```

---

### ✅ Good Example

```java
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}
```

---

## ⚡ 5. Dependency Inversion Principle (DIP)

> Depend on **abstractions**, not concrete classes

---

### ❌ Bad Example

```java
class Light {
    void turnOn() {}
}

class Switch {
    Light light = new Light();
}
```

---

### ✅ Good Example

```java
interface Switchable {
    void turnOn();
}

class Light implements Switchable {
    public void turnOn() {}
}

class Switch {
    Switchable device;

    Switch(Switchable device) {
        this.device = device;
    }
}
```

---

## ⚡ Why SOLID?

* Improves code readability
* Makes system scalable
* Reduces bugs
* Easier to maintain

---

## 🎯 Why it matters (Interview)

* Very common in:

  * Backend interviews
  * System design rounds
* Shows strong understanding of:

  * Code design
  * Architecture

---

## 🎯 Interview Questions

**Q1: What is SOLID?**  
A: Set of 5 design principles.

**Q2: Which principle improves flexibility most?**  
A: Dependency Inversion Principle.

**Q3: What does SRP mean?**  
A: One class → one responsibility.

**Q4: Why use interfaces in OCP?**  
A: To extend behavior without modifying code.

---

## 📌 Summary

* SOLID improves design quality
* Encourages clean and scalable code
* Important for real-world development
* Must-know for interviews
