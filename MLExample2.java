public class MLExample2 {

    public static void main(String args[]) {
        MyThread t1 = new MyThread("thread 1 ");
        MyThread t2 = new MyThread("thread 2 ");
        MyThread t3 = new MyThread("thread 3 ");
        try {
            int result2 = 10 / 0;
        } catch (Exception e) {
            System.out.println("ArithmeticException caught here: " + e.getMessage());
        }
        // int result2 = 10 / 0; // This line will cause an exception and so that the
        // next line will not be executed
        System.out.println("state before starting threads: " + t1.getState());
        t1.start();
        try {
            t1.join(); // Wait for thread 1 to finish before starting thread 2 and 3
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("state after starting thread 1: " + t1.getState());
        t2.start();
        t3.start();
        // int result = 10 / 0; // This line will cause an exception
    }

    public static class MyThread extends Thread {
        private String threadName;

        MyThread(String name) {
            threadName = name;
        }

        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " prints: " + i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    // Handle exception if needed
                }
            }
        }
    }
}
