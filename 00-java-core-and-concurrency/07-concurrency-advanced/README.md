# ⚡ Advanced Concurrency

This module covers advanced concepts used for building **high-performance and thread-safe applications**.

---

## 📖 Overview

Advanced concurrency helps in:

* Handling multiple threads efficiently
* Avoiding race conditions
* Improving performance in concurrent systems
* Designing scalable backend systems

---

## 📂 Contents

### 📘 Concept Files

#### 🔹 concurrent-collections.md

Covers:

* Thread-safe collections
* ConcurrentHashMap
* CopyOnWrite collections
* BlockingQueue

👉 [`concurrent-collections.md`](./concurrent-collections.md)

---

#### 🔹 volatile-keyword.md

Covers:

* Visibility in multithreading
* volatile behavior
* Limitations

👉 [`volatile-keyword.md`](./volatile-keyword.md)

---

#### 🔹 atomic-classes.md

Covers:

* Atomic variables
* CAS mechanism
* Thread-safe operations without locks

👉 [`atomic-classes.md`](./atomic-classes.md)

---

#### 🔹 locks-overview.md

Covers:

* ReentrantLock
* tryLock and timeout
* ReadWriteLock

👉 [`locks-overview.md`](./locks-overview.md)

---

### 💻 Code Example

#### 🔸 ConcurrencyDemo.java

Demonstrates:

* ConcurrentHashMap usage
* AtomicInteger operations
* ReentrantLock and tryLock
* BlockingQueue (producer-consumer)

👉 [`ConcurrencyDemo.java`](./ConcurrencyDemo.java)

---

## 🎯 Key Takeaways

* Concurrent collections improve performance
* volatile ensures visibility
* Atomic classes provide lock-free operations
* Locks provide advanced thread control
