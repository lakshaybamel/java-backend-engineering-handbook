## Arrays in Java (Basics)

### What is an Array?

An array is a collection of elements of the **same data type**, stored in **contiguous memory locations**.

---

### 🔑 Key Points

* Fixed size
* Stores elements of same type
* Indexed (0-based indexing)
* Stored in **heap memory**

---

### ⚡ Declaration

```java
int[] arr;
```

---

### ⚡ Initialization

```java
arr = new int[5];
```

---

### ⚡ Declaration + Initialization

```java
int[] arr = new int[5];
```

---

### ⚡ Direct Initialization

```java
int[] arr = {1, 2, 3, 4, 5};
```

---

### ⚡ Accessing Elements

```java
int[] arr = {10, 20, 30};

System.out.println(arr[0]); // 10
System.out.println(arr[1]); // 20
```

---

### ⚡ Looping Through Array

```java
int[] arr = {1, 2, 3, 4};

for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

---

### ⚡ Enhanced For Loop

```java
for (int num : arr) {
    System.out.println(num);
}
```

---

### ⚡ Default Values

| Type    | Default Value |
| ------- | ------------- |
| int     | 0             |
| double  | 0.0           |
| boolean | false         |
| object  | null          |

---

### ⚡ Example

```java
int[] arr = new int[3];

arr[0] = 10;
arr[1] = 20;
arr[2] = 30;

System.out.println(arr[2]); // 30
```

---

### 🎯 Why it matters (Interview)

* Base for:

  * DSA problems
  * Searching & sorting
* Frequently asked:

  * Indexing
  * Traversal

---

### 🎯 Interview Questions

**Q1: What is an array?**  
A: A collection of elements of same type stored in contiguous memory.

**Q2: Where are arrays stored?**  
A: Heap memory.

**Q3: What is array index?**  
A: Position of element (starts from 0).

**Q4: Can array size change?**  
A: No, it is fixed.

---

### Summary

Arrays:

* Store multiple values efficiently
* Use indexing for access
* Are fundamental for problem solving
