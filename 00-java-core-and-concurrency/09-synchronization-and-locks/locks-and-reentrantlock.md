# Locks and ReentrantLock in Java

## 🧠 What are Locks?

Locks are used to **control access to shared resources**, similar to `synchronized`, but with **more flexibility**.

---

## 🔑 Key Idea

> Locks give manual control over locking and unlocking

---

## ⚡ ReentrantLock

`ReentrantLock` is a class that implements the `Lock` interface.

👉 “Reentrant” means:

* Same thread can acquire the lock multiple times

---

## ⚡ Basic Example

```java
import java.util.concurrent.locks.*;

Lock lock = new ReentrantLock();

lock.lock();

try {
    System.out.println("Critical section");
} finally {
    lock.unlock();
}
```

---

## ⚡ Why Use ReentrantLock?

* More control than synchronized
* Can try to acquire lock
* Supports timeout
* Can interrupt waiting thread

---

## ⚡ tryLock()

```java
if (lock.tryLock()) {
    try {
        System.out.println("Lock acquired");
    } finally {
        lock.unlock();
    }
}
```

👉 Does not block if lock is unavailable

---

## ⚡ tryLock with Timeout

```java
if (lock.tryLock(2, TimeUnit.SECONDS)) {
    try {
        System.out.println("Lock acquired");
    } finally {
        lock.unlock();
    }
}
```

---

## ⚡ Reentrant Behavior

```java
lock.lock();
lock.lock(); // allowed

lock.unlock();
lock.unlock();
```

---

## ⚡ Fair Lock

```java
Lock lock = new ReentrantLock(true);
```

👉 Ensures threads get lock in order

---

## ⚡ synchronized vs ReentrantLock

| Feature       | synchronized | ReentrantLock |
| ------------- | ------------ | ------------- |
| Flexibility   | Less         | More          |
| tryLock       | No           | Yes           |
| Timeout       | No           | Yes           |
| Interruptible | No           | Yes           |
| Manual unlock | No           | Yes           |

---

## ⚠️ Important Points

* Always unlock in finally block
* Forgetting unlock → deadlock
* Prefer for complex scenarios

---

## ⚡ Real-World Usage

* Banking systems
* High-concurrency applications
* Resource management

---

## 🎯 Interview Questions

**Q1: What is ReentrantLock?**  
A: Advanced locking mechanism.

**Q2: Why use it over synchronized?**  
A: More flexibility and control.

**Q3: What is tryLock()?**  
A: Non-blocking lock attempt.

**Q4: What is fair lock?**  
A: Lock given in order of request.

---

## 📌 Summary

* ReentrantLock provides advanced control
* Supports tryLock and timeout
* More flexible than synchronized
* Important for high-level concurrency
