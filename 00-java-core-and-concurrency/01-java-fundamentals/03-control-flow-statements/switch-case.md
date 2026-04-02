## Switch Case in Java

### What is Switch Case?

Switch case is used to **select one option from multiple choices** based on a variable value.

---

### Syntax

```java
switch (expression) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code
}
```

---

### 🔑 Key Points

* Works with:

  * int, char, String, enum
* `break` prevents fall-through
* `default` executes if no case matches

---

### ⚡ Example

```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}
```

---

### ⚡ Without Break (Fall-through)

```java
int day = 1;

switch (day) {
    case 1:
        System.out.println("Monday");
    case 2:
        System.out.println("Tuesday");
}
```

👉 Output:

```
Monday
Tuesday
```

---

### ⚡ Switch with String

```java
String role = "admin";

switch (role) {
    case "admin":
        System.out.println("Full access");
        break;
    case "user":
        System.out.println("Limited access");
        break;
}
```

---

### ⚡ Modern Switch (Java 14+)

```java
int day = 2;

String result = switch (day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    default -> "Invalid";
};
```

---

### 🎯 Why it matters (Interview)

* Used for:

  * Menu-based programs
  * Role-based logic
* Cleaner than multiple if-else in some cases

---

### 🎯 Interview Questions

**Q1: When to use switch instead of if-else?**  
A: When checking a variable against multiple fixed values.

**Q2: What happens if break is missing?**  
A: Fall-through occurs (next cases execute).

**Q3: Can switch work with String?**  
A: Yes.

**Q4: What is default case?**  
A: Executes when no case matches.

---

### Summary

Switch-case:

* Simplifies multiple condition checks
* Works best for fixed values
* Requires break to avoid fall-through
