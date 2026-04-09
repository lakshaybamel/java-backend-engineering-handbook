# Classes and Objects in Java

## 🧠 What is a Class?

A class is a **blueprint or template** used to create objects.

It defines:

* Properties (variables / fields)
* Behavior (methods / functions)

---

### ⚡ Example

```java
class Student {
    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);
    }
}
```

👉 Here:

* `name`, `age` → properties
* `display()` → behavior

---

## 🧩 What is an Object?

An object is an **instance of a class**.

It represents a real-world entity and contains:

* State (data)
* Behavior (methods)

---

### ⚡ Creating Object

```java
Student s1 = new Student();
```

---

### ⚡ Assigning Values

```java
s1.name = "Lakshay";
s1.age = 22;
```

---

### ⚡ Calling Method

```java
s1.display();
```

---

## ⚡ Combined Example

```java
class Student {
    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Lakshay";
        s1.age = 22;

        s1.display();
    }
}
```

---

## 🧠 Memory View (Very Important)

```java
Student s1 = new Student();
```

### What happens internally:

1. Class is loaded into memory
2. Object is created in **heap memory**
3. Reference `s1` is stored in **stack**
4. `s1` points to object in heap

---

### ⚡ Visualization

```text
Stack                 Heap
------                -----------------
s1  ------------->    Student object
                       name = null
                       age = 0
```

---

## 🔑 Key Points

* Class = blueprint
* Object = real instance
* Object stores actual data
* Multiple objects can be created from one class
* Objects are stored in heap

---

## ⚡ Multiple Objects Example

```java
Student s1 = new Student();
Student s2 = new Student();

s1.name = "A";
s2.name = "B";
```

👉 Each object has **separate memory**

---

## ⚡ Real-World Mapping

| Concept | Example       |
| ------- | ------------- |
| Class   | Car blueprint |
| Object  | Actual car    |

---

## 🎯 Why it matters (Interview)

* Foundation of OOPS
* Required for:

  * Inheritance
  * Polymorphism
  * Encapsulation

---

## 🎯 Interview Questions

**Q1: What is a class?**  
A: Blueprint for creating objects.
 
**Q2: What is an object?**  
A: Instance of a class.

**Q3: Where are objects stored?**  
A: Heap memory.

**Q4: What is stored in stack for objects?**  
A: Reference.

**Q5: Can multiple objects share same data?**  
A: No, each has its own copy.

---

## 📌 Summary

* Class defines structure
* Object represents actual data
* Objects are created using `new`
* Memory: stack (reference) + heap (object)

This forms the base of all OOPS concepts.
