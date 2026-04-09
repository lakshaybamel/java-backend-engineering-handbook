# Encapsulation in Java

## 🧠 What is Encapsulation?

Encapsulation is the process of **wrapping data (variables) and methods into a single unit (class)** and **restricting direct access to data**.

👉 It is achieved using:

* **Private variables**
* **Public getter and setter methods**

---

## 🔑 Key Idea

> Data should not be accessed directly — it should be controlled.

---

## ⚡ Example

```java
class Student {
    private String name;  // private variable

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

---

## ⚡ Usage

```java
Student s = new Student();

s.setName("Lakshay");          // setting value
System.out.println(s.getName()); // getting value
```

---

## 🔒 Why Encapsulation?

### 1. Data Hiding

* Prevents direct access to variables

### 2. Control Over Data

```java
public void setAge(int age) {
    if (age > 0) {
        this.age = age;
    }
}
```

👉 You can validate before setting values

---

### 3. Security

* Sensitive data is protected

---

### 4. Flexibility

* Internal implementation can change without affecting users

---

## ⚡ Without Encapsulation (Bad Practice)

```java
class Student {
    public String name;
}
```

👉 Anyone can modify directly → unsafe

---

## ⚡ With Encapsulation (Good Practice)

```java
class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

---

## ⚡ Real-World Example

ATM Machine:

* You don’t access bank data directly
* You use methods like:

  * withdraw()
  * deposit()

👉 Same concept as encapsulation

---

## 🎯 Why it matters (Interview)

* One of the **4 pillars of OOPS**
* Used in:

  * Backend systems
  * APIs
  * Data models

---

## 🎯 Interview Questions

**Q1: What is encapsulation?**  
A: Wrapping data and methods together and restricting access.

**Q2: How is encapsulation achieved in Java?**  
A: Using private variables and public getters/setters.

**Q3: Why is encapsulation important?**  
A: For data hiding, security, and control.

**Q4: Can encapsulation exist without getters/setters?**  
A: Yes, but controlled access is required via methods.

---

## 📌 Summary

* Encapsulation = data + methods + restricted access
* Achieved using private variables
* Access provided through methods
* Improves security and maintainability
