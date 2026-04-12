# Deadlock in Java

## 🧠 What is Deadlock?

Deadlock occurs when **two or more threads are waiting for each other indefinitely**, and none can proceed.

---

## 🔑 Key Idea

> Each thread holds a resource and waits for another → infinite waiting

---

## ⚡ Example

```java
class DeadlockDemo {

    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock1");

                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (lock2) {
                    System.out.println("Thread 1: Holding lock2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding lock2");

                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (lock1) {
                    System.out.println("Thread 2: Holding lock1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
```

👉 Both threads wait forever

---

## ⚡ Conditions for Deadlock

Deadlock occurs when all 4 conditions are true:

1. Mutual Exclusion → resource used by one thread
2. Hold and Wait → thread holds one, waits for another
3. No Preemption → resource cannot be taken away
4. Circular Wait → cycle of waiting

---

## ⚡ Deadlock Visualization

```text
Thread 1 → holds Lock1 → waiting for Lock2
Thread 2 → holds Lock2 → waiting for Lock1
```

---

## ⚡ How to Prevent Deadlock

### 1. Lock Ordering

```java
synchronized (lock1) {
    synchronized (lock2) {
        // always same order
    }
}
```

---

### 2. tryLock()

```java
if (lock1.tryLock()) {
    if (lock2.tryLock()) {
        // safe execution
    }
}
```

---

### 3. Timeout

* Use `tryLock(timeout)`
* Avoid infinite waiting

---

### 4. Avoid Nested Locks

* Reduce dependency between locks

---

## ⚠️ Important Points

* Deadlock freezes program
* Hard to debug
* Happens in multi-resource locking

---

## ⚡ Real-World Usage

* Database transactions
* Resource allocation systems
* Multithreaded servers

---

## 🎯 Interview Questions

**Q1: What is deadlock?**  
A: Threads waiting forever for each other.

**Q2: Conditions for deadlock?**  
A: Mutual exclusion, hold & wait, no preemption, circular wait.

**Q3: How to prevent deadlock?**  
A: Lock ordering, tryLock, timeout.

**Q4: Is deadlock detectable?**  
A: Difficult but possible using tools.

---

## 📌 Summary

* Deadlock = infinite waiting
* Caused by circular dependency
* Prevent using proper locking strategies
* Critical interview topic
