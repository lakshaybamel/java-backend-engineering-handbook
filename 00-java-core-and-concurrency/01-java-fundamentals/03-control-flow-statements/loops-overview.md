## Loops in Java (Overview)

### What are Loops?

Loops are used to **execute a block of code repeatedly** until a condition is satisfied.

---

### Why use loops?

* Avoid writing repetitive code
* Perform operations on collections or ranges
* Build logic for iteration

---

### Types of Loops in Java

| Loop Type | Description                                     |
| --------- | ----------------------------------------------- |
| for       | Used when number of iterations is known         |
| while     | Used when condition is checked before execution |
| do-while  | Executes at least once, condition checked after |

---

### 🔑 Key Points

* All loops depend on a **condition (boolean)**
* Loop runs until condition becomes false
* Infinite loops occur if condition never becomes false

---

### ⚡ Basic Example

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

---

### ⚡ Infinite Loop Example

```java
while (true) {
    System.out.println("Running...");
}
```

👉 Runs forever unless manually stopped

---

### ⚡ Loop Control Statements

Used to control loop flow:

* `break` -> exit loop
* `continue` -> skip current iteration

---

### 🎯 Why it matters (Interview)

* Core part of:

  * DSA problems
  * Backend logic
  * Iteration over data

---

### 🎯 Interview Questions

**Q1: What are loops in Java?**  
A: Structures used to execute code repeatedly based on a condition.

**Q2: Types of loops in Java?**  
A: for, while, do-while.

**Q3: What is an infinite loop?**  
A: A loop that never terminates because condition is always true.

**Q4: Difference between while and do-while?**  
A: while checks condition first, do-while executes at least once.

---

### Summary

Loops:

* Help in repetition of tasks
* Reduce code duplication
* Are essential for programming and problem solving
