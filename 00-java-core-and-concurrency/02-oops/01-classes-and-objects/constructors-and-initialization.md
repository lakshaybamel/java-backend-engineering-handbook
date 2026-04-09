# Constructors and Initialization in Java

## 🧠 What is a Constructor?

A constructor is a **special method used to initialize objects**.

* It has the **same name as the class**
* It does **not have a return type**
* It is called **automatically when an object is created**

---

### ⚡ Example

```java
class Student {
    String name;
    int age;

    Student() {
        System.out.println("Constructor called");
    }
}
```

---

### ⚡ Object Creation

```java
Student s1 = new Student();
```

👉 Constructor is called automatically

---

## 🔑 Key Points

* Same name as class
* No return type (not even void)
* Called during object creation
* Used to initialize object state

---

## ⚡ Types of Constructors

### 1. Default Constructor

* Provided by JVM if no constructor is defined

```java
class Student {
    String name;
}
```

👉 JVM creates a default constructor internally

---

### 2. No-Argument Constructor

```java
class Student {
    Student() {
        System.out.println("No-arg constructor");
    }
}
```

---

### 3. Parameterized Constructor

```java
class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }
}
```

---

### ⚡ Usage

```java
Student s1 = new Student("Lakshay", 22);
```

---

## ⚡ Constructor Overloading

Multiple constructors with different parameters

```java
class Student {

    Student() {}

    Student(String name) {}

    Student(String name, int age) {}
}
```

👉 Same name, different parameters

---

## ⚡ this() Constructor Chaining

Used to call another constructor in same class

```java
class Student {
    String name;
    int age;

    Student() {
        this("Unknown", 0);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

👉 Must be first statement

---

## ⚡ Initialization Flow (VERY IMPORTANT)

```java
class Demo {
    int x = 10;

    Demo() {
        System.out.println("Constructor");
    }
}
```

### Execution Order:

1. Default values assigned
2. Instance variables initialized
3. Constructor executed

---

## ⚡ Instance Initialization Block (IIB)

```java
class Demo {

    {
        System.out.println("IIB executed");
    }

    Demo() {
        System.out.println("Constructor executed");
    }
}
```

### Output:

```text
IIB executed
Constructor executed
```

---

## ⚡ Multiple Objects Behavior

```java
Demo d1 = new Demo();
Demo d2 = new Demo();
```

👉 Constructor runs **for each object**

---

## ⚡ Important Difference

| Feature     | Constructor   | Method   |
| ----------- | ------------- | -------- |
| Name        | Same as class | Any name |
| Return Type | No            | Yes      |
| Call        | Automatic     | Manual   |

---

## 🎯 Why it matters (Interview)

* Core concept of object creation
* Frequently asked:

  * Constructor overloading
  * Initialization order
  * this() chaining

---

## 🎯 Interview Questions

**Q1: What is a constructor?**  
A: Special method used to initialize objects.

**Q2: Can constructor have return type?**  
A: No.

**Q3: What is constructor overloading?**  
A: Multiple constructors with different parameters.

**Q4: What is this()?**  
A: Used to call another constructor in same class.

**Q5: What is execution order during object creation?**  
A: Default → instance variables → constructor.

---

## 📌 Summary

* Constructor initializes objects
* Called automatically on object creation
* Can be overloaded
* Supports chaining using `this()`
* Plays key role in object lifecycle
