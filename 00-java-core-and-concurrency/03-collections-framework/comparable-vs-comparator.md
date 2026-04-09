# Comparable vs Comparator in Java

## 🧠 Overview

Both Comparable and Comparator are used to **sort objects in Java**.

👉 Difference:

* Comparable → defines natural ordering
* Comparator → defines custom ordering

---

## ⚡ Comparable

### Key Points

* Present in `java.lang`
* Class implements Comparable
* Method: `compareTo()`

---

### Example

```java
import java.util.*;

class Student implements Comparable<Student> {
    int age;

    Student(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
        return this.age - s.age;
    }
}

public class Demo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(22));
        list.add(new Student(18));
        list.add(new Student(20));

        Collections.sort(list);

        for (Student s : list) {
            System.out.println(s.age);
        }
    }
}
```

---

## ⚡ Comparator

### Key Points

* Present in `java.util`
* External sorting logic
* Method: `compare()`

---

### Example

```java
import java.util.*;

class Student {
    int age;

    Student(int age) {
        this.age = age;
    }
}

class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;
    }
}

public class Demo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(22));
        list.add(new Student(18));
        list.add(new Student(20));

        Collections.sort(list, new AgeComparator());

        for (Student s : list) {
            System.out.println(s.age);
        }
    }
}
```

---

## ⚡ Comparable vs Comparator

| Feature        | Comparable   | Comparator    |
| -------------- | ------------ | ------------- |
| Package        | java.lang    | java.util     |
| Method         | compareTo()  | compare()     |
| Logic Location | Inside class | Outside class |
| Flexibility    | Less         | More          |
| Multiple Sorts | Not possible | Possible      |

---

## ⚠️ Important Points

* Comparable modifies the class
* Comparator keeps class unchanged
* Comparator allows multiple sorting logic

---

## ⚡ When to Use

* Comparable → default sorting
* Comparator → custom sorting

---

## 🎯 Interview Questions

**Q1: Difference between Comparable and Comparator?**  
A: Comparable → internal sorting, Comparator → external sorting.

**Q2: Which is more flexible?**  
A: Comparator.

**Q3: Can we use both together?**  
A: Yes.

---

## 📌 Summary

* Comparable → natural ordering
* Comparator → custom ordering
* Comparator is more flexible and widely used
