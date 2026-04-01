## Type Casting in Java

### What is Type Casting?

Type casting is the process of converting one data type into another.

---

## Types of Type Casting

### 1. Implicit Casting (Widening)

* Automatically done by Java
* Converts **smaller type → larger type**
* Safe (no data loss)

```java
int a = 10;
double b = a;  // int → double
```

---

### 2. Explicit Casting (Narrowing)

* Done manually by programmer
* Converts **larger type → smaller type**
* May cause data loss

```java
double a = 10.75;
int b = (int) a;  // double → int
```

---

### 🔑 Key Points

* Widening = automatic and safe
* Narrowing = manual and risky
* Required in calculations and type conversions

---

### ⚡ Example

```java
int x = 5;
double y = x;   // Implicit

double p = 9.8;
int q = (int) p;  // Explicit (data loss)
```

---

### ⚡ Data Loss Example

```java
double num = 9.99;
int result = (int) num;

System.out.println(result); // 9
```

👉 Decimal part is lost during casting

---

### ⚡ Type Promotion in Expressions

```java
byte a = 10;
byte b = 20;

int result = a + b; // promoted to int
```

👉 Java automatically promotes smaller types to `int` during operations

---

### 🎯 Why it matters (Interview)

* Commonly asked in basics
* Important for:

  * Data conversion
  * Calculations
  * Debugging bugs

---

### 🎯 Interview Questions

**Q1: What is type casting in Java?**  
A: It is the process of converting one data type into another.

**Q2: Difference between implicit and explicit casting?**  
A: Implicit is automatic (safe), explicit is manual (may cause data loss).

**Q3: What happens when double is cast to int?**  
A: Decimal part is truncated (lost).

**Q4: Why is casting needed?**  
A: To convert data types during operations or assignments.

**Q5: What is type promotion?**  
A: Automatic conversion of smaller data types to int during expressions.

---

### Summary

Type casting:

* Enables conversion between data types
* Has two types: implicit (safe) and explicit (manual)
* Is essential for real-world programming
