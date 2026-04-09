class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student s = (Student) obj;
        return age == s.age && name.equals(s.name);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class ObjectClassDemo {
    public static void main(String[] args) {

        Student s1 = new Student("Lakshay", 22);
        Student s2 = new Student("Lakshay", 22);
        Student s3 = new Student("Rahul", 25);

        // equals()
        System.out.println("s1 equals s2: " + s1.equals(s2)); // true
        System.out.println("s1 equals s3: " + s1.equals(s3)); // false

        // hashCode()
        System.out.println("s1 hashCode: " + s1.hashCode());
        System.out.println("s2 hashCode: " + s2.hashCode());

        // toString()
        System.out.println(s1);
        System.out.println(s3);
    }
}