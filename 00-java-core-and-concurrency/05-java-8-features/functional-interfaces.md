# Functional Interfaces in Java

## 🧠 What is a Functional Interface?

A functional interface is an interface that contains **exactly one abstract method**.

👉 It is used as the **target type for lambda expressions**

---

## 🔑 Key Idea

> One abstract method → enables lambda expressions

---

## ⚡ Example

```java
@FunctionalInterface
interface MyInterface {
    void sayHello();
}
```

---

## ⚡ Using with Lambda

```java
MyInterface obj = () -> System.out.println("Hello");

obj.sayHello();
```

---

## ⚡ @FunctionalInterface Annotation

* Optional but recommended
* Ensures interface has only one abstract method
* Gives compile-time error if violated

---

### Example

```java
@FunctionalInterface
interface Demo {
    void show();
    
    // void test(); ❌ Not allowed
}
```

---

## ⚡ Can Functional Interface Have Multiple Methods?

Yes, but:

* Only **one abstract method**
* Can have:

  * Default methods
  * Static methods

---

### Example

```java
@FunctionalInterface
interface Demo {

    void show(); // abstract

    default void print() {
        System.out.println("Default method");
    }

    static void test() {
        System.out.println("Static method");
    }
}
```

---

## ⚡ Built-in Functional Interfaces

### 1. Predicate

* Takes input → returns boolean

```java
import java.util.function.Predicate;

Predicate<Integer> isEven = x -> x % 2 == 0;

System.out.println(isEven.test(4)); // true
```

---

### 2. Function

* Takes input → returns output

```java
import java.util.function.Function;

Function<Integer, Integer> square = x -> x * x;

System.out.println(square.apply(5)); // 25
```

---

### 3. Consumer

* Takes input → returns nothing

```java
import java.util.function.Consumer;

Consumer<String> print = x -> System.out.println(x);

print.accept("Hello");
```

---

### 4. Supplier

* Takes no input → returns value

```java
import java.util.function.Supplier;

Supplier<Double> random = () -> Math.random();

System.out.println(random.get());
```

---

## ⚡ Functional Interface Types Summary

| Interface | Input | Output  |
| --------- | ----- | ------- |
| Predicate | Yes   | Boolean |
| Function  | Yes   | Yes     |
| Consumer  | Yes   | No      |
| Supplier  | No    | Yes     |

---

## ⚠️ Important Points

* Only one abstract method allowed
* Required for lambda expressions
* Can have default and static methods
* Widely used in Streams API

---

## ⚡ Real-World Usage

* Stream operations
* Filtering and mapping data
* Event-driven programming
* Writing clean functional-style code

---

## 🎯 Interview Questions

**Q1: What is functional interface?**  
A: Interface with one abstract method.

**Q2: Why used?**  
A: To support lambda expressions.

**Q3: Is @FunctionalInterface mandatory?**  
A: No, but recommended.

**Q4: Name common functional interfaces?**  
A: Predicate, Function, Consumer, Supplier.

---

## 📌 Summary

* Functional interface = single abstract method
* Backbone of lambda expressions
* Built-in interfaces simplify coding
* Used heavily in Java 8 features
