## Variables and Scope in Java

### What is a Variable?

A variable is a container used to store data in memory.

```java
int age = 21;
```

---

## Types of Variables

### 1. Local Variables

* Declared inside methods, blocks, or constructors
* Scope limited to that block
* No default value

```java
void display() {
    int x = 10; // local variable
}
```

---

### 2. Instance Variables

* Declared inside class but outside methods
* Belong to object (instance of class)
* Get default values

```java
class Student {
    int id;       // instance variable
    String name;  // instance variable
}
```

---

### 3. Static Variables

* Declared using `static` keyword
* Shared across all objects of the class
* Only one copy exists

```java
class Student {
    static String college = "BIT Mesra";
}
```

---

## Scope of Variables

Scope defines where a variable is accessible.

```java
if (true) {
    int x = 10;
}
// x cannot be accessed here
```

---

## 🔑 Key Points

* Local variables exist only inside methods
* Instance variables belong to objects
* Static variables are shared across objects
* Scope controls accessibility

---

## ⚡ Example

```java
class Demo {
    int instanceVar = 10;
    static int staticVar = 20;

    void show() {
        int localVar = 5;

        System.out.println(localVar);
        System.out.println(instanceVar);
        System.out.println(staticVar);
    }
}
```

---

## ⚡ Memory Insight

* Local variables → Stack
* Instance variables → Heap (inside objects)
* Static variables → Method Area

---

## 🎯 Why it matters (Interview)

* Very commonly asked topic
* Helps in understanding:

  * Memory model
  * Object behavior
  * Class design

---

## 🎯 Interview Questions

**Q1: What are different types of variables in Java?**  
A: Local, Instance, and Static variables.

**Q2: Difference between instance and static variables?**  
A: Instance variables belong to objects, static variables are shared across all objects.

**Q3: Do local variables get default values?**  
A: No, they must be initialized before use.

**Q4: Where are variables stored in memory?**  
A: Local → Stack, Instance → Heap, Static → Method Area.

**Q5: What is scope in Java?**  
A: Scope defines where a variable can be accessed.

---

### Summary

Variables:

* Store data in Java programs
* Have different types based on scope
* Are essential for understanding memory and object behavior
