# Streams API in Java

## 🧠 What is Streams API?

Streams API is used to **process collections of data in a functional style**.

👉 Introduced in Java 8 to perform operations like:

* Filtering
* Mapping
* Sorting
* Aggregation

---

## 🔑 Key Idea

> Process data in a pipeline (no modification of original data)

---

## ⚡ Example

```java id="qk3n2g"
import java.util.*;

List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

list.stream()
    .filter(x -> x % 2 == 0)
    .forEach(System.out::println);
```

---

## ⚡ Stream Pipeline

```text id="jvb7q6"
Source → Intermediate Operations → Terminal Operation
```

Example:

```java id="1f89hh"
list.stream()              // Source
    .filter(x -> x > 2)    // Intermediate
    .map(x -> x * 2)       // Intermediate
    .forEach(System.out::println); // Terminal
```

---

## ⚡ Types of Operations

### 1. Intermediate Operations

* Return a stream
* Lazy (executed only when terminal operation is called)

Examples:

* filter()
* map()
* sorted()
* distinct()

---

### 2. Terminal Operations

* Produce result
* Trigger execution

Examples:

* forEach()
* collect()
* count()
* reduce()

---

## ⚡ Common Methods

### filter()

```java id="r3ybz2"
list.stream()
    .filter(x -> x > 2)
    .forEach(System.out::println);
```

---

### map()

```java id="jlwm31"
list.stream()
    .map(x -> x * 2)
    .forEach(System.out::println);
```

---

### sorted()

```java id="3h6trc"
list.stream()
    .sorted()
    .forEach(System.out::println);
```

---

### collect()

```java id="uz67zb"
import java.util.stream.Collectors;

List<Integer> result = list.stream()
    .filter(x -> x > 2)
    .collect(Collectors.toList());
```

---

### count()

```java id="3i5w5z"
long count = list.stream()
    .filter(x -> x > 2)
    .count();
```

---

### reduce()

```java id="tvk7g5"
int sum = list.stream()
    .reduce(0, (a, b) -> a + b);
```

---

## ⚡ forEach vs Stream

* forEach → iteration
* stream → processing pipeline

---

## ⚡ Parallel Streams

```java id="m8l4xb"
list.parallelStream()
    .forEach(System.out::println);
```

👉 Uses multiple threads

---

## ⚠️ Important Points

* Streams do not store data
* Streams do not modify original collection
* Lazy execution improves performance
* Can be used only once

---

## ⚡ Real-World Usage

* Filtering data from database
* Processing large datasets
* Transforming collections

---

## 🎯 Interview Questions

**Q1: What is stream?**  
A: Sequence of elements for processing data.

**Q2: Difference between intermediate and terminal operations?**  
A: Intermediate → lazy, Terminal → executes.

**Q3: Does stream modify original data?**  
A: No.

**Q4: What is reduce()?**  
A: Aggregates values into single result.

---

## 📌 Summary

* Streams process data efficiently
* Uses functional programming style
* Pipeline = source → operations → result
* Most important Java 8 feature
