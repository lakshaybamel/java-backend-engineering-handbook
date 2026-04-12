import java.util.concurrent.locks.*;

class Counter {
    int count = 0;

    // synchronized method
    synchronized void increment() {
        count++;
    }
}

class LockCounter {
    int count = 0;
    Lock lock = new ReentrantLock();

    void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }
}

class Shared {
    private int data;
    private boolean available = false;

    // wait-notify example
    synchronized void produce(int value) throws Exception {
        while (available) {
            wait();
        }
        data = value;
        available = true;
        System.out.println("Produced: " + value);
        notify();
    }

    synchronized void consume() throws Exception {
        while (!available) {
            wait();
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify();
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) throws Exception {

        // synchronized example
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Synchronized Count: " + c.count);

        System.out.println();

        // ReentrantLock example
        LockCounter lc = new LockCounter();

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) lc.increment();
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) lc.increment();
        });

        t3.start();
        t4.start();
        t3.join();
        t4.join();

        System.out.println("Lock Count: " + lc.count);

        System.out.println();

        // wait-notify example
        Shared shared = new Shared();

        Thread producer = new Thread(() -> {
            try {
                shared.produce(10);
            } catch (Exception e) {}
        });

        Thread consumer = new Thread(() -> {
            try {
                shared.consume();
            } catch (Exception e) {}
        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}