## Logical Operators in Java

### What are Logical Operators?

Logical operators are used to **combine multiple conditions** and return a **boolean result (true or false)**.

---

### Types of Logical Operators

| Operator | Description  | Example            |
|----------|-------------|---------------------|
| &&       | Logical AND | a > 5 && b < 10     |
| \|\|     | Logical OR  | a > 5 \|\| b < 10   |
| !        | Logical NOT | !(a > 5)            |

---

### 🔑 Key Points

* Work with **boolean expressions**
* Used in:

  * if conditions
  * loops
  * decision making
* Result is always **true or false**

---

### ⚡ Example

```java
int a = 10;
int b = 5;

System.out.println(a > 5 && b < 10);  // true
System.out.println(a > 5 && b > 10);  // false

System.out.println(a > 5 || b > 10);  // true
System.out.println(a < 5 || b > 10);  // false

System.out.println(!(a > 5));         // false
```

---

### ⚡ Short-Circuit Evaluation

Logical operators use **short-circuit evaluation**:

#### AND (&&)

* If first condition is false -> second is NOT checked

```java
int a = 5;

if (a < 10 && a++ > 5) {
    System.out.println("Inside if");
}

System.out.println(a); // 6
```

---

#### OR (||)

* If first condition is true -> second is NOT checked

```java
int a = 5;

if (a < 10 || a++ > 5) {
    System.out.println("Inside if");
}

System.out.println(a); // 5
```

---

### ⚡ Logical NOT (!)

* Reverses the boolean value

```java
boolean isActive = true;

System.out.println(!isActive); // false
```

---

### 🎯 Why it matters (Interview)

* Used heavily in:

  * Conditions
  * Filters
  * Business logic
* Short-circuit behavior is commonly asked

---

### 🎯 Interview Questions

**Q1: What are logical operators in Java?**  
A: Operators used to combine boolean expressions and return true or false.

**Q2: Difference between && and ||?**  
A: `&&` requires both conditions true, `||` requires at least one true.

**Q3: What is short-circuit evaluation?**  
A: Skipping evaluation of second condition when result is already determined.

**Q4: What does ! operator do?**  
A: It reverses the boolean value.

---

### Summary

Logical operators:

* Combine conditions
* Return boolean results
* Use short-circuit evaluation for efficiency
