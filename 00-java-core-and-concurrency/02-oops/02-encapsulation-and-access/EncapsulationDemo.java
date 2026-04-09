class Student {

    // private variables (data hiding)
    private String name;
    private int age;

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // getter for age
    public int getAge() {
        return age;
    }

    // setter with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {

        Student s = new Student();

        // setting values
        s.setName("Lakshay");
        s.setAge(22);

        // getting values
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());

        // invalid data
        s.setAge(-5); // validation check
    }
}