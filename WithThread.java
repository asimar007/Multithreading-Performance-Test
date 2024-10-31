public class WithThread {

    public static void timeConsumingTask(int taskId) {
        System.out.println("Task " + taskId + " started.");
        try {
            Thread.sleep(2000); // Simulating a time-consuming task (e.g., I/O operation)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Task " + taskId + " completed.");
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // Creating threads for concurrent execution of tasks
        Thread[] threads = new Thread[5];

        for (int i = 0; i < 5; i++) {
            final int taskId = i; // Effectively final variable for lambda
            threads[i] = new Thread(() -> timeConsumingTask(taskId));
            threads[i].start();
        }

        // Wait for all threads to complete
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken with threads: " + (endTime - startTime) + " milliseconds");
    }
}
