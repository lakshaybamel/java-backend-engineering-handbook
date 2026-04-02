## Memory Allocation Flow in Java

### What is Memory Allocation?

Memory allocation defines **how Java assigns memory** during program execution.

---

## ⚡ Step-by-Step Flow

### Example

```java
class Demo {
    int value = 10;
}

public class Test {
    public static void main(String[] args) {
        Demo obj = new Demo();
    }
}
```

---

### Step 1: Class Loading

* Class `Demo` is loaded into **method area**

---

### Step 2: Method Call

* `main()` is pushed into **stack**

---

### Step 3: Object Creation

```java
Demo obj = new Demo();
```

* Memory allocated in **heap**
* Object created with instance variables

---

### Step 4: Reference Assignment

* `obj` (reference) stored in **stack**
* Points to object in heap

---

### Step 5: Execution

* Program uses stack + heap together

---

## ⚡ Visualization

```text
Stack                 Heap
------                ------
obj  --------->       Demo object (value = 10)
```

---

## 🔑 Key Points

* Stack stores references
* Heap stores actual objects
* Method area stores class metadata
* Memory is allocated dynamically

---

## ⚡ Multiple Objects Example

```java
Demo obj1 = new Demo();
Demo obj2 = new Demo();
```

👉 Two separate objects in heap

---

## ⚡ Method Call Flow

```java
void method() {
    int x = 5;
}
```

* Method pushed into stack
* Removed after execution

---

## 🎯 Why it matters (Interview)

* Helps in:

  * Understanding object creation
  * Debugging memory issues
* Commonly asked in:

  * Java internals
  * Backend interviews

---

## 🎯 Interview Questions

**Q1: What happens when we create an object?**  
A: Memory is allocated in heap and reference stored in stack.

**Q2: Where are classes stored?**  
A: Method area.

**Q3: What is method area?**  
A: Memory area storing class-level data.

**Q4: Can multiple objects exist in heap?**  
A: Yes.

---

### Summary

Memory allocation:

* Involves stack, heap, and method area
* Follows structured flow during execution
* Essential for understanding Java behavior
