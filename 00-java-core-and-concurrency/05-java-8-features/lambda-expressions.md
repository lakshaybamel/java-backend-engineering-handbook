# Lambda Expressions in Java

## 🧠 What are Lambda Expressions?

Lambda expressions provide a **short and concise way to represent functions** (anonymous methods).

👉 Introduced in Java 8 to support **functional programming**

---

## 🔑 Key Idea

> Replace anonymous classes with cleaner and shorter syntax

---

## ⚡ Basic Syntax

```java
(parameters) -> expression
```

OR

```java
(parameters) -> {
    // multiple statements
}
```

---

## ⚡ Example (Without Lambda)

```java
interface MyInterface {
    void sayHello();
}

class Demo {
    public static void main(String[] args) {
        MyInterface obj = new MyInterface() {
            public void sayHello() {
                System.out.println("Hello");
            }
        };

        obj.sayHello();
    }
}
```

---

## ⚡ Example (With Lambda)

```java
interface MyInterface {
    void sayHello();
}

public class Demo {
    public static void main(String[] args) {
        MyInterface obj = () -> System.out.println("Hello");
        obj.sayHello();
    }
}
```

---

## ⚡ Lambda with Parameters

```java
interface Add {
    int sum(int a, int b);
}

Add add = (a, b) -> a + b;

System.out.println(add.sum(5, 3)); // 8
```

---

## ⚡ Lambda with Multiple Statements

```java
(a, b) -> {
    int result = a + b;
    return result;
};
```

---

## ⚡ Functional Interface Requirement

👉 Lambda works only with **functional interfaces**

* Interface with exactly **one abstract method**

Example:

```java
@FunctionalInterface
interface Demo {
    void show();
}
```

---

## ⚡ Built-in Functional Interfaces

* Runnable
* Comparator
* Callable
* Predicate
* Function

---

## ⚡ Using Lambda with Collections

```java
import java.util.*;

List<Integer> list = Arrays.asList(3, 1, 2);

list.sort((a, b) -> a - b);

System.out.println(list);
```

---

## ⚡ Lambda vs Anonymous Class

| Feature     | Lambda | Anonymous Class |
| ----------- | ------ | --------------- |
| Syntax      | Short  | Verbose         |
| Readability | High   | Low             |
| Code size   | Less   | More            |

---

## ⚠️ Important Rules

* Can omit data types if inferred
* Parentheses optional for single parameter
* Curly braces required for multiple statements
* Cannot be used without functional interface

---

## ⚡ Real-World Usage

* Sorting collections
* Event handling
* Stream operations
* Writing clean and concise code

---

## 🎯 Interview Questions

**Q1: What is lambda expression?**  
A: Anonymous function used to provide implementation of functional interface.

**Q2: Can lambda be used without functional interface?**  
A: No.

**Q3: Difference between lambda and anonymous class?**  
A: Lambda is concise and cleaner.
 
**Q4: What is functional interface?**  
A: Interface with one abstract method.

---

## 📌 Summary

* Lambda reduces boilerplate code
* Used with functional interfaces
* Improves readability and maintainability
* Widely used in streams and collections
