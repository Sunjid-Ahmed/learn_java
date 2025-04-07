public class MultiThreadingDemo {
    public static void main(String[] args) {
        // 1st method to create a thread by extending Thread class
        MyThread thread1 = new MyThread();
        thread1.start(); // Start the thread
        // 2nd method to create a thread by implementing Runnable interface
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start(); // Start the thread
    }
}

// 1st method to create a thread by extending Thread class
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

// 2nd method to create a thread by implementing Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running using Runnable interface");
    }
}
