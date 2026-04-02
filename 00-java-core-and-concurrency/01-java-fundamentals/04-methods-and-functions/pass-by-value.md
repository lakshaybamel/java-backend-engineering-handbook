## Pass by Value in Java

### What is Pass by Value?

In Java, **all arguments are passed by value**.

This means:

* A **copy of the variable** is passed to the method
* Changes inside the method **do not affect original variable**

---

### 🔑 Key Points

* Java does NOT support pass by reference
* Only **copies are passed**
* Applies to both:

  * Primitive types
  * Object references

---

### ⚡ Example (Primitive)

```java
class Demo {
    static void changeValue(int x) {
        x = 50;
    }

    public static void main(String[] args) {
        int a = 10;

        changeValue(a);

        System.out.println(a); // 10
    }
}
```

👉 Original value does not change

---

### ⚡ Example (Object Reference)

```java
class Demo {
    int value = 10;
}

class Test {
    static void changeObject(Demo obj) {
        obj.value = 50;
    }

    public static void main(String[] args) {
        Demo d = new Demo();

        changeObject(d);

        System.out.println(d.value); // 50
    }
}
```

👉 Object content changes because reference copy points to same object

---

### ⚡ Important Understanding

* Reference is passed **by value (copy of reference)**
* Both copies point to **same object in heap**

---

### 🎯 Why it matters (Interview)

* One of the **most asked questions**
* Common confusion:

  * Pass by value vs reference

---

### 🎯 Interview Questions

**Q1: Is Java pass by value or reference?**  
A: Java is strictly pass by value.

**Q2: Why object values change if Java is pass by value?**  
A: Because reference copy points to same object.

**Q3: Can we change original primitive value inside method?**  
A: No.

**Q4: What is passed in case of objects?**  
A: Copy of reference.

---

### Summary

Pass by value:

* Always passes a copy
* Primitives remain unchanged
* Objects can be modified via reference copy
