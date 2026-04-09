# Map in Java

## 🧠 What is Map?

`Map` is an interface in the Java Collections Framework that stores **key-value pairs**.

👉 Key features:

* Keys must be unique
* Values can be duplicate
* Each key maps to one value

---

## 🔑 Key Implementations

* HashMap
* LinkedHashMap
* TreeMap
* Hashtable (legacy)

---

## ⚡ HashMap

### Features

* Does not maintain order
* Allows one null key and multiple null values
* Fast operations (O(1) average)

---

### Example

```java id="1y9g4x"
import java.util.*;

Map<Integer, String> map = new HashMap<>();

map.put(1, "A");
map.put(2, "B");
map.put(1, "C");

System.out.println(map); // {1=C, 2=B}
```

---

## ⚡ LinkedHashMap

### Features

* Maintains insertion order
* Slightly slower than HashMap

---

### Example

```java id="d3hzlw"
Map<Integer, String> map = new LinkedHashMap<>();

map.put(1, "A");
map.put(2, "B");

System.out.println(map); // {1=A, 2=B}
```

---

## ⚡ TreeMap

### Features

* Stores keys in sorted order
* Does not allow null keys
* Based on Red-Black Tree (O(log n))

---

### Example

```java id="0kk0nx"
Map<Integer, String> map = new TreeMap<>();

map.put(3, "C");
map.put(1, "A");
map.put(2, "B");

System.out.println(map); // {1=A, 2=B, 3=C}
```

---

## ⚡ HashMap vs LinkedHashMap vs TreeMap

| Feature     | HashMap     | LinkedHashMap   | TreeMap     |
| ----------- | ----------- | --------------- | ----------- |
| Order       | No          | Insertion order | Sorted      |
| Null Keys   | Allowed (1) | Allowed (1)     | Not allowed |
| Performance | Fastest     | Slightly slower | Slowest     |

---

## ⚡ Common Methods

```java id="s1xk6q"
map.put(key, value);
map.get(key);
map.remove(key);
map.containsKey(key);
map.containsValue(value);
map.size();
```

---

## ⚡ Iteration

```java id="q7y1xm"
for (Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " " + entry.getValue());
}
```

---

## ⚠️ Important Points

* HashMap uses hashCode() and equals()
* Keys must be unique
* TreeMap sorts based on keys

---

## ⚡ Real-World Usage

* Storing key-value data
* Caching
* Database-like mapping

---

## 🎯 Interview Questions

**Q1: Difference between HashMap and TreeMap?**  
A: HashMap → unordered, TreeMap → sorted.

**Q2: Can HashMap have null key?**  
A: Yes (one).

**Q3: What happens if duplicate key is added?**  
A: Value gets replaced.

**Q4: Why hashCode() is important in HashMap?**  
A: Used for indexing and fast access.

---

## 📌 Summary

* Map stores key-value pairs
* HashMap → fastest and most used
* LinkedHashMap → maintains order
* TreeMap → sorted keys
