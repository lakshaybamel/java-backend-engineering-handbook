# Optional in Java

## 🧠 What is Optional?

`Optional` is a container object used to **avoid null values** and prevent `NullPointerException`.

👉 Introduced in Java 8

---

## 🔑 Key Idea

> Instead of returning null, return Optional

---

## ⚡ Creating Optional

### 1. of() → value must not be null

```java id="k9dzqv"
Optional<String> opt = Optional.of("Hello");
```

---

### 2. ofNullable() → allows null

```java id="4qf6cg"
Optional<String> opt = Optional.ofNullable(null);
```

---

### 3. empty()

```java id="7k6j4q"
Optional<String> opt = Optional.empty();
```

---

## ⚡ Common Methods

### isPresent()

```java id="d3a1vx"
if (opt.isPresent()) {
    System.out.println(opt.get());
}
```

---

### get()

```java id="rmh9cx"
opt.get(); // returns value (may throw exception if empty)
```

---

### orElse()

```java id="h0b4n7"
String value = opt.orElse("Default Value");
```

---

### orElseGet()

```java id="f6l3w0"
String value = opt.orElseGet(() -> "Generated Value");
```

---

### orElseThrow()

```java id="r2j7yo"
String value = opt.orElseThrow(() -> new RuntimeException("No value"));
```

---

### ifPresent()

```java id="yqv8dj"
opt.ifPresent(x -> System.out.println(x));
```

---

## ⚡ Example

```java id="k91dzc"
Optional<String> name = Optional.ofNullable("Lakshay");

String result = name.orElse("Default");

System.out.println(result);
```

---

## ⚠️ Important Points

* Avoid using get() without checking
* Prefer orElse / orElseGet
* Helps avoid NullPointerException
* Not meant for fields (mainly for return types)

---

## ⚡ Optional vs null

| Feature     | null         | Optional        |
| ----------- | ------------ | --------------- |
| Safety      | Unsafe       | Safe            |
| Readability | Low          | High            |
| Usage       | Old approach | Modern approach |

---

## ⚡ Real-World Usage

* API responses
* Service layer return values
* Avoiding null checks

---

## 🎯 Interview Questions

**Q1: What is Optional?**  
A: Container to avoid null values.

**Q2: Difference between orElse and orElseGet?**  
A: orElse → always executes, orElseGet → lazy execution.

**Q3: Why not use get()?**  
A: May throw exception if empty.

**Q4: Where to use Optional?**  
A: Return types, not fields.

---

## 📌 Summary

* Optional avoids null-related issues
* Provides safe methods to access values
* Improves readability and safety
* Important Java 8 feature
