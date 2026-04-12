# Producer-Consumer Pattern in Java

## 🧠 What is Producer-Consumer?

Producer-Consumer is a design pattern where:

* **Producer** → produces data
* **Consumer** → consumes data

👉 Both share a common resource (queue/buffer)

---

## 🔑 Key Idea

> One thread produces data while another consumes it safely

---

## ⚡ Problem Without Synchronization

* Data inconsistency
* Race conditions
* Overwriting or missing data

---

## ⚡ Solution

Use:

* synchronized
* wait() and notify()

---

## ⚡ Example (Using wait/notify)

```java
class SharedBuffer {
    private int data;
    private boolean available = false;

    synchronized void produce(int value) throws Exception {
        while (available) {
            wait();
        }
        data = value;
        available = true;
        System.out.println("Produced: " + value);
        notify();
    }

    synchronized void consume() throws Exception {
        while (!available) {
            wait();
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify();
    }
}
```

---

## ⚡ Using Threads

```java
SharedBuffer buffer = new SharedBuffer();

Thread producer = new Thread(() -> {
    try {
        buffer.produce(10);
    } catch (Exception e) {}
});

Thread consumer = new Thread(() -> {
    try {
        buffer.consume();
    } catch (Exception e) {}
});

producer.start();
consumer.start();
```

---

## ⚡ Modern Approach (BlockingQueue)

```java
import java.util.concurrent.*;

BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

new Thread(() -> {
    try {
        queue.put(1);
        System.out.println("Produced");
    } catch (Exception e) {}
}).start();

new Thread(() -> {
    try {
        System.out.println("Consumed: " + queue.take());
    } catch (Exception e) {}
}).start();
```

---

## ⚡ Flow

```text
Producer → puts data → Consumer waits  
Consumer → takes data → Producer continues
```

---

## ⚠️ Important Points

* Always use while (not if)
* Prevent over-production
* Avoid data inconsistency
* BlockingQueue is preferred in real-world

---

## ⚡ Real-World Usage

* Message queues
* Job processing systems
* Streaming systems

---

## 🎯 Interview Questions

**Q1: What is producer-consumer problem?**  
A: Synchronization problem between producer and consumer threads.

**Q2: How to solve it?**  
A: Using wait/notify or BlockingQueue.

**Q3: Why use BlockingQueue?**  
A: Built-in thread safety.

**Q4: Why while loop instead of if?**  
A: To handle spurious wakeups.

---

## 📌 Summary

* Producer generates data, consumer consumes
* Requires synchronization
* BlockingQueue is modern solution
* Very important interview pattern
