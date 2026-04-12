# Immutability Pattern in Java

## 🧠 What is Immutability Pattern?

Immutability pattern ensures that **object state cannot be changed after creation**.

---

## 🔑 Key Idea

> Create objects that are read-only after initialization

---

## ⚡ Why Immutability?

* Thread-safe by default
* No synchronization required
* Prevents accidental modification
* Easier debugging

---

## ⚡ How to Create Immutable Class

1. Make class `final`
2. Make fields `private`
3. Make fields `final`
4. Initialize via constructor
5. No setters
6. Return copies for mutable objects

---

## ⚡ Example

```java
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

## ⚠️ Handling Mutable Fields

```java
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

---

## ⚡ Immutability vs Mutability

| Feature     | Mutable    | Immutable     |
| ----------- | ---------- | ------------- |
| State       | Can change | Cannot change |
| Thread-safe | No         | Yes           |
| Safety      | Less       | High          |

---

## ⚡ Real-World Example

```java
String s = "Hello";
s = s + " World";
```

👉 String is immutable

---

## ⚡ Benefits

* Safe in multithreading
* Can be cached
* Improves performance in some cases

---

## ⚠️ Important Points

* No setters allowed
* Use defensive copying
* Prefer immutability for shared data

---

## ⚡ Real-World Usage

* String class
* Configuration objects
* DTOs

---

## 🎯 Interview Questions

**Q1: What is immutability?**  
A: Object cannot change after creation.

**Q2: Why immutable objects are thread-safe?**  
A: No modification → no race condition.

**Q3: How to create immutable class?**  
A: final + private + no setters.

**Q4: Why String is immutable?**  
A: Security and performance.

---

## 📌 Summary

* Immutable objects cannot change
* Automatically thread-safe
* Important design pattern
* Used in real-world systems
