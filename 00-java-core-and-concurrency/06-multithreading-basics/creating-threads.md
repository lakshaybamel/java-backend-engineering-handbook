# Creating Threads in Java

## 🧠 Overview

In Java, threads can be created in **two main ways**:

1. Extending Thread class
2. Implementing Runnable interface

---

## 🔑 Key Idea

> Runnable is preferred over extending Thread

---

## ⚡ 1. Extending Thread Class

### Example

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread using Thread class");
    }
}

public class Demo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
```

---

### ⚠️ Limitation

* Cannot extend another class (no multiple inheritance)

---

## ⚡ 2. Implementing Runnable Interface (Preferred)

### Example

```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable");
    }
}

public class Demo {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
```

---

## ⚡ Using Lambda (Java 8)

```java
Runnable r = () -> System.out.println("Thread using Lambda");

Thread t = new Thread(r);
t.start();
```

---

## ⚡ Thread Creation Flow

```text
Create object → pass to Thread → call start()
```

---

## ⚡ start() vs run()

| Method  | Behavior                   |
| ------- | -------------------------- |
| start() | Creates new thread         |
| run()   | Executes in current thread |

---

### Example

```java
Thread t = new Thread(() -> System.out.println("Hello"));

t.run();   // normal method call
t.start(); // new thread
```

---

## ⚠️ Important Points

* Always use start(), not run()
* Runnable is preferred
* Lambda simplifies code
* Thread class internally uses Runnable

---

## ⚡ Real-World Usage

* Background tasks
* Async processing
* Web servers

---

## 🎯 Interview Questions

**Q1: How many ways to create thread?**  
A: Two (Thread class, Runnable interface).

**Q2: Which is better?**  
A: Runnable.

**Q3: Difference between start() and run()?**  
A: start() creates new thread.

**Q4: Can we use lambda?**  
A: Yes.

---

## 📌 Summary

* Two ways to create threads
* Runnable is preferred
* start() is required to create new thread
* Important for concurrency programming
