# Thread-Safe Singleton in Java

## 🧠 What is Singleton?

Singleton is a design pattern where **only one instance of a class is created**.

---

## 🔑 Key Idea

> Ensure a class has only one object and provide global access to it

---

## ⚡ Basic Singleton (NOT Thread-Safe)

```java
class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

❌ Problem:

* Multiple threads may create multiple objects

---

## ⚡ Thread-Safe Singleton (Synchronized Method)

```java
class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

✔ Thread-safe  
❌ Slower (synchronization overhead)

---

## ⚡ Eager Initialization

```java
class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
```

✔ Thread-safe  
❌ Object created even if not used

---

## ⚡ Best Approach: Bill Pugh Singleton

```java
class Singleton {

    private Singleton() {}

    private static class Holder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }
}
```

✔ Lazy loading   
✔ Thread-safe  
✔ No synchronization overhead

---

## ⚡ Enum Singleton (Safest)

```java
enum Singleton {
    INSTANCE;
}
```

✔ Thread-safe  
✔ Prevents serialization and reflection issues

---

## ⚠️ Important Points

* Constructor must be private
* Static method provides instance
* Avoid multiple instance creation

---

## ⚡ Real-World Usage

* Logger
* Configuration manager
* Database connection

---

## 🎯 Interview Questions

**Q1: What is Singleton?**  
A: Single instance class.

**Q2: Is basic Singleton thread-safe?**  
A: No.

**Q3: Best implementation?**  
A: Bill Pugh or Enum.

**Q4: Why use Singleton?**  
A: To control object creation.

---

## 📌 Summary

* Singleton ensures single object
* Must be thread-safe in multithreading
* Best approaches: Bill Pugh, Enum
* Important design pattern
