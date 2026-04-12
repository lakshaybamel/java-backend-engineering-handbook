import java.util.concurrent.*;

// Singleton (Double-Checked Locking)
class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

// Immutable Class
final class Student {
    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}

// Producer-Consumer (BlockingQueue)
class ProducerConsumerDemo {
    public static void runDemo() throws Exception {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        Thread producer = new Thread(() -> {
            try {
                queue.put(10);
                System.out.println("Produced: 10");
            } catch (Exception e) {}
        });

        Thread consumer = new Thread(() -> {
            try {
                int val = queue.take();
                System.out.println("Consumed: " + val);
            } catch (Exception e) {}
        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}

// Main Demo
public class PatternsDemo {

    public static void main(String[] args) throws Exception {

        // Singleton
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("Singleton same instance: " + (s1 == s2));

        System.out.println();

        // Immutability
        Student s = new Student("Lakshay", 22);
        System.out.println("Immutable Object: " + s.getName() + " " + s.getAge());

        System.out.println();

        // Producer-Consumer
        ProducerConsumerDemo.runDemo();
    }
}