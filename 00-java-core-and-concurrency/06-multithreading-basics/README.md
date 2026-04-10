# 🧵 Multithreading Basics

This module covers how Java handles **concurrent execution using threads**.

---

## 📖 Overview

Multithreading allows programs to:

* Execute multiple tasks simultaneously
* Improve performance
* Utilize CPU efficiently
* Build responsive applications

---

## 📂 Contents

### 📘 Concept Files

#### 🔹 thread-basics.md

Covers:

* What thread is
* Process vs thread
* Multithreading concept

👉 [`thread-basics.md`](./thread-basics.md)

---

#### 🔹 thread-lifecycle.md

Covers:

* Thread states
* Lifecycle flow
* State transitions

👉 [`thread-lifecycle.md`](./thread-lifecycle.md)

---

#### 🔹 creating-threads.md

Covers:

* Creating threads using Thread and Runnable
* Lambda-based thread creation
* start() vs run()

👉 [`creating-threads.md`](./creating-threads.md)

---

#### 🔹 thread-methods.md

Covers:

* Important thread methods
* sleep(), join(), yield()
* Thread control and coordination

👉 [`thread-methods.md`](./thread-methods.md)

---

### 💻 Code Example

#### 🔸 ThreadDemo.java

Demonstrates:

* Thread creation (Thread, Runnable, Lambda)
* Thread execution
* join(), sleep(), isAlive()
* Thread naming and current thread

👉 [`ThreadDemo.java`](./ThreadDemo.java)

---

## 🎯 Key Takeaways

* Threads enable concurrent execution
* Runnable is preferred for thread creation
* Lifecycle understanding is important
* Thread methods control execution flow
