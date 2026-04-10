# Concurrent Collections in Java

## 🧠 What are Concurrent Collections?

Concurrent collections are **thread-safe data structures** designed to handle **multiple threads efficiently**.

👉 Part of `java.util.concurrent` package

---

## 🔑 Key Idea

> Provide thread safety without blocking entire collection (better than synchronized collections)

---

## ⚡ Why Not Use Collections.synchronized?

* Locks entire collection
* Poor performance in multithreading

👉 Concurrent collections use **fine-grained locking or lock-free algorithms**

---

## ⚡ Key Concurrent Collections

* ConcurrentHashMap
* CopyOnWriteArrayList
* CopyOnWriteArraySet
* BlockingQueue (e.g., ArrayBlockingQueue)

---

## ⚡ 1. ConcurrentHashMap

### Features

* Thread-safe
* Allows concurrent read/write
* No full locking

---

### Example

```java
import java.util.concurrent.*;

ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

map.put(1, "A");
map.put(2, "B");

System.out.println(map);
```

---

## ⚡ 2. CopyOnWriteArrayList

### Features

* Creates new copy on modification
* Safe for iteration
* Good for read-heavy operations

---

### Example

```java
import java.util.concurrent.*;

CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

list.add(1);
list.add(2);

for (int i : list) {
    System.out.println(i);
}
```

---

## ⚡ 3. CopyOnWriteArraySet

* Similar to CopyOnWriteArrayList
* No duplicates allowed

---

## ⚡ 4. BlockingQueue

### Features

* Thread-safe queue
* Used in producer-consumer problems

---

### Example

```java
import java.util.concurrent.*;

BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

queue.put(1);  // waits if full
queue.take();  // waits if empty
```

---

## ⚡ Concurrent vs Synchronized Collections

| Feature     | Synchronized    | Concurrent              |
| ----------- | --------------- | ----------------------- |
| Locking     | Full collection | Partial / segment-based |
| Performance | Slow            | Fast                    |
| Scalability | Low             | High                    |

---

## ⚠️ Important Points

* ConcurrentHashMap is most used
* CopyOnWrite is good for read-heavy scenarios
* BlockingQueue used in thread communication
* Avoid synchronized collections in high concurrency

---

## ⚡ Real-World Usage

* Web servers
* Multi-user systems
* Caching systems
* Producer-consumer problems

---

## 🎯 Interview Questions

**Q1: What are concurrent collections?**  
A: Thread-safe collections for multithreading.

**Q2: Difference between HashMap and ConcurrentHashMap?**  
A: ConcurrentHashMap is thread-safe.

**Q3: What is CopyOnWrite?**  
A: Creates new copy on modification.

**Q4: Where is BlockingQueue used?**  
A: Producer-consumer pattern. 

---

## 📌 Summary

* Concurrent collections are thread-safe and efficient
* Better than synchronized collections
* Used in real-world concurrent systems
* Important for backend and system design
