## For Loop in Java

### What is For Loop?

The for loop is used when the **number of iterations is known in advance**.

---

### Syntax

```java
for (initialization; condition; update) {
    // code
}
```

---

### 🔑 Components

* Initialization -> starting point
* Condition -> loop runs while true
* Update -> increment/decrement

---

### ⚡ Example

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

---

### ⚡ Flow of Execution

1. Initialization runs once
2. Condition is checked
3. Loop body executes
4. Update happens
5. Steps repeat until condition is false

---

### ⚡ Reverse Loop

```java
for (int i = 5; i >= 1; i--) {
    System.out.println(i);
}
```

---

### ⚡ Loop with Multiple Variables

```java
for (int i = 1, j = 5; i <= j; i++, j--) {
    System.out.println(i + " " + j);
}
```

---

### ⚡ Nested For Loop

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

---

### 🎯 Why it matters (Interview)

* Most used loop in:

  * DSA problems
  * Pattern printing
  * Iteration logic

---

### 🎯 Interview Questions

**Q1: When should we use for loop?**  
A: When number of iterations is known.

**Q2: What are the three parts of for loop?**  
A: Initialization, condition, update.

**Q3: Can we use multiple variables in for loop?**  
A: Yes.

**Q4: What happens if condition is always true?**  
A: Infinite loop occurs.

---

### Summary

For loop:

* Best for fixed iterations
* Provides compact syntax
* Widely used in problem solving
