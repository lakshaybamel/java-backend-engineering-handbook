# ⚙️ Executor Framework

This module covers how Java manages **thread execution efficiently using thread pools**.

---

## 📖 Overview

Executor Framework helps in:

* Managing threads efficiently
* Reusing threads using pools
* Handling asynchronous tasks
* Improving performance and scalability

---

## 📂 Contents

### 📘 Concept Files

#### 🔹 executor-basics.md

Covers:

* Executor and ExecutorService
* Thread pool concept
* Task execution methods

👉 [`executor-basics.md`](./executor-basics.md)

---

#### 🔹 thread-pool-types.md

Covers:

* Fixed, Cached, Single, Scheduled thread pools
* Use cases and differences

👉 [`thread-pool-types.md`](./thread-pool-types.md)

---

#### 🔹 callable-future.md

Covers:

* Callable vs Runnable
* Future for async results
* Blocking behavior

👉 [`callable-future.md`](./callable-future.md)

---

#### 🔹 scheduled-executor.md

Covers:

* Scheduling tasks
* Fixed rate vs fixed delay
* Periodic execution

👉 [`scheduled-executor.md`](./scheduled-executor.md)

---

### 💻 Code Example

#### 🔸 ExecutorDemo.java

Demonstrates:

* Fixed and cached thread pools
* Callable and Future usage
* Scheduled task execution

👉 [`ExecutorDemo.java`](./ExecutorDemo.java)

---

## 🎯 Key Takeaways

* Executor replaces manual thread handling
* Thread pools improve performance
* Future enables async results
* Scheduled executor handles timed tasks
