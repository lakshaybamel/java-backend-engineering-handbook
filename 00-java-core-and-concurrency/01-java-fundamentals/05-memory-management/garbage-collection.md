## Garbage Collection in Java

### What is Garbage Collection?

Garbage Collection (GC) is the process of **automatically removing unused objects from memory (heap)**.

It helps in:

* Freeing memory
* Preventing memory leaks
* Managing memory automatically

---

### 🔑 Key Points

* Works on **heap memory**
* Removes objects that are **no longer reachable**
* Managed by JVM (Java Virtual Machine)
* Developer does NOT manually free memory

---

## ⚡ What is an Unreachable Object?

An object becomes eligible for garbage collection when **no reference points to it**.

```java
class Demo {}

public class Test {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj = null; // object becomes unreachable
    }
}
```

---

## ⚡ Ways Objects Become Eligible for GC

### 1. Nullifying Reference

```java
obj = null;
```

---

### 2. Reassigning Reference

```java
Demo obj = new Demo();
obj = new Demo(); // old object becomes unreachable
```

---

### 3. Out of Scope

```java
void method() {
    Demo obj = new Demo();
} // obj goes out of scope
```

---

## ⚡ How Garbage Collector Works

* JVM periodically checks for unreachable objects
* Removes them from heap
* Frees memory

👉 You cannot control exact timing of GC

---

## ⚡ System.gc() (Request, Not Guarantee)

```java
System.gc();
```

* Suggests JVM to run GC
* Not guaranteed to execute

---

## ⚡ finalize() Method (Deprecated Concept)

```java
protected void finalize() {
    System.out.println("Object is garbage collected");
}
```

* Called before object is destroyed
* Not reliable → **deprecated in modern Java**

---

## 🎯 Why it matters (Interview)

* Core topic in:

  * Java internals
  * Memory management
* Frequently asked:

  * When objects are eligible for GC
  * How GC works

---

## 🎯 Interview Questions

**Q1: What is garbage collection?**  
A: Automatic removal of unused objects from heap memory.

**Q2: When is an object eligible for GC?**  
A: When it becomes unreachable (no references).

**Q3: Can we force garbage collection?**  
A: No, only request using System.gc().

**Q4: Does GC work on stack memory?**  
A: No, only on heap.

---

### Summary

Garbage collection:

* Frees unused memory automatically
* Works on heap
* Is managed by JVM
