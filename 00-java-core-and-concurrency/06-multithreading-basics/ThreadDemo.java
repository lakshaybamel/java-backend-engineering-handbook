public class ThreadDemo {

    // Using Runnable
    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("Runnable Thread: " + Thread.currentThread().getName());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }

    // Using Thread class
    static class MyThread extends Thread {
        public void run() {
            System.out.println("Thread Class: " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws Exception {

        // Creating Threads
        Thread t1 = new MyThread();
        t1.setName("T1");

        Thread t2 = new Thread(new MyRunnable());
        t2.setName("T2");

        // Lambda Thread
        Thread t3 = new Thread(() -> {
            System.out.println("Lambda Thread: " + Thread.currentThread().getName());
        });
        t3.setName("T3");

        // Start Threads
        t1.start();
        t2.start();
        t3.start();

        // Thread Methods
        System.out.println("Is T1 alive? " + t1.isAlive());

        t1.join(); // wait for t1
        t2.join();
        t3.join();

        System.out.println("All threads completed");

        // Current Thread
        System.out.println("Main Thread: " + Thread.currentThread().getName());
    }
}