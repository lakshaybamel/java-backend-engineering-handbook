# equals(), hashCode(), and toString() in Java

## 🧠 Overview

These three methods come from the **Object class** and are widely used for:

* Object comparison
* Hash-based collections
* Debugging and logging

---

## ⚡ 1. equals()

### What it does

Compares **content of objects**

---

### Default Behavior

```java id="5sz0k0"
class Student {}

Student s1 = new Student();
Student s2 = new Student();

System.out.println(s1.equals(s2)); // false
```

👉 Default equals() compares **reference**

---

### Overriding equals()

```java id="v8l2y2"
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student s = (Student) obj;
        return name.equals(s.name);
    }
}
```

👉 Now compares **actual content**

---

## ⚡ 2. hashCode()

### What it does

Returns an integer value used in **hash-based collections**

---

### Rule (VERY IMPORTANT)

> If two objects are equal → their hashCode must be same

---

### Example

```java id="f8o3an"
@Override
public int hashCode() {
    return name.hashCode();
}
```

---

## ⚡ equals() + hashCode() Relationship

| Condition        | Requirement           |
| ---------------- | --------------------- |
| equals() = true  | hashCode must be same |
| equals() = false | hashCode may differ   |

---

## ⚡ 3. toString()

### What it does

Returns string representation of object

---

### Default Output

```java id="qf5q3d"
Student@1b6d3586
```

---

### Overriding toString()

```java id="4lfc0p"
@Override
public String toString() {
    return "Student{name='" + name + "'}";
}
```

---

## ⚡ Combined Example

```java id="wgbwbb"
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return name.equals(s.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "'}";
    }
}
```

---

## ⚠️ Important Points

* Always override equals() and hashCode() together
* Use instanceof or getClass() for safe casting
* toString() helps in debugging

---

## ⚡ Real-World Usage

Used in:

* HashMap
* HashSet
* Logging systems

---

## 🎯 Why it matters (Interview)

* Very frequently asked:

  * equals vs ==
  * hashCode contract
* Important for:

  * Collections
  * Object comparison

---

## 🎯 Interview Questions

**Q1: Why override hashCode() when equals() is overridden?**  
A: To maintain consistency in hash-based collections.

**Q2: What happens if hashCode is not overridden?**  
A: Objects may not behave correctly in HashMap/HashSet.

**Q3: What is default equals() behavior?**  
A: Compares references.

**Q4: Why override toString()?**  
A: For readable output.

---

## 📌 Summary

* equals() → compares content
* hashCode() → used in hashing
* toString() → string representation
* All three are crucial for proper object behavior
