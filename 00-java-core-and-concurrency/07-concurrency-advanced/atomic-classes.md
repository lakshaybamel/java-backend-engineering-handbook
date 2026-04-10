# Atomic Classes in Java

## 🧠 What are Atomic Classes?

Atomic classes provide **thread-safe operations without using synchronization**.

👉 Located in: `java.util.concurrent.atomic`

---

## 🔑 Key Idea

> Perform operations atomically using low-level CPU instructions (CAS)

---

## ⚡ Why Atomic Classes?

Problem with normal variable:

```java
int count = 0;
count++; // NOT thread-safe
```

👉 Multiple threads can cause incorrect result

---

## ⚡ Solution Using AtomicInteger

```java id="s2tpxd"
import java.util.concurrent.atomic.AtomicInteger;

AtomicInteger count = new AtomicInteger(0);

count.incrementAndGet();
System.out.println(count.get());
```

---

## ⚡ Common Atomic Classes

* AtomicInteger
* AtomicLong
* AtomicBoolean
* AtomicReference

---

## ⚡ Common Methods

```java id="zq3yvn"
count.incrementAndGet();   // ++count
count.getAndIncrement();   // count++
count.decrementAndGet();
count.addAndGet(5);
count.get();
```

---

## ⚡ Example

```java id="b5k9vb"
import java.util.concurrent.atomic.AtomicInteger;

public class Demo {

    static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count.incrementAndGet();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count.incrementAndGet();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count: " + count.get());
    }
}
```

---

## ⚡ CAS (Compare And Swap)

Atomic classes use:

```text id="m9l1pt"
Compare current value → If same → update → else retry
```

👉 Lock-free mechanism

---

## ⚡ Atomic vs volatile vs synchronized

| Feature     | volatile | synchronized | Atomic Classes |
| ----------- | -------- | ------------ | -------------- |
| Visibility  | Yes      | Yes          | Yes            |
| Atomicity   | No       | Yes          | Yes            |
| Locking     | No       | Yes          | No             |
| Performance | Fast     | Slow         | Fast           |

---

## ⚠️ Important Points

* Atomic classes are thread-safe
* No explicit locking required
* Best for counters and simple operations
* Not suitable for complex logic

---

## ⚡ Real-World Usage

* Counters
* Metrics tracking
* Concurrent systems

---

## 🎯 Interview Questions

**Q1: What are atomic classes?**  
A: Thread-safe classes without synchronization.

**Q2: What is CAS?**  
A: Compare and Swap mechanism.

**Q3: Difference between AtomicInteger and int?**  
A: AtomicInteger is thread-safe.

**Q4: When to use atomic classes?**  
A: For counters and simple shared variables.

---

## 📌 Summary

* Atomic classes provide thread safety without locks
* Use CAS for atomic operations
* Better than volatile for updates
* Important for concurrency design
