## Method Overloading in Java

### What is Method Overloading?

Method overloading allows **multiple methods with the same name** but **different parameters** in the same class.

---

### 🔑 Key Points

* Method name must be same
* Parameters must be different (type, number, or order)
* Return type alone is not enough

---

### ⚡ Example

```java
class Demo {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

---

### ⚡ Types of Overloading

#### 1. Different Number of Parameters

```java
add(int a, int b)
add(int a, int b, int c)
```

#### 2. Different Data Types

```java
add(int a, int b)
add(double a, double b)
```

#### 3. Different Order of Parameters

```java
add(int a, double b)
add(double a, int b)
```

---

### ❌ Invalid Overloading

```java
int add(int a, int b)
double add(int a, int b)
```

👉 Not allowed (only return type changed)

---

### ⚡ Example Usage

```java
public class Demo {
    public static void main(String[] args) {

        Demo obj = new Demo();

        System.out.println(obj.add(2, 3));
        System.out.println(obj.add(2, 3, 4));
        System.out.println(obj.add(2.5, 3.5));
    }
}
```

---

### 🎯 Why it matters (Interview)

* Demonstrates:

  * Compile-time polymorphism
* Used in:

  * API design
  * Clean code practices

---

### 🎯 Interview Questions

**Q1: What is method overloading?**  
A: Same method name with different parameters.

**Q2: Can we overload methods by changing return type only?**  
A: No.

**Q3: What type of polymorphism is this?**  
A: Compile-time polymorphism.

**Q4: Why is method overloading used?**  
A: To improve readability and flexibility.

---

### Summary

Method overloading:

* Improves code readability
* Provides flexibility
* Is an example of compile-time polymorphism
