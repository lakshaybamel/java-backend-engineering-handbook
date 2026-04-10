# Thread Methods in Java

## 🧠 Overview

Java provides several methods in the `Thread` class to **control thread execution and behavior**.

---

## 🔑 Key Idea

> Thread methods help manage execution, coordination, and control of threads

---

## ⚡ 1. start()

* Starts a new thread
* Internally calls `run()`

```java
Thread t = new Thread(() -> System.out.println("Running"));
t.start();
```

---

## ⚡ 2. run()

* Contains thread logic
* Called by JVM

```java
t.run(); // runs in main thread (not new thread)
```

---

## ⚡ 3. sleep()

* Pauses thread for given time

```java
try {
    Thread.sleep(1000); // 1 second
} catch (InterruptedException e) {}
```

---

## ⚡ 4. join()

* Waits for another thread to finish

```java
t.join(); // main thread waits
```

---

## ⚡ 5. yield()

* Suggests scheduler to give chance to other threads

```java
Thread.yield();
```

---

## ⚡ 6. isAlive()

* Checks if thread is running

```java
t.isAlive();
```

---

## ⚡ 7. getName() / setName()

```java
t.setName("Worker Thread");
System.out.println(t.getName());
```

---

## ⚡ 8. currentThread()

```java
System.out.println(Thread.currentThread().getName());
```

---

## ⚡ Example

```java
class Demo extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        Demo t1 = new Demo();
        t1.setName("Thread-1");

        t1.start();

        t1.join();

        System.out.println("Main Thread Finished");
    }
}
```

---

## ⚠️ Important Points

* sleep() does not release lock
* join() is used for synchronization
* yield() is just a suggestion
* Always handle InterruptedException

---

## ⚡ Real-World Usage

* Controlling execution flow
* Managing background tasks
* Coordinating multiple threads

---

## 🎯 Interview Questions

**Q1: Difference between start() and run()?**  
A: start() creates new thread, run() does not.
 
**Q2: What does sleep() do?**  
A: Pauses thread.

**Q3: What is join()?**  
A: Waits for another thread.

**Q4: Does yield() guarantee switching?**  
A: No.

---

## 📌 Summary

* Thread methods control execution
* start(), sleep(), join() are most important
* Used for coordination and control
* Essential for multithreading
