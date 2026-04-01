## Non-Primitive Data Types (Reference Types)

### What are Non-Primitive Data Types?

Non-primitive data types store **references (memory addresses)** to objects instead of actual values.

They are created using classes, arrays, or other complex structures and are stored in **heap memory**.

---

### Examples of Non-Primitive Types

* String
* Arrays
* Classes
* Interfaces

```java
String name = "Lakshay";

int[] arr = {1, 2, 3};

class Student {
    int id;
    String name;
}
```

---

### 🔑 Key Characteristics

* Stored in **heap memory**
* Store **reference (address), not actual value**
* Can store `null`
* Created using `new` keyword (most cases)
* More flexible than primitive types

---

### ⚡ Primitive vs Non-Primitive

| Feature      | Primitive  | Non-Primitive |
| ------------ | ---------- | ------------- |
| Memory       | Stack      | Heap          |
| Stores       | Value      | Reference     |
| Null Allowed | No         | Yes           |
| Size         | Fixed      | Dynamic       |
| Examples     | int, float | String, Array |

---

### ⚡ Example: Reference Behavior

```java
String a = "Hello";
String b = a;

b = "World";

System.out.println(a); // Hello
System.out.println(b); // World
```

👉 Here, variables store **references**, not direct values.

---

### ⚡ Example: Using 'new' Keyword

```java
String s1 = new String("Hello");
```

👉 Creates a new object in heap memory.

---

### 🎯 Why it matters (Interview)

* Helps understand:

  * Heap vs Stack memory
  * Object behavior
  * Parameter passing
* Important for backend (objects, APIs, DTOs)

---

### 🎯 Interview Questions

**Q1: What is the difference between primitive and non-primitive types?**  
A: Primitive stores actual values in stack, while non-primitive stores references to objects in heap.

**Q2: Can non-primitive types store null?**  
A: Yes, they can store null references.

**Q3: What is a reference variable?**  
A: A variable that stores the memory address of an object.

**Q4: Why is String non-primitive?**  
A: Because it is a class and objects are created in heap memory.

**Q5: What does 'new' keyword do?**  
A: It creates a new object in heap memory and returns its reference.

---

### Summary

Non-primitive data types:

* Store references to objects
* Are flexible and powerful
* Form the base of **object-oriented programming in Java**
