## If-Else Statements in Java

### What is If-Else?

If-else statements are used to **make decisions** in a program based on conditions.

---

### Syntax

```java
if (condition) {
    // executes if condition is true
} else {
    // executes if condition is false
}
```

---

### 🔑 Key Points

* Condition must return **boolean (true/false)**
* Used for **decision making**
* Only one block executes at a time

---

### ⚡ Example

```java
int age = 18;

if (age >= 18) {
    System.out.println("Eligible to vote");
} else {
    System.out.println("Not eligible");
}
```

---

### ⚡ Else If Ladder

Used when multiple conditions are checked

```java
int marks = 75;

if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 70) {
    System.out.println("Grade B");
} else if (marks >= 50) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}
```

---

### ⚡ Nested If

```java
int age = 20;
boolean hasID = true;

if (age >= 18) {
    if (hasID) {
        System.out.println("Allowed entry");
    }
}
```

---

### 🎯 Why it matters (Interview)

* Core of:

  * Decision making
  * Business logic
  * API conditions
* Frequently used in coding problems

---

### 🎯 Interview Questions

**Q1: What is if-else statement?**  
A: It is used to execute code based on a condition.

**Q2: What is else-if ladder?**  
A: Multiple conditions checked sequentially.

**Q3: Can we use multiple else blocks?**  
A: No, only one else is allowed.

**Q4: What type of value must condition return?**  
A: Boolean (true/false).

---

### Summary

If-else:

* Controls program flow
* Used for decision making
* Supports multiple conditions using else-if
