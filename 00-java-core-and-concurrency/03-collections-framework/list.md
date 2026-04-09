# List in Java

## 🧠 What is List?

`List` is an interface in the Java Collections Framework that represents an **ordered collection of elements**.

👉 It allows:

* Duplicate elements
* Indexed access
* Insertion order is maintained

---

## 🔑 Key Implementations

* ArrayList
* LinkedList
* Vector (legacy)

---

## ⚡ ArrayList

### Features

* Dynamic array
* Fast access (O(1))
* Slower insertion/deletion (shifting required)

---

### Example

```java
import java.util.*;

List<String> list = new ArrayList<>();

list.add("A");
list.add("B");
list.add("A");

System.out.println(list); // [A, B, A]
```

---

## ⚡ LinkedList

### Features

* Doubly linked list
* Fast insertion/deletion
* Slower access (O(n))

---

### Example

```java
import java.util.*;

List<Integer> list = new LinkedList<>();

list.add(10);
list.add(20);

System.out.println(list);
```

---

## ⚡ ArrayList vs LinkedList

| Feature   | ArrayList     | LinkedList         |
| --------- | ------------- | ------------------ |
| Structure | Dynamic array | Doubly linked list |
| Access    | Fast          | Slow               |
| Insertion | Slow          | Fast               |
| Memory    | Less          | More               |

---

## ⚡ Common Methods

```java
list.add(element);
list.get(index);
list.set(index, value);
list.remove(index);
list.size();
list.contains(value);
```

---

## ⚡ Iteration

```java
for (String s : list) {
    System.out.println(s);
}
```

---

## ⚠️ Important Points

* List allows duplicates
* Maintains insertion order
* ArrayList is most commonly used
* Use LinkedList when frequent insert/delete

---

## ⚡ Real-World Usage

* Storing ordered data
* Maintaining history
* Dynamic data handling

---

## 🎯 Interview Questions

**Q1: Difference between ArrayList and LinkedList?**  
A: ArrayList → fast access, LinkedList → fast insertion.

**Q2: Does List allow duplicates?**  
A: Yes.

**Q3: Which is faster for searching?**  
A: ArrayList.

---

## 📌 Summary

* List is ordered and allows duplicates
* Common implementations: ArrayList, LinkedList
* Choose based on use case (access vs modification)
