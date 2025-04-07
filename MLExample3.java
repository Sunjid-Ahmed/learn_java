public class MLExample3 {
    public static void main(String args[]) {
        MyThread t1 = new MyThread("thread 1 ");
        MyThread t2 = new MyThread("thread 2 ");
        MyThread t3 = new MyThread("thread 3 ");
        t1.start();
        t2.start();
        t3.start();
    }
}

class MyThread extends Thread {
    private String threadName;

    MyThread(String name) {
        threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + "points: " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                // TODO: handle exception
            }

        }
    }
}