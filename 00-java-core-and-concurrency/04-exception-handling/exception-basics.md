# Exception Basics in Java

## 🧠 What is an Exception?

An exception is an **unexpected event** that occurs during program execution and **disrupts the normal flow** of the program.

---

## 🔑 Key Idea

> Exceptions handle runtime errors and prevent program crash

---

## ⚡ Example

```java
int a = 10;
int b = 0;

System.out.println(a / b); // ArithmeticException
```

---

## ⚡ Types of Exceptions

### 1. Checked Exceptions

* Checked at compile time
* Must be handled

Examples:

* IOException
* SQLException

---

### 2. Unchecked Exceptions (Runtime)

* Occur at runtime
* Not mandatory to handle

Examples:

* ArithmeticException
* NullPointerException
* ArrayIndexOutOfBoundsException

---

## ⚡ Exception Hierarchy

```
Throwable
 ├── Exception
 │     ├── Checked Exceptions
 │     └── RuntimeException
 │           └── Unchecked Exceptions
 └── Error
```

---

## ⚡ Common Exceptions

* ArithmeticException → divide by zero
* NullPointerException → null reference
* ArrayIndexOutOfBoundsException → invalid index
* NumberFormatException → invalid conversion

---

## ⚡ Why Exception Handling?

* Prevents program crash
* Maintains normal flow
* Improves code reliability

---

## ⚠️ Error vs Exception

| Feature  | Exception      | Error             |
| -------- | -------------- | ----------------- |
| Type     | Recoverable    | Not recoverable   |
| Example  | IOException    | OutOfMemoryError  |
| Handling | Can be handled | Cannot be handled |

---

## 🎯 Interview Questions

**Q1: What is an exception?**  
A: Runtime abnormal condition that disrupts program flow.

**Q2: Difference between checked and unchecked exception?**  
A: Checked → compile-time, Unchecked → runtime.

**Q3: What is Throwable?**  
A: Parent class of all exceptions and errors.

**Q4: Can we handle Error?**  
A: No.

---

## 📌 Summary

* Exception = runtime error
* Two types: checked and unchecked
* Throwable is root class
* Used to handle abnormal situations
