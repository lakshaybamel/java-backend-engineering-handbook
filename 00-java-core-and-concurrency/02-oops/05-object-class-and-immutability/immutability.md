# Immutability in Java

## 🧠 What is Immutability?

Immutability means an object’s **state cannot be changed after it is created**.

👉 Once initialized, the object remains constant.

---

## 🔑 Key Idea

> Create objects whose data cannot be modified

---

## ⚡ Why Immutability?

* Thread-safe (no synchronization needed)
* Safe from unintended changes
* Easier to debug
* Can be cached and reused

---

## ⚡ How to Create Immutable Class

To make a class immutable:

1. Declare the class as `final`
2. Make all fields `private`
3. Make fields `final`
4. Initialize fields via constructor
5. Do not provide setters
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

## ⚡ Usage

```java
Student s = new Student("Lakshay", 22);

// No setter → cannot modify object
```

---

## ⚠️ Handling Mutable Fields (Important)

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

👉 Prevents external modification

---

## ⚡ String Example

```java
String s = "Hello";
s = s + " World";
```

👉 A new object is created, original remains unchanged

---

## ⚡ Mutable vs Immutable

| Feature     | Mutable    | Immutable     |
| ----------- | ---------- | ------------- |
| State       | Can change | Cannot change |
| Safety      | Less safe  | More safe     |
| Thread-safe | No         | Yes           |

---

## ⚠️ Important Points

* No setters in immutable class
* Always use defensive copying for mutable fields
* String is a common immutable class

---

## ⚡ Real-World Usage

Used in:

* Multithreading
* Caching systems
* Security-sensitive data

---

## 🎯 Why it matters (Interview)

* Frequently asked:

  * How to create immutable class
  * Why String is immutable
* Important for:

  * Thread safety
  * System design

---

## 🎯 Interview Questions

**Q1: What is immutability?**  
A: Object state cannot be changed after creation.

**Q2: Why immutable classes are thread-safe?**  
A: No modification → no race conditions.

**Q3: How to handle mutable fields?**  
A: Defensive copying.

**Q4: Is String immutable? Why?**  
A: Yes, for security and performance.

---

## 📌 Summary

* Immutable objects cannot change after creation
* Improve safety and performance
* Created using final + private + no setters
* Important for multithreading and design
