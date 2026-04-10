# Custom Exceptions in Java

## 🧠 What are Custom Exceptions?

Custom exceptions are **user-defined exceptions** created to handle **specific application-level errors**.

---

## 🔑 Key Idea

> Create your own exception when built-in exceptions are not enough

---

## ⚡ Why Custom Exceptions?

* Handle domain-specific errors
* Improve code readability
* Provide meaningful error messages

---

## ⚡ How to Create Custom Exception

Create a class that extends:

* Exception → checked exception
* RuntimeException → unchecked exception

---

## ⚡ Example (Checked Exception)

```java id="l8dy3g"
class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}
```

---

## ⚡ Usage

```java id="nq6xtk"
class Demo {

    void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }

    public static void main(String[] args) {
        Demo d = new Demo();

        try {
            d.checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

---

## ⚡ Unchecked Custom Exception

```java id="7o8q9p"
class InvalidAmountException extends RuntimeException {

    InvalidAmountException(String message) {
        super(message);
    }
}
```

👉 No need to use `throws` or `try-catch` (optional)

---

## ⚠️ Important Points

* Always provide meaningful message
* Use checked exception for mandatory handling
* Use runtime exception for optional handling

---

## ⚡ Real-World Usage

* Banking systems (Invalid balance)
* Authentication (Invalid credentials)
* Validation errors

---

## 🎯 Interview Questions

**Q1: What is custom exception?**  
A: User-defined exception.

**Q2: How to create custom exception?**  
A: Extend Exception or RuntimeException.

**Q3: Difference between checked and unchecked custom exception?**  
A: Checked → must handle, Unchecked → optional.

---

## 📌 Summary

* Custom exceptions handle application-specific errors
* Extend Exception or RuntimeException
* Improve clarity and control in code
