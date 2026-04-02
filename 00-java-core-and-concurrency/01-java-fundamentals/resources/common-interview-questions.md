# Java Fundamentals - Common Interview Questions

This file contains **frequently asked Java interview questions** with short, clear answers for quick revision.

---

## 🧠 Data Types

**Q1: Difference between primitive and non-primitive types?**  
A: Primitive stores actual values (stack), non-primitive stores references to objects (heap).

**Q2: What is default data type of decimal numbers?**  
A: double.

**Q3: Can primitive types store null?**  
A: No.

---

## ⚡ Type Casting

**Q4: What is type casting?**  
A: Converting one data type into another.

**Q5: Difference between implicit and explicit casting?**  
A: Implicit is automatic (safe), explicit is manual (may lose data).

---

## 📦 Variables

**Q6: Types of variables in Java?**  
A: Local, Instance, Static.

**Q7: Do local variables have default values?**  
A: No.

**Q8: Where are variables stored?**  
A: Local -> stack, Instance -> heap, Static -> method area.

---

## 🔢 Operators

**Q9: Difference between == and equals()?**  
A: `==` compares reference, `equals()` compares content.

**Q10: Difference between & and &&?**  
A: `&` is bitwise, `&&` is logical (short-circuit).

**Q11: What is ternary operator?**  
A: Shorthand for if-else returning a value.

---

## 🔀 Control Flow

**Q12: Difference between if-else and switch?**  
A: if-else handles complex conditions, switch works with fixed values.

**Q13: Difference between while and do-while?**  
A: while checks condition first, do-while executes at least once.

---

## 🔁 Loops

**Q14: What is an infinite loop?**  
A: Loop that never ends due to always true condition.

**Q15: Difference between break and continue?**  
A: break exits loop, continue skips current iteration.

---

## 🧩 Methods

**Q16: What is a method?**  
A: Reusable block of code performing a task.

**Q17: Difference between static and instance methods?**  
A: Static belongs to class, instance belongs to object.

---

## 🔄 Method Overloading

**Q18: What is method overloading?**  
A: Same method name with different parameters.

**Q19: Can we overload methods by return type only?**  
A: No.

---

## 🔁 Recursion

**Q20: What is recursion?**  
A: Method calling itself.

**Q21: What is base case?**  
A: Condition that stops recursion.

---

## 📊 Arrays

**Q22: What is an array?**  
A: Collection of same type elements.

**Q23: Where are arrays stored?**  
A: Heap memory.

**Q24: Can array size be changed?**  
A: No.

---

## 🔤 Strings

**Q25: Why are strings immutable?**  
A: For security, performance, and memory optimization.

**Q26: What is String Constant Pool?**  
A: Memory area storing string literals.

**Q27: Difference between String and StringBuilder?**  
A: String is immutable, StringBuilder is mutable.

---

## 🧠 Memory Management

**Q28: Difference between stack and heap?**  
A: Stack stores variables, heap stores objects.

**Q29: What happens when we create an object?**  
A: Object stored in heap, reference stored in stack.

---

## ♻️ Garbage Collection

**Q30: What is garbage collection?**  
A: Automatic removal of unused objects from heap.

**Q31: When is an object eligible for GC?**  
A: When no references point to it.

**Q32: Can we force garbage collection?**  
A: No, only request using System.gc().

---

## ⚡ Mixed / Important

**Q33: Is Java pass by value or reference?**  
A: Always pass by value.

**Q34: Why is String immutable but StringBuilder mutable?**  
A: String is designed for safety and caching, StringBuilder for performance.

**Q35: What is short-circuit evaluation?**  
A: Skipping second condition when result is already determined.

---

## 🎯 Final Tip

Focus on:

* Differences (very important)
* Memory concepts
* Small code behavior

These questions cover **80–90% of Java fundamentals interviews**.
