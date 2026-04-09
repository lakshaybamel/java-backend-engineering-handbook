# Set in Java

## 🧠 What is Set?

`Set` is an interface in the Java Collections Framework that represents a **collection of unique elements**.

👉 It does:

* NOT allow duplicates
* Does NOT guarantee order (depends on implementation)

---

## 🔑 Key Implementations

* HashSet
* LinkedHashSet
* TreeSet

---

## ⚡ HashSet

### Features

* Does not maintain order
* Based on hashing
* Fast operations (O(1) average)

---

### Example

```java
import java.util.*;

Set<String> set = new HashSet<>();

set.add("A");
set.add("B");
set.add("A");

System.out.println(set); // [A, B]
```

---

## ⚡ LinkedHashSet

### Features

* Maintains insertion order
* Slightly slower than HashSet

---

### Example

```java
Set<String> set = new LinkedHashSet<>();

set.add("A");
set.add("B");
set.add("C");

System.out.println(set); // [A, B, C]
```

---

## ⚡ TreeSet

### Features

* Sorted elements (natural order)
* Based on Red-Black Tree
* Slower (O(log n))

---

### Example

```java
Set<Integer> set = new TreeSet<>();

set.add(30);
set.add(10);
set.add(20);

System.out.println(set); // [10, 20, 30]
```

---

## ⚡ HashSet vs LinkedHashSet vs TreeSet

| Feature     | HashSet    | LinkedHashSet     | TreeSet |
| ----------- | ---------- | ----------------- | ------- |
| Order       | No         | Insertion order   | Sorted  |
| Performance | Fastest    | Slightly slower   | Slowest |
| Structure   | Hash table | Hash + LinkedList | Tree    |

---

## ⚡ Common Methods

```java
set.add(element);
set.remove(element);
set.contains(element);
set.size();
```

---

## ⚠️ Important Points

* No duplicate elements allowed
* HashSet uses hashCode() and equals()
* TreeSet requires comparable elements

---

## ⚡ Real-World Usage

* Removing duplicates
* Storing unique data
* Sorting unique elements

---

## 🎯 Interview Questions

**Q1: Does Set allow duplicates?**  
A: No.

**Q2: Difference between HashSet and TreeSet?**  
A: HashSet → unordered, TreeSet → sorted.

**Q3: Which Set maintains insertion order?**  
A: LinkedHashSet.

**Q4: Which Set is fastest?**  
A: HashSet.

---

## 📌 Summary

* Set stores unique elements
* HashSet → fastest
* LinkedHashSet → maintains order
* TreeSet → sorted collection
