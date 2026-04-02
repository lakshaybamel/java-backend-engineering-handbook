# Memory Management in Java

This section explains how Java manages memory during program execution.

Understanding memory is essential for:

* Writing efficient code
* Avoiding memory issues
* Cracking backend and Java interviews

---

## 📂 Contents

### Memory Structure

* **Stack vs Heap**

  * Notes: [`stack-vs-heap.md`](./stack-vs-heap.md)

* **Memory Allocation Flow**

  * Notes: [`memory-allocation-flow.md`](./memory-allocation-flow.md)

---

### Memory Management

* **Garbage Collection**

  * Notes: [`garbage-collection.md`](./garbage-collection.md)

---

### Practical Example

* [`MemoryDemo.java`](./examples/MemoryDemo.java)

Demonstrates:

* Object creation in heap
* Reference handling in stack
* Garbage collection behavior

---

## 🧠 Key Concepts

* Stack -> method calls and local variables
* Heap -> objects and instance data
* Reference -> link between stack and heap
* Garbage Collection -> removes unused objects

---

## 🎯 Interview Focus

* Stack vs Heap difference
* Object creation process
* What happens during `new` keyword
* When objects become eligible for GC
* Role of JVM in memory management

---

## ⚡ How to Use

1. Start with stack vs heap
2. Understand memory allocation flow
3. Learn garbage collection
4. Run example to visualize behavior

---

## 📌 Summary

Java memory management:

* Uses stack and heap together
* Automatically handles memory using GC
* Is crucial for understanding Java internals and backend systems
