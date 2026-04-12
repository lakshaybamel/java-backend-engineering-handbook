# Scheduled Executor in Java

## 🧠 What is ScheduledExecutorService?

`ScheduledExecutorService` is used to **schedule tasks to run after a delay or periodically**.

👉 It is part of `java.util.concurrent`

---

## 🔑 Key Idea

> Execute tasks at specific time intervals or after delay

---

## ⚡ Creating Scheduled Executor

```java
import java.util.concurrent.*;

ScheduledExecutorService executor =
    Executors.newScheduledThreadPool(2);
```

---

## ⚡ 1. schedule() → Run once after delay

```java id="c9m4yq"
executor.schedule(() -> {
    System.out.println("Task executed after delay");
}, 2, TimeUnit.SECONDS);
```

---

## ⚡ 2. scheduleAtFixedRate() → Run repeatedly

```java id="s9y8wd"
executor.scheduleAtFixedRate(() -> {
    System.out.println("Running periodically");
}, 1, 2, TimeUnit.SECONDS);
```

👉 Runs every 2 seconds (after initial delay of 1 second)

---

## ⚡ 3. scheduleWithFixedDelay()

```java id="o4r8kt"
executor.scheduleWithFixedDelay(() -> {
    System.out.println("Running with delay");
}, 1, 2, TimeUnit.SECONDS);
```

👉 Starts next execution **after previous task completes**

---

## ⚡ Fixed Rate vs Fixed Delay

| Feature          | Fixed Rate          | Fixed Delay              |
| ---------------- | ------------------- | ------------------------ |
| Timing           | Based on start time | Based on completion time |
| Overlap possible | Yes                 | No                       |
| Use case         | Regular intervals   | Controlled execution     |

---

## ⚠️ Important Points

* Always shutdown executor
* Be careful with long-running tasks
* Fixed rate may cause overlapping

---

## ⚡ Example

```java id="j2l8pw"
ScheduledExecutorService executor =
    Executors.newScheduledThreadPool(1);

executor.schedule(() -> {
    System.out.println("One-time task");
}, 2, TimeUnit.SECONDS);

executor.shutdown();
```

---

## ⚡ Real-World Usage

* Scheduled jobs
* Background tasks
* Monitoring systems
* Reminder systems

---

## 🎯 Interview Questions

**Q1: What is ScheduledExecutorService?**  
A: Used to schedule tasks.

**Q2: Difference between scheduleAtFixedRate and scheduleWithFixedDelay?**  
A: FixedRate → based on time, FixedDelay → after completion.

**Q3: Where is it used?**  
A: Scheduling tasks.

**Q4: Why not use Timer?**  
A: Executor is more robust and flexible.

---

## 📌 Summary

* Used for delayed and periodic tasks
* Provides better control than Timer
* Important for real-world systems
