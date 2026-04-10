# Thread Basics in Java

## 🧠 What is a Thread?

A thread is the **smallest unit of execution** within a program.

👉 Java supports **multithreading**, allowing multiple threads to run concurrently.

---

## 🔑 Key Idea

> A process can have multiple threads running independently

---

## ⚡ Process vs Thread

| Feature       | Process             | Thread            |
| ------------- | ------------------- | ----------------- |
| Definition    | Independent program | Part of a process |
| Memory        | Separate memory     | Shared memory     |
| Cost          | High                | Low               |
| Communication | Slow                | Fast              |

---

## ⚡ What is Multithreading?

Multithreading allows a program to **execute multiple tasks simultaneously**.

---

### Example

* Downloading file
* Playing video
* Updating UI

👉 All happening at the same time

---

## ⚡ Why Multithreading?

* Better performance
* Efficient CPU utilization
* Faster execution
* Responsive applications

---

## ⚡ Java Thread Model

* Threads share same memory
* Each thread has its own:

  * Stack
  * Program counter

---

## ⚡ Main Thread

Every Java program starts with a **main thread**

```java id="3h2w3c"
public class Demo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
    }
}
```

---

## ⚠️ Important Points

* Threads run concurrently, not necessarily parallel
* Thread scheduling is handled by JVM
* Multiple threads can access shared data

---

## ⚡ Single Thread vs Multithreading

| Feature     | Single Thread | Multithreading |
| ----------- | ------------- | -------------- |
| Execution   | Sequential    | Concurrent     |
| Performance | Slower        | Faster         |
| Complexity  | Simple        | Complex        |

---

## ⚡ Real-World Usage

* Web servers
* Gaming
* Banking systems
* Background tasks

---

## 🎯 Interview Questions

**Q1: What is a thread?**  
A: Smallest unit of execution.

**Q2: Difference between process and thread?**  
A: Process → independent, Thread → part of process.

**Q3: What is multithreading?**  
A: Running multiple threads simultaneously.

**Q4: Does Java support multithreading?**  
A: Yes.

---

## 📌 Summary

* Thread = unit of execution
* Multithreading improves performance
* Threads share memory
* Core concept for backend systems
