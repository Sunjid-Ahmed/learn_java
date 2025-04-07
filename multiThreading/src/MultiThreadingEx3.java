public class MultiThreadingEx3 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        MyThread t3 = new MyThread("Thread 3");
        System.out.println("state before starting threads:"+t1.getState());
       
      try { 
    	  int result=10/0;
      }catch(Exception e ){
    	  System.out.println("ArithmeticException caught here:"+e.getMessage());
      }
        t1.start();
        try {
			t1.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
        System.out.println("state before starting threads:"+t1.getState());
        t2.start();
        System.out.println("state before starting threads:"+t2.getState());
        t3.start();
    }
}

class MyThread extends Thread {
    private final String threadName;

    MyThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " points: " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
              
            }
        }
    }
}
