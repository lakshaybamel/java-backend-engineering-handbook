# Callable and Future in Java

## 🧠 Overview

`Callable` and `Future` are used to **execute tasks that return results**.

👉 Unlike Runnable:

* Runnable → no return
* Callable → returns value

---

## 🔑 Key Idea

> Use Callable when you need a result from a thread

---

## ⚡ Callable Interface

* Located in `java.util.concurrent`
* Method: `call()`

---

### Example

```java id="z6f8kb"
import java.util.concurrent.*;

Callable<Integer> task = () -> {
    return 10 + 20;
};
```

---

## ⚡ Future Interface

* Represents result of asynchronous computation
* Used to get result later

---

### Example

```java id="7p7r2q"
ExecutorService executor = Executors.newSingleThreadExecutor();

Future<Integer> future = executor.submit(() -> 50 + 50);

System.out.println(future.get()); // 100

executor.shutdown();
```

---

## ⚡ Important Methods

```java id="8b9rda"
future.get();        // waits and returns result
future.isDone();     // checks if completed
future.cancel(true); // cancels task
```

---

## ⚡ Example with Multiple Tasks

```java id="z9x2dc"
ExecutorService executor = Executors.newFixedThreadPool(2);

Future<Integer> f1 = executor.submit(() -> 10);
Future<Integer> f2 = executor.submit(() -> 20);

System.out.println(f1.get() + f2.get());

executor.shutdown();
```

---

## ⚠️ Blocking Nature

```java id="3q8tnl"
future.get(); // blocks until result is ready
```

👉 Can slow down program if not handled properly

---

## ⚡ Runnable vs Callable

| Feature      | Runnable     | Callable  |
| ------------ | ------------ | --------- |
| Return value | No           | Yes       |
| Method       | run()        | call()    |
| Exception    | Cannot throw | Can throw |

---

## ⚡ Real-World Usage

* API calls
* Database queries
* Parallel computations
* Background processing

---

## 🎯 Interview Questions

**Q1: Difference between Runnable and Callable?**  
A: Callable returns value, Runnable does not.

**Q2: What is Future?**  
A: Represents result of async task.

**Q3: Does future.get() block?**  
A: Yes.

**Q4: Can Callable throw exception?**  
A: Yes. 

---

## 📌 Summary

* Callable returns result
* Future holds result
* Used for async programming
* Important for backend systems
