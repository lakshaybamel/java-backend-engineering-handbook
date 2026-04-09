# Object Class Methods in Java

## 🧠 What is Object Class?

`Object` is the **root class of Java**.

👉 Every class in Java **implicitly extends Object class**

---

## 🔑 Key Idea

> All Java classes inherit common methods from Object class

---

## ⚡ Common Methods of Object Class

### 1. toString()

Returns string representation of object

```java
class Student {
    String name = "Lakshay";
}

public class Demo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.toString());
    }
}
```

👉 Default output: `ClassName@hashcode`

---

### 2. equals()

Used to compare two objects

```java
String a = new String("Hello");
String b = new String("Hello");

System.out.println(a.equals(b)); // true
```

👉 Compares **content**, not reference

---

### 3. hashCode()

Returns integer value (hash value) of object

```java
String a = "Hello";
System.out.println(a.hashCode());
```

👉 Used in hashing (HashMap, HashSet)

---

### 4. getClass()

Returns runtime class of object

```java
Student s = new Student();
System.out.println(s.getClass());
```

---

### 5. clone()

Creates a copy of object (needs implementation)

---

### 6. finalize() (Deprecated)

Called before object is garbage collected

👉 Not used in modern Java

---

## ⚡ Default Behavior

```java
Student s1 = new Student();
Student s2 = new Student();

System.out.println(s1 == s2);       // false
System.out.println(s1.equals(s2));  // false
```

👉 Default equals() compares **reference**

---

## ⚠️ Important Notes

* equals() and hashCode() should be overridden together
* toString() should be overridden for meaningful output
* Object class is base of all classes

---

## 🎯 Why it matters (Interview)

* Very frequently asked:

  * equals vs ==
  * hashCode importance
* Used in:

  * Collections framework
  * Hash-based structures

---

## 🎯 Interview Questions

**Q1: What is Object class?**  
A: Root class of Java.

**Q2: What does toString() do?**  
A: Returns string representation of object.

**Q3: Difference between == and equals()?**  
A: `==` compares reference, `equals()` compares content.

**Q4: Why hashCode() is used?**  
A: For hashing in collections.

---

## 📌 Summary

* Object is parent of all classes
* Provides common methods like toString(), equals(), hashCode()
* Important for collections and comparisons
