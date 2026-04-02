## Strings in Java (Basics)

### What is a String?

A String is a sequence of characters used to store text in Java.

In Java, String is a **class (non-primitive type)**.

---

### 🔑 Key Points

* String is **immutable** (cannot be changed)
* Stored in **heap memory**
* Uses **String Constant Pool (SCP)**
* Created using:

  * String literal
  * new keyword

---

## ⚡ String Creation

### 1. Using String Literal

```java
String s1 = "Hello";
```

* Stored in **String Constant Pool**
* Reuses existing object if already present

---

### 2. Using new Keyword

```java
String s2 = new String("Hello");
```

* Creates new object in heap
* Does not reuse SCP directly

---

## ⚡ String Immutability

```java
String s = "Hello";
s = s + " World";

System.out.println(s);
```

👉 A new object is created, original is unchanged

---

## ⚡ String Methods

```java
String str = "Java";

System.out.println(str.length());       // 4
System.out.println(str.toUpperCase());  // JAVA
System.out.println(str.charAt(0));      // J
System.out.println(str.substring(1));   // ava
```

---

## ⚡ String Comparison

```java
String a = "Hello";
String b = "Hello";
String c = new String("Hello");

System.out.println(a == b);       // true
System.out.println(a == c);       // false
System.out.println(a.equals(c));  // true
```

* `==` -> compares reference
* `equals()` -> compares content

---

## ⚡ String Constant Pool (SCP)

* Special area in heap
* Stores string literals
* Avoids duplicate objects

---

### 🎯 Why it matters (Interview)

* Very frequently asked:

  * String immutability
  * SCP behavior
* Used heavily in backend

---

### 🎯 Interview Questions

**Q1: What is String in Java?**  
A: A class used to store sequence of characters.

**Q2: Why are Strings immutable?**  
A: For security, performance, and caching (SCP).

**Q3: Difference between == and equals()?**  
A: `==` compares reference, `equals()` compares content.

**Q4: What is String Constant Pool?**  
A: Memory area that stores string literals.

---

### Summary

Strings:

* Are immutable
* Stored in heap and SCP
* Widely used in Java applications
