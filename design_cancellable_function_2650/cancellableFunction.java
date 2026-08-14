package design_cancellable_function_2650;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

public class cancellableFunction {

    // Returns a pair: cancel function + future result
    public static <T> Pair<Runnable, CompletableFuture<T>> cancellable(Supplier<T> task) {
        CompletableFuture<T> future = new CompletableFuture<>();
        ExecutorService executor = Executors.newSingleThreadExecutor();

        AtomicBoolean cancelled = new AtomicBoolean(false);

        executor.submit(() -> {
            try {
                if (cancelled.get()) {
                    future.completeExceptionally(new RuntimeException("Cancelled"));
                    return;
                }
                T result = task.get();
                if (!cancelled.get()) {
                    future.complete(result);
                } else {
                    future.completeExceptionally(new RuntimeException("Cancelled"));
                }
            } catch (Exception e) {
                future.completeExceptionally(e);
            } finally {
                executor.shutdown();
            }
        });

        Runnable cancelFn = () -> {
            cancelled.set(true);
            future.completeExceptionally(new RuntimeException("Cancelled"));
            executor.shutdownNow();
        };

        return new Pair<>(cancelFn, future);
    }

    // Simple Pair class
    public static class Pair<A, B> {
        public final A first;
        public final B second;

        public Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }
    }

    // psvm example
    public static void main(String[] args) {
        // Create a cancellable task
        Pair<Runnable, CompletableFuture<Integer>> pair = cancellable(() -> {
            try {
                System.out.println("Task started...");
                Thread.sleep(3000); // simulate long work
                return 42;
            } catch (InterruptedException e) {
                throw new RuntimeException("Interrupted");
            }
        });

        Runnable cancel = pair.first;
        CompletableFuture<Integer> promise = pair.second;

        // Schedule cancellation after 1 second
        Executors.newScheduledThreadPool(1).schedule(cancel, 1, TimeUnit.SECONDS);

        // Handle result
        promise.whenComplete((res, err) -> {
            if (err != null) {
                System.out.println("Task failed: " + err.getMessage());
            } else {
                System.out.println("Task completed with result: " + res);
            }
        });
    }
}
