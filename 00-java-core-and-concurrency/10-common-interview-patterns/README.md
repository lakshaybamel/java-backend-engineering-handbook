# 🧠 Common Interview Patterns

This module covers important design and concurrency patterns frequently asked in interviews.

---

## 📖 Overview

These patterns help in:

* Writing scalable and maintainable code
* Solving real-world concurrency problems
* Understanding system design concepts
* Preparing for technical interviews

---

## 📂 Contents

### 📘 Concept Files

#### 🔹 producer-consumer.md

Covers:

* Producer-consumer problem
* wait/notify solution
* BlockingQueue approach

👉 [`producer-consumer.md`](./producer-consumer.md)

---

#### 🔹 thread-safe-singleton.md

Covers:

* Singleton pattern
* Thread-safe implementations
* Best approaches (Bill Pugh, Enum)

👉 [`thread-safe-singleton.md`](./thread-safe-singleton.md)

---

#### 🔹 double-checked-locking.md

Covers:

* Optimized Singleton
* volatile usage
* Performance considerations

👉 [`double-checked-locking.md`](./double-checked-locking.md)

---

#### 🔹 immutability-pattern.md

Covers:

* Immutable class design
* Thread safety
* Defensive copying

👉 [`immutability-pattern.md`](./immutability-pattern.md)

---

### 💻 Code Example

#### 🔸 PatternsDemo.java

Demonstrates:

* Singleton (double-checked locking)
* Immutable class
* Producer-consumer using BlockingQueue

👉 [`PatternsDemo.java`](./PatternsDemo.java)

---

## 🎯 Key Takeaways

* Patterns solve common design problems
* Singleton controls object creation
* Immutability ensures thread safety
* Producer-consumer handles coordination
