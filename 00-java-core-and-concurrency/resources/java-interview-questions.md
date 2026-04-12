# 🎯 Java Interview Questions (Core + Concurrency)

---

## 🧠 Java Basics

### Q1: Why is Java platform independent?

A: Because Java compiles into bytecode which runs on JVM, not OS.

---

### Q2: Difference between JDK, JRE, JVM?

* JVM → runs bytecode
* JRE → JVM + libraries
* JDK → JRE + development tools

---

### Q3: Stack vs Heap?

* Stack → method calls, local variables
* Heap → objects

---

## 🔢 Data Types

### Q4: Primitive vs Non-Primitive?

* Primitive → stores value
* Non-Primitive → stores reference

---

### Q5: What is type casting?

A: Converting one data type to another (implicit/explicit)

---

## 🧩 OOP Concepts

### Q6: What is encapsulation?

A: Wrapping data + methods using private access.

---

### Q7: What is inheritance?

A: Acquiring properties of parent class.

---

### Q8: What is polymorphism?

A: One interface, multiple implementations.

---

### Q9: Overloading vs Overriding?

* Overloading → compile-time
* Overriding → runtime

---

### Q10: Abstract class vs Interface?

| Feature     | Abstract Class | Interface       |
| ----------- | -------------- | --------------- |
| Methods     | Both           | Mostly abstract |
| Inheritance | Single         | Multiple        |

---

## ⚡ Keywords

### Q11: this vs super?

* this → current object
* super → parent class

---

### Q12: final keyword?

* Variable → constant
* Method → cannot override
* Class → cannot inherit

---

## 📦 Collections

### Q13: List vs Set vs Map?

* List → ordered
* Set → unique
* Map → key-value

---

### Q14: HashMap vs ConcurrentHashMap?

* HashMap → not thread-safe
* ConcurrentHashMap → thread-safe

---

### Q15: Comparable vs Comparator?

* Comparable → natural sorting
* Comparator → custom sorting

---

## ⚠️ Exception Handling

### Q16: Checked vs Unchecked exceptions?

* Checked → compile-time
* Unchecked → runtime

---

### Q17: throw vs throws?

* throw → explicitly throw
* throws → declare exception

---

## ⚡ Java 8

### Q18: What is Lambda?

A: Anonymous function.

---

### Q19: What is Stream API?

A: Process collections functionally.

---

### Q20: What is Optional?

A: Avoid null pointer exceptions.

---

## 🧵 Multithreading

### Q21: What is thread?

A: Lightweight process.

---

### Q22: How to create thread?

* Thread class
* Runnable interface

---

### Q23: start() vs run()?

* start() → new thread
* run() → normal method

---

### Q24: What is thread lifecycle?

A: New → Runnable → Running → Waiting → Terminated

---

## ⚡ Synchronization

### Q25: What is synchronization?

A: Controlling access to shared resources.

---

### Q26: synchronized vs volatile?

* synchronized → atomic + visibility
* volatile → visibility only

---

### Q27: What is race condition?

A: Multiple threads modifying shared data.

---

## ⚡ Advanced Concurrency

### Q28: What are atomic classes?

A: Thread-safe variables without locks.

---

### Q29: What is ConcurrentHashMap?

A: Thread-safe map with better performance.

---

### Q30: What is ReentrantLock?

A: Advanced locking mechanism.

---

### Q31: What is deadlock?

A: Threads waiting indefinitely.

---

### Q32: Conditions of deadlock?

* Mutual exclusion
* Hold & wait
* No preemption
* Circular wait

---

## ⚙️ Executor Framework

### Q33: What is ExecutorService?

A: Manages thread pool.

---

### Q34: Types of thread pools?

* Fixed
* Cached
* Single
* Scheduled

---

### Q35: Callable vs Runnable?

* Callable → returns value
* Runnable → no return

---

### Q36: What is Future?

A: Holds result of async task.

---

## 🔄 Patterns

### Q37: What is Singleton?

A: Single instance class.

---

### Q38: Best Singleton implementation?

A: Bill Pugh / Enum.

---

### Q39: What is Producer-Consumer?

A: Coordination between threads.

---

### Q40: What is Immutability?

A: Object cannot change after creation.

---

## 🔥 Important Coding Questions

* Reverse a string
* Check palindrome
* Find duplicates in array
* Sorting (custom comparator)
* Thread-safe counter
* Producer-consumer implementation

---

## 📌 Final Tips

* Focus on concepts + examples
* Be ready with code snippets
* Practice multithreading questions
* Revise collections thoroughly

---

## 🚀 Summary

This covers:

* Core Java
* OOP
* Collections
* Concurrency
* Design patterns

👉 Enough for **most SDE interviews**
