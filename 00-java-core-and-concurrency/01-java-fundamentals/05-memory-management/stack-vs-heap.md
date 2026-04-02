## Stack vs Heap Memory in Java

### What is Memory in Java?

Java uses different memory areas to store data during program execution.

The two main areas are:

* Stack Memory
* Heap Memory

---

## Stack Memory

### What is Stack?

Stack memory is used for:

* Method calls
* Local variables
* Function execution

---

### 🔑 Key Points (Stack)

* Stores **primitive variables and references**
* Memory is allocated **automatically**
* Follows **LIFO (Last In First Out)**
* Fast access
* Each thread has its own stack

---

### ⚡ Example

```java
void method() {
    int x = 10; // stored in stack
}
```

---

## Heap Memory

### What is Heap?

Heap memory is used for:

* Objects
* Instance variables

---

### 🔑 Key Points (Heap)

* Stores **objects and actual data**
* Shared across all threads
* Memory managed by **Garbage Collector**
* Slower than stack

---

### ⚡ Example

```java
class Demo {
    int value = 10;
}

Demo obj = new Demo(); // object stored in heap
```

---

## ⚡ Stack vs Heap (Comparison)

| Feature      | Stack                 | Heap              |
| ------------ | --------------------- | ----------------- |
| Stores       | Variables, references | Objects           |
| Memory Speed | Fast                  | Slower            |
| Allocation   | Automatic             | Dynamic           |
| Size         | Limited               | Larger            |
| Scope        | Method-level          | Application-level |

---

## ⚡ How They Work Together

```java
Demo obj = new Demo();
```

* `obj` (reference) -> stored in **stack**
* actual object -> stored in **heap**

---

## 🎯 Why it matters (Interview)

* One of the **most asked topics**
* Important for:

  * Memory optimization
  * Debugging
  * Understanding Java internals

---

## 🎯 Interview Questions

**Q1: What is difference between stack and heap?**  
A: Stack stores variables, heap stores objects.

**Q2: Where are objects stored?**  
A: Heap memory.

**Q3: What is stored in stack for objects?**  
A: Reference (memory address).

**Q4: Which is faster: stack or heap?**  
A: Stack.

---

### Summary

Stack vs Heap:

* Stack -> method execution and variables
* Heap -> object storage
* Both work together in Java memory model
