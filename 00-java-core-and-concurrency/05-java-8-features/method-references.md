# Method References in Java

## 🧠 What are Method References?

Method references are a **shorter and cleaner way to refer to methods** using lambda expressions.

👉 Instead of writing lambda, you can directly refer to a method.

---

## 🔑 Key Idea

> Replace lambda expressions with method references when possible

---

## ⚡ Syntax

```java
ClassName::methodName
```

---

## ⚡ Example (Lambda vs Method Reference)

### Using Lambda

```java
list.forEach(x -> System.out.println(x));
```

### Using Method Reference

```java
list.forEach(System.out::println);
```

---

## ⚡ Types of Method References

### 1. Static Method Reference

```java
class Demo {
    static void print(String s) {
        System.out.println(s);
    }
}

list.forEach(Demo::print);
```

---

### 2. Instance Method Reference (of particular object)

```java
class Demo {
    void print(String s) {
        System.out.println(s);
    }
}

Demo d = new Demo();
list.forEach(d::print);
```

---

### 3. Instance Method Reference (of arbitrary object)

```java
List<String> list = Arrays.asList("a", "b", "c");

list.forEach(String::toUpperCase);
```

---

### 4. Constructor Reference

```java
interface Demo {
    Student create(String name);
}

Demo d = Student::new;
```

---

## ⚡ When to Use

* When lambda only calls a method
* To improve readability
* To reduce boilerplate code

---

## ⚠️ Important Points

* Works with functional interfaces
* Not always possible (depends on lambda complexity)
* Makes code more readable

---

## ⚡ Real-World Usage

* Stream operations
* Iterating collections
* Cleaner functional code

---

## 🎯 Interview Questions

**Q1: What is method reference?**  
A: Short form of lambda expression.

**Q2: Syntax of method reference?**  
A: ClassName::methodName.

**Q3: Types of method references?**  
A: Static, instance, constructor.

**Q4: Can method reference replace all lambdas?**  
A: No.

---

## 📌 Summary

* Method references simplify lambda expressions
* Improve readability
* Used with functional interfaces
* Important in streams and collections
