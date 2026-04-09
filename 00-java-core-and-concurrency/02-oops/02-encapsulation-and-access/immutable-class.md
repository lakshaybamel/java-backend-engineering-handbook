# Immutable Class in Java

## 🧠 What is an Immutable Class?

An immutable class is a class **whose objects cannot be modified after creation**.

👉 Once an object is created, its state **cannot change**.

---

## 🔑 Key Characteristics

To make a class immutable:

1. Make the class `final`
2. Make all fields `private`
3. Do not provide setters
4. Initialize all fields through constructor
5. Return copies of mutable objects (if any)

---

## ⚡ Example (Immutable Class)

```java id="s4pxqv"
final class Student {

    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
```

---

## ⚡ Usage

```java id="9mjlwm"
Student s = new Student("Lakshay", 22);

// No way to modify object after creation
```

---

## ⚡ Mutable vs Immutable

| Feature      | Mutable Class | Immutable Class |
| ------------ | ------------- | --------------- |
| Modification | Allowed       | Not allowed     |
| Safety       | Less safe     | More safe       |
| Thread-safe  | No            | Yes             |

---

## ⚡ Why Immutable?

### 1. Thread Safety

* No synchronization required

### 2. Security

* Data cannot be changed

### 3. Caching

* Objects can be reused safely

---

## ⚡ Example with Mutable Field (Important)

```java id="d7g1n6"
final class Demo {
    private final int[] data;

    Demo(int[] data) {
        this.data = data.clone(); // defensive copy
    }

    public int[] getData() {
        return data.clone(); // return copy
    }
}
```

👉 Prevents external modification

---

## ⚡ Real-World Example

* `String` class in Java is immutable

```java id="kq6glf"
String s = "Hello";
s = s + " World"; // creates new object
```

---

## 🎯 Why it matters (Interview)

* Frequently asked:

  * How to create immutable class
  * Why String is immutable
* Used in:

  * Multithreading
  * Security-sensitive systems

---

## 🎯 Interview Questions

**Q1: What is an immutable class?**  
A: Class whose objects cannot be modified after creation.

**Q2: How to make a class immutable?**  
A: final class, private fields, no setters, constructor initialization.

**Q3: Why is String immutable?**  
A: For security, caching, and thread safety.

**Q4: How to handle mutable fields in immutable class?**  
A: Use defensive copying.

---

## 📌 Summary

* Immutable objects cannot change after creation
* Improve safety and performance
* Achieved using final + private + no setters
* Important for interviews and real-world systems
