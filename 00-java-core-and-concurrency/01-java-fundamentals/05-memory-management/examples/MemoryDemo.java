class Demo {
    int value;

    Demo(int value) {
        this.value = value;
    }

    protected void finalize() {
        System.out.println("Object with value " + value + " is garbage collected");
    }
}

public class MemoryDemo {
    public static void main(String[] args) {

        // Creating objects
        Demo obj1 = new Demo(10);
        Demo obj2 = new Demo(20);

        // Reassigning reference
        obj1 = new Demo(30);

        // Nullifying reference
        obj2 = null;

        // Suggesting garbage collection
        System.gc();

        System.out.println("End of main method");
    }
}