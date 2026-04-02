## Bitwise Operators in Java

### What are Bitwise Operators?

Bitwise operators operate on **individual bits** of integer data types (byte, short, int, long).

They perform operations at the **binary level**.

---

### Types of Bitwise Operators

| Operator | Description | Example |
| -------- | ----------- | ------- |
| &        | Bitwise AND | a & b   |
| \|       | Bitwise OR  | a | b   |
| ^        | Bitwise XOR | a ^ b   |
| ~        | Bitwise NOT | ~a      |
| <<       | Left Shift  | a << 1  |
| >>       | Right Shift | a >> 1  |

---

### 🔑 Key Points

* Work on **binary representation**
* Used in:

  * Low-level programming
  * Performance optimization
* Faster than logical operations in some cases

---

### ⚡ Example

```java
int a = 5;  // 0101
int b = 3;  // 0011

System.out.println(a & b);  // 1  (0001)
System.out.println(a | b);  // 7  (0111)
System.out.println(a ^ b);  // 6  (0110)
System.out.println(~a);     // -6
```

---

### ⚡ Bitwise AND (&)

* Returns 1 if both bits are 1

```java
5 & 3  -> 0101 & 0011 = 0001 (1)
```

---

### ⚡ Bitwise OR (|)

* Returns 1 if at least one bit is 1

```java
5 | 3  -> 0101 | 0011 = 0111 (7)
```

---

### ⚡ Bitwise XOR (^)

* Returns 1 if bits are different

```java
5 ^ 3  -> 0101 ^ 0011 = 0110 (6)
```

---

### ⚡ Bitwise NOT (~)

* Flips all bits

```java
~5 -> -6
```

👉 Uses **2's complement representation**

---

### ⚡ Shift Operators

#### Left Shift (<<)

* Shifts bits to left
* Multiplies by 2

```java
5 << 1  -> 10
```

---

#### Right Shift (>>)

* Shifts bits to right
* Divides by 2

```java
5 >> 1  -> 2
```

---

### 🎯 Why it matters (Interview)

* Asked in:

  * Bit manipulation problems (DSA)
  * Optimization questions
* Important for:

  * Competitive programming
  * System-level understanding

---

### 🎯 Interview Questions

**Q1: What are bitwise operators?**  
A: Operators that perform operations on individual bits of numbers.

**Q2: Difference between & and &&?**  
A: `&` is bitwise, `&&` is logical operator.

**Q3: What does XOR (^) do?**  
A: Returns 1 when bits are different.

**Q4: What is left shift used for?**  
A: Multiplying a number by 2.

**Q5: Why is ~5 equal to -6?**  
A: Due to 2's complement representation.

---

### Summary

Bitwise operators:

* Work at binary level
* Useful for optimization and DSA
* Important for understanding low-level operations
