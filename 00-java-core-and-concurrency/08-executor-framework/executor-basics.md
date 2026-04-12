# Executor Framework Basics in Java

## 🧠 What is Executor Framework?

Executor Framework is used to **manage and control thread execution efficiently**.

👉 Introduced in `java.util.concurrent`

---

## 🔑 Key Idea

> Instead of creating threads manually, use thread pools to manage tasks

---

## ⚡ Problem with Traditional Threads

```java
new Thread(() -> {
    System.out.println("Task running");
}).start();
```

❌ Issues:

* Creates too many threads
* High memory usage
* Poor performance

---

## ⚡ Solution: Executor Framework

```java
import java.util.concurrent.*;

ExecutorService executor = Executors.newFixedThreadPool(2);

executor.execute(() -> System.out.println("Task running"));

executor.shutdown();
```

---

## ⚡ Core Components

### 1. Executor

* Basic interface
* Executes tasks

---

### 2. ExecutorService

* Extends Executor
* Provides lifecycle control

---

### 3. Executors

* Utility class
* Creates thread pools

---

## ⚡ ExecutorService Methods

```java
executor.execute(runnable);  // no return
executor.submit(runnable);   // returns Future
executor.shutdown();         // stop accepting tasks
executor.shutdownNow();      // force stop
```

---

## ⚡ Task Submission

### Runnable (no return)

```java
executor.execute(() -> System.out.println("Task"));
```

---

### Using submit()

```java
executor.submit(() -> System.out.println("Task"));
```

---

## ⚡ Thread Pool Concept

* Pool of reusable threads
* Reduces overhead
* Improves performance

---

## ⚠️ Important Points

* Always shutdown executor
* Reuse threads instead of creating new
* Prefer Executor over manual threads

---

## ⚡ Real-World Usage

* Web servers
* Background jobs
* Task scheduling
* Microservices

---

## 🎯 Interview Questions

**Q1: What is Executor Framework?**  
A: Framework for managing threads efficiently.

**Q2: Why use thread pool?**  
A: To reduce overhead and improve performance.

**Q3: Difference between execute() and submit()?**  
A: submit() returns Future.

**Q4: What happens if shutdown() is not called?**  
A: Application may not terminate properly.

---

## 📌 Summary

* Executor manages threads efficiently
* Uses thread pools
* Improves performance and scalability
* Essential for backend systems
