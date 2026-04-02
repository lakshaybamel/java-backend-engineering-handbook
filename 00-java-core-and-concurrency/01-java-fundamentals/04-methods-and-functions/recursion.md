## Recursion in Java

### What is Recursion?

Recursion is a technique where a **method calls itself** to solve a problem.

---

### 🔑 Key Components

* Base case -> stops recursion
* Recursive call -> calls the same method

---

### ⚡ Example: Factorial

```java
class Demo {

    static int factorial(int n) {
        if (n == 0) {
            return 1; // base case
        }
        return n * factorial(n - 1); // recursive call
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // 120
    }
}
```

---

### ⚡ Flow of Execution

```
factorial(5)
-> 5 * factorial(4)
-> 5 * 4 * factorial(3)
-> 5 * 4 * 3 * factorial(2)
-> 5 * 4 * 3 * 2 * factorial(1)
-> 5 * 4 * 3 * 2 * 1
```

---

### ⚡ Example: Fibonacci

```java
class Demo {

    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(5)); // 5
    }
}
```

---

### ⚡ Stack Memory Behavior

* Each recursive call is stored in **stack**
* Too many calls -> **StackOverflowError**

---

### 🎯 Why it matters (Interview)

* Common in:

  * DSA problems
  * Tree/graph problems
* Tests understanding of:

  * Stack
  * Problem breakdown

---

### 🎯 Interview Questions

**Q1: What is recursion?**  
A: A method calling itself to solve a problem.

**Q2: What is base case?**  
A: Condition that stops recursion.

**Q3: What happens if no base case?**  
A: Infinite recursion -> StackOverflowError.

**Q4: Where is recursion used?**  
A: Trees, graphs, backtracking problems.

---

### Summary

Recursion:

* Breaks problem into smaller parts
* Uses function calls repeatedly
* Requires base case to stop execution
