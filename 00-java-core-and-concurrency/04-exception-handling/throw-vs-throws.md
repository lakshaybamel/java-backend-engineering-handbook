# throw vs throws in Java

## 🧠 Overview

Both `throw` and `throws` are used in exception handling, but they serve **different purposes**.

---

## ⚡ throw

### What it does

Used to **explicitly throw an exception**

---

### Syntax

```java
throw new ExceptionType("message");
```

---

### Example

```java id="q4l3np"
public class Demo {
    public static void main(String[] args) {
        int age = -5;

        if (age < 0) {
            throw new ArithmeticException("Invalid age");
        }
    }
}
```

---

## ⚡ throws

### What it does

Used to **declare exceptions** that a method may throw

---

### Syntax

```java
void method() throws ExceptionType
```

---

### Example

```java id="v0c1r8"
import java.io.*;

class Demo {

    void readFile() throws IOException {
        FileReader file = new FileReader("test.txt");
    }
}
```

---

## ⚡ throw vs throws

| Feature       | throw            | throws                       |
| ------------- | ---------------- | ---------------------------- |
| Purpose       | Throw exception  | Declare exception            |
| Usage         | Inside method    | With method signature        |
| Keyword count | Single exception | Multiple exceptions possible |
| Type          | Object           | Class name                   |

---

## ⚠️ Important Points

* `throw` is used to create and throw exception
* `throws` is used to inform compiler about exception
* Checked exceptions usually require `throws`

---

## ⚡ Combined Example

```java id="0i4qz7"
class Demo {

    void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Not eligible");
        }
    }
}
```

---

## 🎯 Interview Questions

**Q1: Difference between throw and throws?**  
A: throw → used to throw exception, throws → used to declare exception.

**Q2: Can we use multiple exceptions with throw?**  
A: No.

**Q3: Can throws be used without throw?**  
A: Yes.

---

## 📌 Summary

* throw → used to throw exception manually
* throws → used to declare exception
* Both are important for exception handling
