# Synchronization in Java

## 🧠 What is Synchronization?

Synchronization is used to **control access to shared resources** in multithreading.

👉 Ensures that only **one thread executes critical section at a time**

---

## 🔑 Key Idea

> Prevent race conditions when multiple threads access shared data

---

## ⚡ What is Race Condition?

When multiple threads **modify shared data simultaneously**, leading to incorrect results.

---

### Example (Problem)

```java
class Counter {
    int count = 0;

    void increment() {
        count++;
    }
}
```

👉 Not thread-safe

---

## ⚡ Solution: synchronized

### Method Level

```java
class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}
```

---

### Block Level

```java
synchronized(this) {
    count++;
}
```

---

## ⚡ How synchronized Works

* Uses **intrinsic lock (monitor)**
* Only one thread can acquire lock at a time

---

## ⚡ Static Synchronization

```java
synchronized static void method() {}
```

👉 Lock applied on class level

---

## ⚡ Example

```java
class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

public class Demo {
    public static void main(String[] args) throws Exception {

        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count: " + c.count);
    }
}
```

---

## ⚠️ Important Points

* Only one thread enters synchronized block
* Reduces concurrency (performance impact)
* Avoid over-synchronization

---

## ⚡ synchronized vs volatile

| Feature    | synchronized | volatile |
| ---------- | ------------ | -------- |
| Visibility | Yes          | Yes      |
| Atomicity  | Yes          | No       |
| Locking    | Yes          | No       |

---

## ⚡ Real-World Usage

* Shared counters
* Banking transactions
* Inventory systems

---

## 🎯 Interview Questions

**Q1: What is synchronization?**  
A: Controlling access to shared resources.

**Q2: What is race condition?**  
A: Multiple threads modifying shared data.

**Q3: Difference between synchronized and volatile?**  
A: synchronized ensures atomicity, volatile does not.

**Q4: What is intrinsic lock?**  
A: Lock used by synchronized.

---

## 📌 Summary

* Synchronization prevents race conditions
* Uses intrinsic locking
* Ensures thread safety
* Important for concurrent programming
