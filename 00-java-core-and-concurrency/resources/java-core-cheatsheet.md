# ⚡ Java Core Cheat Sheet

## 🧠 Java Fundamentals

* Java is **object-oriented + platform independent**
* Compilation → `.java → .class → JVM`
* Memory:

  * Stack → method calls, references
  * Heap → objects

---

## 🔢 Data Types

### Primitive

* int, float, double, char, boolean

### Non-Primitive

* String, Arrays, Classes

---

## ⚡ Type Casting

* Implicit → int → double
* Explicit → double → int

---

## 🔀 Control Flow

* if-else
* switch
* loops → for, while, do-while
* break / continue

---

## 🧩 OOP Concepts

### 1. Encapsulation

* Data hiding using private + getters/setters

### 2. Inheritance

* Code reuse using `extends`

### 3. Polymorphism

* Overloading (compile-time)
* Overriding (runtime)

### 4. Abstraction

* Abstract classes + interfaces

---

## ⚡ Important Keywords

* this → current object
* super → parent class
* final → constant / no override
* static → class-level
* volatile → visibility

---

## 📦 Collections Framework

### List

* ArrayList → dynamic array
* LinkedList → fast insert/delete

### Set

* HashSet → no duplicates
* TreeSet → sorted

### Map

* HashMap → key-value
* ConcurrentHashMap → thread-safe

---

## ⚡ Comparable vs Comparator

* Comparable → natural sorting
* Comparator → custom sorting

---

## ⚠️ Exception Handling

* try-catch-finally
* throw vs throws

---

## ⚡ Java 8 Features

* Lambda → `() -> {}`
* Streams → filter, map, collect
* Optional → avoid null
* Method reference → `Class::method`

---

## 🧵 Multithreading

### Thread Creation

* Thread class
* Runnable interface

---

### Thread Methods

* start()
* sleep()
* join()
* yield()

---

## ⚡ Synchronization

* synchronized → thread safety
* volatile → visibility only

---

## ⚡ Concurrent Tools

* AtomicInteger → thread-safe counter
* ConcurrentHashMap → thread-safe map
* BlockingQueue → producer-consumer

---

## 🔒 Locks

* ReentrantLock → advanced locking
* tryLock() → non-blocking

---

## ⚙️ Executor Framework

* ExecutorService → thread pool
* Fixed / Cached / Scheduled pools

---

## 🔄 Callable & Future

* Callable → returns value
* Future → holds result

---

## ⏱️ Scheduling

* ScheduledExecutorService
* Fixed rate vs fixed delay

---

## 🔥 Important Patterns

* Singleton (thread-safe)
* Producer-Consumer
* Immutability

---

## 🎯 Interview Must-Know

* equals() vs ==
* hashCode contract
* String immutability
* Thread lifecycle
* Deadlock conditions
* synchronized vs Lock

---

## 📌 Quick Tips

* Prefer interfaces over classes
* Use immutability where possible
* Avoid unnecessary synchronization
* Use Executor instead of manual threads

---

## 🚀 Final Summary

* Java = OOP + Collections + Concurrency
* Focus on:

  * Concepts
  * Code
  * Use cases

👉 This sheet is enough for **quick revision before interviews**
