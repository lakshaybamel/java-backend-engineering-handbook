## While Loop in Java

### What is While Loop?

The while loop is used when the **number of iterations is not known in advance**.
It runs as long as the condition is true.

---

### Syntax

```java
while (condition) {
    // code
}
```

---

### 🔑 Key Points

* Condition is checked **before execution**
* Loop may not execute even once
* Used for **dynamic conditions**

---

### ⚡ Example

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

---

### ⚡ Flow of Execution

1. Condition is checked
2. If true -> loop body executes
3. Update happens inside loop
4. Steps repeat until condition is false

---

### ⚡ Infinite While Loop

```java
while (true) {
    System.out.println("Running...");
}
```

👉 Runs forever unless stopped

---

### 🎯 Why it matters (Interview)

* Useful when:

  * Input-driven loops
  * Unknown iterations
* Common in real-world logic

---

### 🎯 Interview Questions

**Q1: When should we use while loop?**  
A: When number of iterations is not known.

**Q2: Can while loop run zero times?**  
A: Yes, if condition is false initially.

**Q3: What causes infinite loop?**  
A: Condition always true or missing update.

---

### Summary

While loop:

* Used for unknown iterations
* Checks condition before execution
* Can lead to infinite loop if not handled properly
