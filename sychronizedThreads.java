class Counter {
    int count = 0;

    // Synchronize the increment method to ensure thread safety
    public synchronized void increment() {
        // if we do not use sychronized , then it will called race condition.
        count++;
    } 

    public int getCount() { 
        return count;
    } 
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create two threads that will increment the counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // Print the final count
        System.out.println("Final count: " + counter.getCount());
    }
}
