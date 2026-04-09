# Abstract Class vs Interface in Java

## 🧠 Overview

Both abstract classes and interfaces are used to achieve **abstraction**, but they serve different purposes.

---

## ⚡ Key Differences

| Feature          | Abstract Class                   | Interface                     |
| ---------------- | -------------------------------- | ----------------------------- |
| Methods          | Abstract + concrete              | Abstract by default           |
| Variables        | Can have any type                | public, static, final only    |
| Constructors     | Allowed                          | Not allowed                   |
| Inheritance      | Single inheritance               | Multiple inheritance          |
| Keyword          | `extends`                        | `implements`                  |
| Access Modifiers | Any (private, protected, public) | Methods are public by default |

---

## ⚡ When to Use Abstract Class

Use abstract class when:

* Classes share **common code**
* You need **constructors**
* You want **partial abstraction**

---

## ⚡ Example

```java id="pjr0w9"
abstract class Animal {

    void eat() {
        System.out.println("Eating...");
    }

    abstract void sound();
}
```

---

## ⚡ When to Use Interface

Use interface when:

* You want **100% abstraction**
* You need **multiple inheritance**
* You are defining a **contract**

---

## ⚡ Example

```java id="0vd5uq"
interface Animal {
    void sound();
}
```

---

## ⚡ Combined Example

```java id="c1v8z4"
abstract class Animal {
    abstract void sound();
}

interface Pet {
    void play();
}

class Dog extends Animal implements Pet {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    public void play() {
        System.out.println("Dog plays");
    }
}
```

---

## 🎯 Why it matters (Interview)

* Very frequently asked:

  * Difference between abstract class and interface
* Important for:

  * Design decisions
  * API development

---

## 🎯 Interview Questions

**Q1: Can abstract class have constructor?**  
A: Yes.

**Q2: Can interface have variables?**  
A: Yes, but they are public, static, and final.

**Q3: Can a class implement multiple interfaces?**  
A: Yes.

**Q4: Can abstract class achieve multiple inheritance?**  
A: No.

---

## 📌 Summary

* Abstract class → partial abstraction
* Interface → full abstraction + multiple inheritance
* Choose based on design requirement
