# Thread Lifecycle in Java

## 🧠 What is Thread Lifecycle?

Thread lifecycle represents the **different states a thread goes through during its execution**.

---

## 🔑 Key Idea

> A thread does not run directly — it moves through different states

---

## ⚡ Thread States

```text
NEW → RUNNABLE → RUNNING → BLOCKED / WAITING → TERMINATED
```

---

## ⚡ 1. NEW

* Thread is created but not started

```java
Thread t = new Thread();
```

---

## ⚡ 2. RUNNABLE

* Thread is ready to run
* Waiting for CPU allocation

```java
t.start();
```

---

## ⚡ 3. RUNNING

* Thread is executing
* Controlled by CPU scheduler

---

## ⚡ 4. BLOCKED / WAITING

* Thread is paused temporarily

### Reasons:

* Waiting for resource
* sleep()
* wait()
* join()

---

## ⚡ 5. TERMINATED

* Thread execution is completed

---

## ⚡ Example

```java id="t2e7bn"
class Demo extends Thread {
    public void run() {
        System.out.println("Thread running");
    }
}

public class Main {
    public static void main(String[] args) {
        Demo t = new Demo();   // NEW
        t.start();             // RUNNABLE → RUNNING
    }
}
```

---

## ⚡ Lifecycle Flow (Simplified)

```text
NEW
 ↓
RUNNABLE
 ↓
RUNNING
 ↓
WAITING / BLOCKED
 ↓
RUNNING
 ↓
TERMINATED
```

---

## ⚠️ Important Points

* start() moves thread to runnable state
* run() is executed by JVM
* Thread may go back to runnable from waiting
* Scheduler decides execution

---

## ⚡ Methods Affecting Lifecycle

* start() → begin execution
* sleep() → pause thread
* wait() → release lock and wait
* notify() → resume waiting thread
* join() → wait for another thread

---

## 🎯 Interview Questions

**Q1: What are thread states?**  
A: New, Runnable, Running, Waiting/Blocked, Terminated.

**Q2: Difference between start() and run()?**  
A: start() creates new thread, run() executes method.

**Q3: Who decides thread execution?**  
A: CPU scheduler.

**Q4: Can a thread restart after termination?**  
A: No.

---

## 📌 Summary

* Thread goes through multiple states
* Lifecycle controlled by JVM
* Understanding states is important for debugging
* Key topic in multithreading interviews
