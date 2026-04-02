## Do-While Loop in Java

### What is Do-While Loop?

The do-while loop executes the code **at least once**, then checks the condition.

---

### Syntax

```java
do {
    // code
} while (condition);
```

---

### 🔑 Key Points

* Executes **at least one time**
* Condition is checked **after execution**
* Ends with a semicolon `;`

---

### ⚡ Example

```java
int i = 1;

do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

---

### ⚡ Executes At Least Once

```java
int i = 10;

do {
    System.out.println(i);
} while (i < 5);
```

👉 Output:

```text
10
```

Even though condition is false, it runs once

---

### 🎯 Why it matters (Interview)

* Useful when:

  * Code must run at least once
  * Menu-driven programs

---

### 🎯 Interview Questions

**Q1: Difference between while and do-while?**  
A: while checks before execution, do-while checks after.

**Q2: Can do-while run if condition is false?**  
A: Yes, it executes once.

**Q3: Where is do-while commonly used?**  
A: Menu-based systems.

---

### Summary

Do-while loop:

* Executes at least once
* Checks condition after execution
* Useful for user-driven programs
