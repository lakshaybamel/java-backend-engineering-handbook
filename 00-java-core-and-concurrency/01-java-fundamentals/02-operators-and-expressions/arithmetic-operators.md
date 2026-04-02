## Arithmetic Operators in Java

### What are Arithmetic Operators?

Arithmetic operators are used to perform **basic mathematical operations** such as addition, subtraction, multiplication, and division.

---

### Types of Arithmetic Operators

| Operator | Description         | Example |
| -------- | ------------------- | ------- |
| +        | Addition            | a + b   |
| -        | Subtraction         | a - b   |
| *        | Multiplication      | a * b   |
| /        | Division            | a / b   |
| %        | Modulus (remainder) | a % b   |

---

### 🔑 Key Points

* Work with **numeric data types** (int, float, double, etc.)
* `/` behaves differently for **integers vs decimals**
* `%` returns **remainder**
* Operators follow **BODMAS precedence**

---

### ⚡ Example

```java
int a = 10;
int b = 3;

System.out.println("Addition: " + (a + b));        // 13
System.out.println("Subtraction: " + (a - b));     // 7
System.out.println("Multiplication: " + (a * b));  // 30
System.out.println("Division: " + (a / b));        // 3
System.out.println("Modulus: " + (a % b));         // 1
```

---

### ⚡ Integer vs Decimal Division

```java
int x = 10;
int y = 3;

System.out.println(x / y); // 3 (integer division)

double p = 10;
double q = 3;

System.out.println(p / q); // 3.333...
```

👉 Integer division removes decimal part

---

### ⚡ Increment and Decrement Operators

| Operator | Description    |
| -------- | -------------- |
| ++       | Increment (+1) |
| --       | Decrement (-1) |

```java
int a = 5;

System.out.println(a++); // 5 (post-increment)
System.out.println(++a); // 7 (pre-increment)
```

---

### ⚡ Pre vs Post Increment

* `a++` -> use value first, then increment
* `++a` -> increment first, then use

---

### 🎯 Why it matters (Interview)

* Frequently used in coding problems
* Important for:

  * Loops
  * Calculations
  * Debugging logic

---

### 🎯 Interview Questions

**Q1: What is the difference between / and %?**  
A: `/` gives quotient, `%` gives remainder.

**Q2: What is integer division?**  
A: Division between integers where decimal part is discarded.

**Q3: Difference between a++ and ++a?**  
A: `a++` returns value before increment, `++a` returns after increment.

**Q4: What is operator precedence?**  
A: The order in which operations are evaluated (e.g., *, / before +, -).

---

### Summary

Arithmetic operators:

* Perform basic mathematical operations
* Follow operator precedence
* Behave differently for integers and decimals
