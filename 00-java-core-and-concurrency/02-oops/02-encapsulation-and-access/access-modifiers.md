# Access Modifiers in Java

## 🧠 What are Access Modifiers?

Access modifiers define the **visibility (access level)** of classes, variables, methods, and constructors.

They help in **implementing encapsulation and controlling access**.

---

## 🔑 Types of Access Modifiers

| Modifier  | Same Class | Same Package | Subclass | Different Package   |
| --------- | ---------- | ------------ | -------- | ------------------- |
| public    | ✅          | ✅            | ✅        | ✅                   |
| protected | ✅          | ✅            | ✅        | ❌ (except subclass) |
| default   | ✅          | ✅            | ❌        | ❌                   |
| private   | ✅          | ❌            | ❌        | ❌                   |

---

## ⚡ 1. public

* Accessible from **anywhere**

```java
public class Demo {
    public int x = 10;
}
```

---

## ⚡ 2. private

* Accessible only **within the same class**

```java
class Demo {
    private int x = 10;
}
```

👉 Used for **data hiding (encapsulation)**

---

## ⚡ 3. default (no modifier)

* Accessible within **same package only**

```java
class Demo {
    int x = 10; // default access
}
```

---

## ⚡ 4. protected

* Accessible:

  * Within same package
  * In subclasses (even in different package)

```java
class Demo {
    protected int x = 10;
}
```

---

## ⚡ Example

```java
class Test {
    private int a = 1;
    int b = 2;           // default
    protected int c = 3;
    public int d = 4;
}
```

---

## 🧠 Important Notes

* private → most restricted
* public → least restricted
* default = package-private
* protected → useful in inheritance

---

## ⚡ Access Order (Most → Least Restricted)

```text
private → default → protected → public
```

---

## 🎯 Why it matters (Interview)

* Core part of:

  * Encapsulation
  * Inheritance
* Frequently asked:

  * Access levels table
  * protected behavior

---

## 🎯 Interview Questions

**Q1: What are access modifiers?**  
A: Keywords that define visibility of variables and methods.

**Q2: Difference between private and protected?**  
A: private → only class, protected → class + subclass.

**Q3: What is default access?**  
A: Access within same package only.

**Q4: Which is most restrictive modifier?**  
A: private.

---

## 📌 Summary

* Control visibility of class members
* Support encapsulation
* Four types: public, protected, default, private
* Important for secure and maintainable code
