## Relational Operators in Java

### What are Relational Operators?

Relational operators are used to **compare two values**.
They always return a **boolean result (true or false)**.

---

### Types of Relational Operators

| Operator | Description              | Example |
| -------- | ------------------------ | ------- |
| ==       | Equal to                 | a == b  |
| !=       | Not equal to             | a != b  |
| >        | Greater than             | a > b   |
| <        | Less than                | a < b   |
| >=       | Greater than or equal to | a >= b  |
| <=       | Less than or equal to    | a <= b  |

---

### 🔑 Key Points

* Always return **true or false**
* Used in:

  * Conditional statements (if, while)
  * Decision making
* Works with primitive types and comparable values

---

### ⚡ Example

```java
int a = 10;
int b = 5;

System.out.println(a == b);  // false
System.out.println(a != b);  // true
System.out.println(a > b);   // true
System.out.println(a < b);   // false
System.out.println(a >= b);  // true
System.out.println(a <= b);  // false
```

---

### ⚡ Important: == vs equals()

```java
String s1 = new String("Hello");
String s2 = new String("Hello");

System.out.println(s1 == s2);       // false
System.out.println(s1.equals(s2));  // true
```

* `==` -> compares **reference (memory address)**
* `equals()` -> compares **actual content**

---

### ⚡ Comparing Characters

```java
char a = 'A';
char b = 'B';

System.out.println(a < b); // true
```

👉 Characters are compared using **Unicode values**

---

### 🎯 Why it matters (Interview)

* Core part of:

  * Condition checking
  * Loops
  * Business logic
* Common confusion:

  * `==` vs `equals()`

---

### 🎯 Interview Questions

**Q1: What do relational operators return?**  
A: Boolean values (true or false).

**Q2: Difference between == and equals()?**  
A: `==` compares references, `equals()` compares content.

**Q3: Can relational operators be used with objects?**  
A: `==` can compare references, but content comparison requires `equals()`.

**Q4: How are characters compared in Java?**  
A: Based on their Unicode values.

---

### Summary

Relational operators:

* Compare values
* Return boolean results
* Are essential for decision making in Java
