## Primitive Data Types in Java

### What are Primitive Data Types?

Primitive data types are the most basic data types in Java.
They store **actual values directly in memory (stack)**.

---

### Types of Primitive Data Types

| Type    | Size    | Example           |
| ------- | ------- | ----------------- |
| byte    | 1 byte  | byte x = 10;      |
| short   | 2 bytes | short x = 100;    |
| int     | 4 bytes | int x = 1000;     |
| long    | 8 bytes | long x = 10000L;  |
| float   | 4 bytes | float x = 10.5f;  |
| double  | 8 bytes | double x = 10.5;  |
| char    | 2 bytes | char c = 'A';     |
| boolean | 1 bit   | boolean b = true; |

---

### 🔑 Key Points

* Stored in **stack memory**
* Store **actual values (not reference)**
* Faster than non-primitive types
* Cannot store `null`
* Size is **fixed and predefined**

---

### ⚡ Important Notes

* `float` requires `f`

  ```java
  float x = 10.5f;
  ```

* `long` requires `L`

  ```java
  long x = 10000L;
  ```

* Default type for decimal numbers is `double`

* `char` stores **Unicode values**

  ```java
  char c = 65; // 'A'
  ```

---

### ⚡ Example

```java
int age = 21;
double price = 99.99;
char grade = 'A';
boolean isActive = true;
```

---

### 🎯 Why it matters (Interview)

* Forms the base of Java
* Important for:

  * Memory understanding (stack vs heap)
  * Type conversion
  * Performance

---

### 🎯 Interview Questions

**Q1: What is the difference between int and Integer?**  
A: `int` is a primitive type, while `Integer` is a wrapper class (object).

**Q2: Why do we use 'f' in float?**  
A: Because default decimal type is `double`, so `f` specifies float.

**Q3: Can primitive types store null?**  
A: No, only reference types can store null.

**Q4: Where are primitive variables stored?**  
A: In stack memory.

**Q5: What is the default type of decimal numbers in Java?**  
A: `double`.

---

### Summary

Primitive data types are:

* Simple and fast
* Memory-efficient
* The foundation of all Java programs
