# try-catch-finally in Java

## 🧠 What is try-catch?

`try-catch` is used to **handle exceptions** and prevent program crash.

---

## 🔑 Syntax

```java
try {
    // risky code
} catch (ExceptionType e) {
    // handling code
}
```

---

## ⚡ Example

```java
int a = 10;
int b = 0;

try {
    System.out.println(a / b);
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
```

---

## ⚡ Multiple Catch Blocks

```java
try {
    int arr[] = new int[5];
    System.out.println(arr[10]);
} catch (ArithmeticException e) {
    System.out.println("Arithmetic Error");
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Index Error");
}
```

---

## ⚡ finally Block

`finally` always executes, whether exception occurs or not.

---

### Example

```java
try {
    int a = 10 / 0;
} catch (Exception e) {
    System.out.println("Exception occurred");
} finally {
    System.out.println("Always executes");
}
```

---

## ⚡ Execution Flow

```text
try → exception occurs → catch → finally
try → no exception → finally
```

---

## ⚡ Nested try-catch

```java
try {
    try {
        int a = 10 / 0;
    } catch (ArithmeticException e) {
        System.out.println("Inner catch");
    }
} catch (Exception e) {
    System.out.println("Outer catch");
}
```

---

## ⚡ Important Rules

* try must be followed by catch or finally
* Multiple catch blocks allowed
* finally always executes (except JVM crash or System.exit())

---

## ⚠️ Catch Order (Important)

```java
catch (Exception e) {}
catch (ArithmeticException e) {} // ❌ unreachable
```

👉 Always write **specific → general**

---

## 🎯 Interview Questions

**Q1: What is try-catch?**  
A: Used to handle exceptions.

**Q2: Does finally always execute?**  
A: Yes (except JVM termination).

**Q3: Can we have try without catch?**  
A: Yes, with finally.

**Q4: Can we have multiple catch blocks?**  
A: Yes.

---

## 📌 Summary

* try contains risky code
* catch handles exception
* finally executes always
* Ensures safe program execution
