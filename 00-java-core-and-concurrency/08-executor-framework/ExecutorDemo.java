import java.util.concurrent.*;

public class ExecutorDemo {

    public static void main(String[] args) throws Exception {

        // Fixed Thread Pool
        ExecutorService fixedPool = Executors.newFixedThreadPool(2);

        fixedPool.execute(() -> System.out.println("Fixed Pool Task 1"));
        fixedPool.execute(() -> System.out.println("Fixed Pool Task 2"));

        fixedPool.shutdown();

        System.out.println();

        // Callable + Future
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> future = executor.submit(() -> {
            return 10 + 20;
        });

        System.out.println("Future Result: " + future.get());

        executor.shutdown();

        System.out.println();

        // Scheduled Executor
        ScheduledExecutorService scheduler =
                Executors.newScheduledThreadPool(1);

        scheduler.schedule(() -> {
            System.out.println("Scheduled Task (after 2 sec)");
        }, 2, TimeUnit.SECONDS);

        scheduler.shutdown();

        System.out.println();

        // Cached Thread Pool
        ExecutorService cachedPool = Executors.newCachedThreadPool();

        cachedPool.execute(() -> System.out.println("Cached Pool Task"));

        cachedPool.shutdown();
    }
}