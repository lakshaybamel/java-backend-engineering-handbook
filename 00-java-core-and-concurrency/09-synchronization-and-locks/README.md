# 🔒 Synchronization and Locks

This module covers how Java ensures **thread safety and coordination** in multithreaded environments.

---

## 📖 Overview

Synchronization and locking help in:

* Preventing race conditions
* Controlling access to shared resources
* Coordinating multiple threads
* Avoiding concurrency issues like deadlock

---

## 📂 Contents

### 📘 Concept Files

#### 🔹 synchronization.md

Covers:

* synchronized keyword
* Race conditions
* Intrinsic locking

👉 [`synchronization.md`](./synchronization.md)

---

#### 🔹 locks-and-reentrantlock.md

Covers:

* ReentrantLock
* tryLock and timeout
* Advanced locking control

👉 [`locks-and-reentrantlock.md`](./locks-and-reentrantlock.md)

---

#### 🔹 deadlock.md

Covers:

* Deadlock concept
* Causes and conditions
* Prevention techniques

👉 [`deadlock.md`](./deadlock.md)

---

#### 🔹 wait-notify.md

Covers:

* Thread communication
* wait(), notify(), notifyAll()
* Producer-consumer pattern

👉 [`wait-notify.md`](./wait-notify.md)

---

### 💻 Code Example

#### 🔸 SynchronizationDemo.java

Demonstrates:

* synchronized method usage
* ReentrantLock usage
* wait-notify (producer-consumer)
* Thread coordination

👉 [`SynchronizationDemo.java`](./SynchronizationDemo.java)

---

## 🎯 Key Takeaways

* synchronized ensures thread safety
* Locks provide advanced control
* Deadlock must be avoided
* wait-notify enables thread communication
