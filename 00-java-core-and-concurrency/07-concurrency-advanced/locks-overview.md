# Locks Overview in Java

## 🧠 What are Locks?

Locks are used to **control access to shared resources** in multithreading.

👉 They provide more control than `synchronized`

---

## 🔑 Key Idea

> Only one thread can access critical section at a time

---

## ⚡ Why Not Only synchronized?

* Less flexible
* No advanced features
* Hard to control locking behavior

👉 Locks provide:

* Try lock
* Timeout
* Interruptible locking

---

## ⚡ ReentrantLock

### Features

* Explicit locking mechanism
* More flexible than synchronized
* Same thread can acquire lock multiple times

---

### Example

```java id="7xv5gr"
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

## ⚡ tryLock()

* Attempts to acquire lock without blocking

```java id="b0x7z5"
if (lock.tryLock()) {
    try {
        System.out.println("Lock acquired");
    } finally {
        lock.unlock();
    }
}
```

---

## ⚡ tryLock with Timeout

```java id="n9m2qp"
if (lock.tryLock(1, TimeUnit.SECONDS)) {
    try {
        System.out.println("Lock acquired");
    } finally {
        lock.unlock();
    }
}
```

---

## ⚡ ReadWriteLock

### Features

* Separate locks for read and write
* Multiple readers allowed
* Only one writer

---

### Example

```java id="4x2ybg"
ReadWriteLock rwLock = new ReentrantReadWriteLock();

rwLock.readLock().lock();
rwLock.readLock().unlock();

rwLock.writeLock().lock();
rwLock.writeLock().unlock();
```

---

## ⚡ synchronized vs Lock

| Feature       | synchronized | Lock (ReentrantLock) |
| ------------- | ------------ | -------------------- |
| Flexibility   | Less         | More                 |
| Try lock      | No           | Yes                  |
| Timeout       | No           | Yes                  |
| Manual unlock | No           | Yes                  |

---

## ⚠️ Important Points

* Always release lock in finally block
* Avoid deadlocks
* Prefer Lock for complex scenarios

---

## ⚡ Real-World Usage

* Banking systems
* Concurrent data processing
* High-performance applications

---

## 🎯 Interview Questions

**Q1: What is ReentrantLock?**  
A: Advanced locking mechanism.

**Q2: Difference between synchronized and Lock?**  
A: Lock is more flexible.

**Q3: What is tryLock()?**  
A: Attempts to acquire lock without waiting.

**Q4: What is ReadWriteLock?**  
A: Separate locks for read and write.

---

## 📌 Summary

* Locks provide better control than synchronized
* ReentrantLock is most used
* Supports tryLock and timeout
* Important for advanced concurrency
