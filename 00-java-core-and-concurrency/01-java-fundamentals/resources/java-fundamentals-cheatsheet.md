# Java Fundamentals Cheatsheet

A quick yet detailed revision guide covering core Java concepts for interviews and coding.

---

## 🧠 Data Types

### Primitive Types

* int, double, float, char, boolean
* Stored in **stack memory**
* Faster and fixed size

### Non-Primitive Types

* String, Arrays, Objects
* Stored in **heap memory** (reference in stack)
* Can store null

---

## ⚡ Type Casting

### Implicit (Widening)

* int -> double
* Safe, automatic

```java
int a = 10;
double b = a;
```

---

### Explicit (Narrowing)

* double -> int
* Manual, may lose data

```java
double x = 9.8;
int y = (int) x; // 9
```

---

## 📦 Variables

| Type     | Scope  | Default Value |
| -------- | ------ | ------------- |
| Local    | Method | No            |
| Instance | Object | Yes           |
| Static   | Class  | Yes           |

---

## 🔢 Operators

### Arithmetic

* +, -, *, /, %
* Integer division removes decimal

### Relational

* ==, !=, >, <
* Returns boolean

### Logical

* &&, ||, !
* Uses **short-circuit evaluation**

### Bitwise

* &, |, ^, ~, <<, >>
* Works at binary level

### Ternary

```java
int max = (a > b) ? a : b;
```

---

## 🔀 Control Flow

### If-Else

* Used for decision making

### Switch

* Used for fixed values
* Requires break

---

## 🔁 Loops

| Loop     | Use Case               |
| -------- | ---------------------- |
| for      | Known iterations       |
| while    | Unknown iterations     |
| do-while | Executes at least once |

---

## 🔁 Loop Control

* break -> exit loop
* continue -> skip iteration

---

## 🧩 Methods

* Reusable block of code
* Improve modularity

### Types

* With return
* Without return (void)

### Static vs Instance

* Static -> class level
* Instance -> object level

---

## 🔄 Method Overloading

* Same method name
* Different parameters
* Compile-time polymorphism

---

## 🔁 Recursion

* Function calls itself
* Requires base case

```java
int fact(int n) {
    if (n == 0) return 1;
    return n * fact(n - 1);
}
```

---

## 📊 Arrays

* Fixed size
* Stored in heap
* Indexed from 0

```java
int[] arr = {1, 2, 3};
```

---

## 🔤 Strings

### Key Points

* Immutable
* Stored in String Constant Pool

```java
String s = "Hello";
```

---

### Comparison

```java
s1 == s2      // reference
s1.equals(s2) // content
```

---

## ⚡ StringBuilder

* Mutable
* Faster than String

```java
StringBuilder sb = new StringBuilder("Hi");
sb.append(" Java");
```

---

## 🧠 Memory Management

### Stack

* Stores variables and method calls

### Heap

* Stores objects

```java
Demo obj = new Demo();
```

* obj -> stack
* object -> heap

---

## ♻️ Garbage Collection

* Removes unused objects
* Works on heap
* Automatic

```java
obj = null; // eligible for GC
```

---

## 🎯 Interview Quick Points

* int vs Integer
* == vs equals()
* String immutability
* Stack vs Heap
* Pass by value (always in Java)
* Method overloading rules
* Recursion base case

---

## ⚡ Last Minute Revision

* Arrays -> fixed size, indexed
* Strings -> immutable
* Methods -> reusable logic
* Loops -> iteration
* GC -> automatic memory cleanup


