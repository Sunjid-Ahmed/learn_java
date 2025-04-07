class SharedResource {
    private int data; // Stores produced value
    private boolean available = false;

    synchronized void produce(int value) {
        while (available) { // If data is available, wait
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Best practice
            }
        }
        data = value;
        available = true; // Mark data as available
        System.out.println("Produced: " + data);
        notify(); // Notify waiting consumer
    }

    synchronized int consume() {
        while (!available) { // If no data, wait
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Best practice
            }
        }
        available = false; // Mark data as consumed
        System.out.println("Consumed: " + data);
        notify(); // Notify waiting producer
        return data;
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Producer thread
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    resource.produce(i);
                    try {
                        Thread.sleep(500); // Simulate production time
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });

        // Consumer thread
        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    resource.consume();
                    try {
                        Thread.sleep(500); // Simulate consumption time
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });

        // Start both threads
        producer.start();
        consumer.start();
    }
}
