# this Keyword in Java

## 🧠 What is `this`?

`this` is a reference variable that refers to the **current object**.

---

## 🔑 Key Uses of `this`

### 1. Refer to Current Object Variables

Used when local variable and instance variable have same name.

```java
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}
```

👉 `this.name` → instance variable
👉 `name` → parameter

---

### 2. Call Current Class Method

```java
class Demo {

    void display() {
        System.out.println("Display method");
    }

    void show() {
        this.display();
    }
}
```

👉 Optional, but improves clarity

---

### 3. Call Another Constructor → `this()`

```java
class Student {

    Student() {
        this("Unknown");
    }

    Student(String name) {
        System.out.println(name);
    }
}
```

👉 Must be **first statement**

---

### 4. Pass Current Object as Argument

```java
class Demo {

    void print(Demo obj) {
        System.out.println("Object received");
    }

    void send() {
        print(this);
    }
}
```

---

### 5. Return Current Object

```java
class Demo {

    Demo getObject() {
        return this;
    }
}
```

👉 Used in method chaining

---

## ⚡ Example (Combined)

```java
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(this.name);
    }

    Student getStudent() {
        return this;
    }
}
```

---

## ⚠️ Important Rules

* `this` refers to **current object only**
* Cannot be used in **static context**

```java
static void method() {
    // this.name ❌ not allowed
}
```

---

## 🎯 Why it matters (Interview)

* Used in:

  * Constructors
  * Method chaining
  * Object passing
* Common confusion:

  * `this` vs local variables

---

## 🎯 Interview Questions

**Q1: What is `this` keyword?**  
A: Reference to current object.

**Q2: Can we use `this` in static methods?**  
A: No.

**Q3: What is `this()`?**  
A: Calls another constructor in same class.

**Q4: Why is `this` used in constructors?**  
A: To differentiate instance and local variables.

---

## 📌 Summary

* `this` refers to current object
* Used for:

  * Variable reference
  * Constructor chaining
  * Method calls
  * Returning object
* Not allowed in static context
