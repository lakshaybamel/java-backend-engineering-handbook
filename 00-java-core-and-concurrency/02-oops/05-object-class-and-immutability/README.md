# 🧱 Object Class and Immutability

This module covers how Java handles **object behavior and data safety** using Object class methods and immutability.

---

## 📖 Overview

Every class in Java inherits from the Object class, which provides common methods like `equals()`, `hashCode()`, and `toString()`.

Immutability ensures that object state remains constant after creation, improving safety and reliability.

---

## 📂 Contents

### 📘 Concept Files

#### 🔹 object-class-methods.md

Covers:

* Object class basics
* Common methods like toString(), equals(), hashCode()
* Default behavior of these methods

👉 [`object-class-methods.md`](./object-class-methods.md)

---

#### 🔹 equals-hashcode-tostring.md

Covers:

* Deep understanding of equals(), hashCode(), toString()
* Overriding rules
* Relationship between equals() and hashCode()

👉 [`equals-hashcode-tostring.md`](./equals-hashcode-tostring.md)

---

#### 🔹 immutability.md

Covers:

* What immutability is
* How to create immutable classes
* Handling mutable fields
* Benefits like thread safety

👉 [`immutability.md`](./immutability.md)

---

### 💻 Code Example

#### 🔸 ObjectClassDemo.java

Demonstrates:

* Overriding equals(), hashCode(), toString()
* Object comparison
* Custom string representation

👉 [`ObjectClassDemo.java`](./ObjectClassDemo.java)

---

## 🎯 Key Takeaways

* Object class is the root of all Java classes
* equals() compares content, hashCode() supports hashing
* toString() improves readability
* Immutability ensures object safety and consistency
