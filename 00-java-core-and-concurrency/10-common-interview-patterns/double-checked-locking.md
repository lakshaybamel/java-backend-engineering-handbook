# Double-Checked Locking in Java

## 🧠 What is Double-Checked Locking?

Double-Checked Locking (DCL) is used to **reduce synchronization overhead** in Singleton pattern.

---

## 🔑 Key Idea

> Check twice before creating object to avoid unnecessary synchronization

---

## ⚡ Problem with Fully Synchronized Singleton

```java
public static synchronized Singleton getInstance() {
    if (instance == null) {
        instance = new Singleton();
    }
    return instance;
}
```

❌ Issue:

* Synchronization happens every time
* Slower performance

---

## ⚡ Double-Checked Locking Solution

```java
class Singleton {

    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {

        if (instance == null) { // First check

            synchronized (Singleton.class) {

                if (instance == null) { // Second check
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
```

---

## ⚡ Why Two Checks?

1. First check → avoid locking if instance already exists
2. Second check → ensure only one instance is created

---

## ⚡ Why volatile is Required?

```java
private static volatile Singleton instance;
```

👉 Prevents instruction reordering

---

## ⚡ Without volatile (Problem)

Steps during object creation:

```text
1. Allocate memory
2. Assign reference
3. Initialize object
```

👉 Reordering may cause:

* Other thread sees partially initialized object

---

## ⚡ Benefits

* Thread-safe
* Better performance than synchronized method
* Lazy initialization

---

## ⚠️ Important Points

* volatile is mandatory
* Complex to understand
* Not preferred over simpler approaches

---

## ⚡ Alternatives (Better)

* Bill Pugh Singleton
* Enum Singleton

---

## ⚡ Real-World Usage

* Lazy-loaded singleton
* Performance-critical systems

---

## 🎯 Interview Questions

**Q1: What is Double-Checked Locking?**  
A: Optimization for Singleton to reduce synchronization.

**Q2: Why two checks?**  
A: To avoid unnecessary locking.

**Q3: Why use volatile?**  
A: Prevent instruction reordering.

**Q4: Is it preferred?**  
A: Less than Bill Pugh/Enum.

---

## 📌 Summary

* Double-checked locking improves performance
* Requires volatile keyword
* Prevents multiple instance creation
* Important but tricky concept
