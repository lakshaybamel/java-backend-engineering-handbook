import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.*;

public class ConcurrencyDemo {

    static AtomicInteger counter = new AtomicInteger(0);
    static Lock lock = new ReentrantLock();

    public static void main(String[] args) throws Exception {

        // ConcurrentHashMap
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        System.out.println("ConcurrentHashMap: " + map);

        System.out.println();

        // AtomicInteger
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementAndGet();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementAndGet();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Atomic Counter: " + counter.get());

        System.out.println();

        // ReentrantLock
        Thread t3 = new Thread(() -> {
            lock.lock();
            try {
                System.out.println("Thread 3 in critical section");
            } finally {
                lock.unlock();
            }
        });

        Thread t4 = new Thread(() -> {
            if (lock.tryLock()) {
                try {
                    System.out.println("Thread 4 acquired lock");
                } finally {
                    lock.unlock();
                }
            }
        });

        t3.start();
        t4.start();
        t3.join();
        t4.join();

        System.out.println();

        // BlockingQueue
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