public class WithoutThread {

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

        // Sequential execution of tasks
        for (int i = 0; i < 5; i++) {
            timeConsumingTask(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken without threads: " + (endTime - startTime) + " milliseconds");
    }
}
