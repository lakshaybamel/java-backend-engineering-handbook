# Thread Pool Types in Java

## 🧠 Overview

Java provides different types of thread pools using the `Executors` utility class.

👉 Each pool is designed for a specific use case

---

## 🔑 Key Idea

> Choose thread pool based on workload and system requirements

---

## ⚡ 1. Fixed Thread Pool

```java
ExecutorService executor = Executors.newFixedThreadPool(3);
```

### Features

* Fixed number of threads
* Tasks wait in queue if all threads are busy

---

### Use Case

* Controlled concurrency
* Limited resources

---

## ⚡ 2. Cached Thread Pool

```java
ExecutorService executor = Executors.newCachedThreadPool();
```

### Features

* Creates threads as needed
* Reuses idle threads
* Can grow very large

---

### Use Case

* Short-lived tasks
* High number of small tasks

---

## ⚠️ Risk

* May create too many threads → memory issues

---

## ⚡ 3. Single Thread Executor

```java
ExecutorService executor = Executors.newSingleThreadExecutor();
```

### Features

* Only one thread
* Tasks executed sequentially

---

### Use Case

* Ordered execution
* Logging systems

---

## ⚡ 4. Scheduled Thread Pool

```java
ScheduledExecutorService executor =
    Executors.newScheduledThreadPool(2);
```

### Features

* Executes tasks after delay or periodically

---

### Example

```java
executor.schedule(() -> System.out.println("Task"), 2, TimeUnit.SECONDS);
```

---

### Use Case

* Scheduling tasks
* Background jobs

---

## ⚡ Comparison

| Pool Type | Threads      | Use Case               |
| --------- | ------------ | ---------------------- |
| Fixed     | Limited      | Controlled workload    |
| Cached    | Dynamic      | Short tasks            |
| Single    | 1            | Sequential tasks       |
| Scheduled | Configurable | Delayed/periodic tasks |

---

## ⚠️ Important Points

* Fixed pool is most commonly used
* Cached pool can be risky
* Always shutdown executor
* Choose pool based on use case

---

## ⚡ Real-World Usage

* Web servers (fixed pool)
* Async tasks (cached pool)
* Task scheduling (scheduled pool)

---

## 🎯 Interview Questions

**Q1: Types of thread pools?**  
A: Fixed, Cached, Single, Scheduled.

**Q2: Which is most commonly used?**  
A: Fixed thread pool.

**Q3: Why is cached thread pool risky?**  
A: Can create unlimited threads.

**Q4: Which pool ensures order?**  
A: Single thread executor.

---

## 📌 Summary

* Different thread pools for different needs
* Fixed pool is safest
* Scheduled pool for timing tasks
* Important for scalable systems
