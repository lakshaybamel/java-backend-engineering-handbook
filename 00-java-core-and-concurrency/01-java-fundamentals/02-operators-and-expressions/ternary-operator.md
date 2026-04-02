## Ternary Operator in Java

### What is Ternary Operator?

The ternary operator is a **shorthand for if-else statements**.

It takes **three operands** and is used for **conditional expressions**.

---

### Syntax

```java
condition ? expression1 : expression2;
```

* If condition is true -> expression1 executes
* If condition is false -> expression2 executes

---

### 🔑 Key Points

* Used as a **short form of if-else**
* Improves code readability for simple conditions
* Returns a value

---

### ⚡ Example

```java
int a = 10;
int b = 20;

int max = (a > b) ? a : b;

System.out.println(max); // 20
```

---

### ⚡ Example: Even or Odd

```java
int num = 7;

String result = (num % 2 == 0) ? "Even" : "Odd";

System.out.println(result); // Odd
```

---

### ⚡ Nested Ternary (Avoid Overuse)

```java
int a = 10, b = 20, c = 30;

int max = (a > b) ? 
          (a > c ? a : c) : 
          (b > c ? b : c);

System.out.println(max); // 30
```

👉 Works, but reduces readability if overused

---

### ⚡ Ternary vs If-Else

| Feature     | Ternary Operator  | If-Else                |
| ----------- | ----------------- | ---------------------- |
| Syntax      | Short             | Longer                 |
| Readability | Good (simple)     | Better (complex logic) |
| Use Case    | Simple conditions | Complex conditions     |

---

### 🎯 Why it matters (Interview)

* Common in:

  * Clean coding
  * Quick decisions
* Shows understanding of **concise logic**

---

### 🎯 Interview Questions

**Q1: What is ternary operator?**  
A: A shorthand for if-else that returns a value based on condition.

**Q2: Can ternary operator replace if-else completely?**  
A: No, only suitable for simple conditions.

**Q3: What are the three parts of ternary operator?**  
A: Condition, expression1 (true), expression2 (false).

**Q4: Is nested ternary recommended?**  
A: Not for complex logic as it reduces readability.

---

### Summary

Ternary operator:

* Simplifies conditional statements
* Useful for short decisions
* Should be used carefully for readability
