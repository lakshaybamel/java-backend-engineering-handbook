# volatile Keyword in Java

## 🧠 What is volatile?

`volatile` is a keyword used to ensure **visibility of changes across threads**.

👉 When a variable is declared volatile:

* It is always read from **main memory**
* Not from thread-local cache

---

## 🔑 Key Idea

> Changes made by one thread are immediately visible to other threads

---

## ⚡ Problem Without volatile

```java
class Demo {
    static boolean flag = false;

    public static void main(String[] args) {

        new Thread(() -> {
            while (!flag) {
                // loop
            }
            System.out.println("Stopped");
        }).start();

        flag = true;
    }
}
```

👉 Thread may never stop because it reads cached value

---

## ⚡ Solution Using volatile

```java
class Demo {
    static volatile boolean flag = false;

    public static void main(String[] args) {

        new Thread(() -> {
            while (!flag) {}
            System.out.println("Stopped");
        }).start();

        flag = true;
    }
}
```

👉 Now change is visible immediately

---

## ⚡ What volatile Guarantees

* Visibility → ✔
* Atomicity → ❌

---

## ⚠️ Important Limitation

```java
volatile int count = 0;

count++; // NOT atomic
```

👉 Still unsafe in multithreading

---

## ⚡ When to Use volatile

* Flag variables
* Status indicators
* Simple state sharing

---

## ⚡ volatile vs synchronized

| Feature     | volatile | synchronized |
| ----------- | -------- | ------------ |
| Visibility  | Yes      | Yes          |
| Atomicity   | No       | Yes          |
| Locking     | No       | Yes          |
| Performance | Fast     | Slower       |

---

## ⚠️ Important Points

* Does not provide thread safety fully
* Only ensures visibility
* Not suitable for complex operations

---

## ⚡ Real-World Usage

* Stop flags
* Status signals
* Lightweight synchronization

---

## 🎯 Interview Questions

**Q1: What does volatile do?**  
A: Ensures visibility across threads.

**Q2: Does volatile guarantee atomicity?**  
A: No.

**Q3: Difference between volatile and synchronized?**  
A: volatile → visibility, synchronized → visibility + atomicity.

**Q4: When to use volatile?**  
A: For simple shared variables.

---

## 📌 Summary

* volatile ensures visibility
* Does not ensure atomicity
* Used for simple shared variables
* Important concurrency concept
