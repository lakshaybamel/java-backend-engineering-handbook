## Break and Continue in Java

### What are break and continue?

They are used to **control the flow of loops**.

---

## Break Statement

### What is break?

Break is used to **exit the loop immediately**.

---

### ⚡ Example

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        break;
    }
    System.out.println(i);
}
```

👉 Output:

```text
1
2
```

---

### 🔑 Key Points

* Terminates loop instantly
* Used in:

  * Loops
  * Switch-case

---

## Continue Statement

### What is continue?

Continue is used to **skip current iteration** and move to next.

---

### ⚡ Example

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;
    }
    System.out.println(i);
}
```

👉 Output:

```text
1
2
4
5
```

---

### 🔑 Key Points

* Skips only current iteration
* Loop continues execution

---

### ⚡ Example with While Loop

```java
int i = 0;

while (i < 5) {
    i++;

    if (i == 3) {
        continue;
    }

    System.out.println(i);
}
```

---

### 🎯 Why it matters (Interview)

* Used in:

  * Loop optimization
  * Filtering conditions
* Common in DSA problems

---

### 🎯 Interview Questions

**Q1: Difference between break and continue?**  
A: break exits loop, continue skips current iteration.

**Q2: Can break be used in switch?**  
A: Yes.

**Q3: Does continue stop the loop?**  
A: No, it only skips one iteration.

---

### Summary

Break and continue:

* Control loop execution
* Help in optimizing logic
* Improve readability of conditions
