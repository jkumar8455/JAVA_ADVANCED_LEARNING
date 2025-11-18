class MyThread3 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}

class MyThread4 extends Thread {

    @Override
    public void run() {
        for (int i = 20; i >= 1; i--) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
public class MultiThreadingUsingThreadClass {
    public static void main(String[] args) {
        Thread thread1= new MyThread3();
        Thread thread2=new MyThread4();
        thread1.start();
        thread2.start();
    }
}
