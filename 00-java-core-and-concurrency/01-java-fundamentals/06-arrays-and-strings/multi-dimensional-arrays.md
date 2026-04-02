## Multi-Dimensional Arrays in Java

### What are Multi-Dimensional Arrays?

Arrays that contain other arrays are called multi-dimensional arrays.

Most common type:

* 2D array (matrix)

---

### 🔑 Key Points

* Represented as rows and columns
* Stored in heap
* Each row is an array

---

### ⚡ Declaration

```java
int[][] matrix;
```

---

### ⚡ Initialization

```java
matrix = new int[3][3];
```

---

### ⚡ Declaration + Initialization

```java
int[][] matrix = new int[2][2];
```

---

### ⚡ Direct Initialization

```java
int[][] matrix = {
    {1, 2},
    {3, 4}
};
```

---

### ⚡ Accessing Elements

```java
System.out.println(matrix[0][1]); // 2
```

---

### ⚡ Traversing 2D Array

```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

---

### ⚡ Enhanced For Loop

```java
for (int[] row : matrix) {
    for (int val : row) {
        System.out.print(val + " ");
    }
    System.out.println();
}
```

---

### ⚡ Jagged Array (Different Column Sizes)

```java
int[][] arr = new int[2][];

arr[0] = new int[2];
arr[1] = new int[3];
```

---

### 🎯 Why it matters (Interview)

* Used in:

  * Matrix problems
  * Graph problems
* Important for DSA

---

### 🎯 Interview Questions

**Q1: What is a 2D array?**  
A: Array of arrays.

**Q2: How is 2D array stored?**  
A: As multiple 1D arrays.

**Q3: What is jagged array?**  
A: Rows with different column sizes.

**Q4: How to traverse 2D array?**  
A: Using nested loops.

---

### Summary

Multi-dimensional arrays:

* Represent matrices
* Use nested loops for traversal
* Important for problem solving
