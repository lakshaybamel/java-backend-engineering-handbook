## Methods in Java (Basics)

### What is a Method?

A method is a **block of code that performs a specific task** and can be reused multiple times.

---

### Syntax

```java
returnType methodName(parameters) {
    // method body
    return value;
}
```

---

### 🔑 Key Components

* returnType -> type of value returned (int, void, etc.)
* methodName -> name of method
* parameters -> input values
* method body -> logic inside method

---

### ⚡ Example

```java
public class Demo {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(5, 3);
        System.out.println(result);
    }
}
```

---

### ⚡ Types of Methods

#### 1. With Return Value

```java
int square(int x) {
    return x * x;
}
```

#### 2. Without Return Value (void)

```java
void greet() {
    System.out.println("Hello");
}
```

---

### ⚡ Method Parameters

```java
void printSum(int a, int b) {
    System.out.println(a + b);
}
```

* Parameters allow passing input to methods

---

### ⚡ Static vs Instance Methods

* Static method -> called using class name
* Instance method -> called using object

```java
class Demo {
    static void staticMethod() {}
    void instanceMethod() {}
}
```

---

### 🎯 Why it matters (Interview)

* Core concept for:

  * Code reusability
  * Modular programming
* Used everywhere in backend development

---

### 🎯 Interview Questions

**Q1: What is a method in Java?**  
A: A reusable block of code that performs a specific task.

**Q2: What is the difference between void and return type?**  
A: void does not return anything, other types return values.

**Q3: What are parameters?**  
A: Inputs passed to methods.

**Q4: Difference between static and instance methods?**  
A: Static belongs to class, instance belongs to object.

---

### Summary

Methods:

* Improve code reusability
* Help in modular design
* Are essential for building scalable applications
