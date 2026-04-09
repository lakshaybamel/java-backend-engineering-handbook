# Collections Utility Class in Java

## 🧠 What is Collections Class?

`Collections` is a utility class that provides **static methods** to operate on collections like List, Set, etc.

👉 Located in: `java.util.Collections`

---

## 🔑 Key Idea

> Provides ready-made methods for sorting, searching, and modifying collections

---

## ⚡ Common Methods

### 1. sort()

Sorts a list in ascending order

```java
import java.util.*;

List<Integer> list = new ArrayList<>();
list.add(3);
list.add(1);
list.add(2);

Collections.sort(list);

System.out.println(list); // [1, 2, 3]
```

---

### 2. reverse()

Reverses elements of list

```java
Collections.reverse(list);
```

---

### 3. shuffle()

Randomly shuffles elements

```java
Collections.shuffle(list);
```

---

### 4. min() and max()

Find minimum and maximum

```java
int min = Collections.min(list);
int max = Collections.max(list);
```

---

### 5. frequency()

Counts occurrences of element

```java
int count = Collections.frequency(list, 2);
```

---

### 6. binarySearch()

Search element in sorted list

```java
Collections.sort(list);
int index = Collections.binarySearch(list, 2);
```

---

### 7. synchronizedList()

Creates thread-safe list

```java
List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());
```

---

## ⚠️ Important Points

* Works mainly with List
* Many methods require sorted data (e.g., binarySearch)
* Methods are static → no object creation needed

---

## ⚡ Real-World Usage

* Sorting data
* Searching elements
* Preparing collections for processing

---

## 🎯 Interview Questions

**Q1: What is Collections class?**  
A: Utility class with static methods for collections.

**Q2: Difference between Collection and Collections?**  
A: Collection → interface, Collections → utility class.

**Q3: When to use binarySearch()?**  
A: On sorted collections.

---

## 📌 Summary

* Collections class provides utility methods
* Used for sorting, searching, and manipulation
* Static methods → easy to use
