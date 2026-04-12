# wait() and notify() in Java

## 🧠 What are wait() and notify()?

`wait()` and `notify()` are used for **communication between threads**.

👉 Defined in `Object` class

---

## 🔑 Key Idea

> One thread waits → another thread notifies

---

## ⚡ wait()

* Causes thread to **release lock and wait**
* Must be called inside synchronized block

---

### Example

```java
synchronized (obj) {
    obj.wait();
}
```

---

## ⚡ notify()

* Wakes up one waiting thread

```java
synchronized (obj) {
    obj.notify();
}
```

---

## ⚡ notifyAll()

* Wakes up all waiting threads

```java
obj.notifyAll();
```

---

## ⚡ Example (Producer-Consumer)

```java
class Shared {
    int data;
    boolean available = false;

    synchronized void produce(int value) throws Exception {
        while (available) {
            wait();
        }
        data = value;
        available = true;
        System.out.println("Produced: " + value);
        notify();
    }

    synchronized void consume() throws Exception {
        while (!available) {
            wait();
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify();
    }
}
```

---

## ⚡ Flow

```text
Thread 1 → wait() → releases lock
Thread 2 → notify() → wakes Thread 1
Thread 1 → resumes execution
```

---

## ⚠️ Important Rules

* Must be used inside synchronized block
* wait() releases lock
* sleep() does NOT release lock
* Always use while loop (not if)

---

## ⚡ wait() vs sleep()

| Feature      | wait()        | sleep()         |
| ------------ | ------------- | --------------- |
| Lock release | Yes           | No              |
| Class        | Object        | Thread          |
| Purpose      | Communication | Pause execution |

---

## ⚡ Real-World Usage

* Producer-consumer problem
* Thread coordination
* Resource sharing

---

## 🎯 Interview Questions

**Q1: What does wait() do?**  
A: Releases lock and waits.

**Q2: Difference between wait() and sleep()?**  
A: wait releases lock, sleep does not.

**Q3: What is notify()?**  
A: Wakes one waiting thread.

**Q4: Why use while instead of if?**  
A: To avoid spurious wakeups.

---

## 📌 Summary

* wait() and notify() enable thread communication
* Must be used inside synchronized block
* Core concept for coordination
* Important for concurrency problems
