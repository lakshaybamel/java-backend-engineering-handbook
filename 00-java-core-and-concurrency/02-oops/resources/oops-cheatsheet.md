# OOPs Cheat Sheet (Java)

---

## 🧱 Core Concepts

| Concept       | Meaning                            |
| ------------- | ---------------------------------- |
| Class         | Blueprint for objects              |
| Object        | Instance of class                  |
| Encapsulation | Data hiding + controlled access    |
| Inheritance   | Code reuse using `extends`         |
| Polymorphism  | One method, many forms             |
| Abstraction   | Hide implementation, show behavior |

---

## 🔐 Encapsulation

* Use `private` variables
* Provide getters/setters
* Add validation inside setters

---

## 🔗 Inheritance

* Use `extends`
* Supports:

  * Single
  * Multilevel
  * Hierarchical
* Does NOT support multiple inheritance (classes)

---

## 🔁 Polymorphism

### Compile-Time

* Method overloading

### Runtime

* Method overriding
* Achieved using:

  ```
  Parent ref = new Child();
  ```

---

## 🧩 Abstraction

* Achieved using:

  * Abstract class
  * Interface
* Cannot instantiate abstract class

---

## 📦 Interface

* Methods → public abstract
* Variables → public static final
* Supports multiple inheritance
* Can have:

  * default methods
  * static methods

---

## 🧠 this & super

| Keyword | Use                      |
| ------- | ------------------------ |
| this    | Refers to current object |
| super   | Refers to parent class   |

---

## ⚙️ Constructors

* Same name as class
* No return type
* Types:

  * Default
  * Parameterized
* Supports overloading

---

## 📊 Access Modifiers

| Modifier  | Access             |
| --------- | ------------------ |
| private   | Same class         |
| default   | Same package       |
| protected | Package + subclass |
| public    | Everywhere         |

---

## 📌 Object Class Methods

* `equals()` → content comparison
* `hashCode()` → hashing
* `toString()` → readable output

---

## ⚠️ equals vs ==

* `==` → reference comparison
* `equals()` → content comparison

---

## 🔒 Immutability

* Class = `final`
* Fields = `private final`
* No setters
* Use constructor initialization

---

## 🧩 SOLID Principles

| Principle | Meaning                                     |
| --------- | ------------------------------------------- |
| SRP       | One responsibility                          |
| OCP       | Open for extension, closed for modification |
| LSP       | Child should replace parent                 |
| ISP       | Small interfaces                            |
| DIP       | Depend on abstraction                       |

---

## 🎯 Interview Quick Points

* Constructor ≠ Method
* Overloading ≠ Overriding
* Abstract class vs Interface
* equals + hashCode must be consistent
* Use interface for flexibility

---

## 📌 Quick Revision Flow

```text
Class → Object → Encapsulation → Inheritance → Polymorphism → Abstraction → SOLID
```
