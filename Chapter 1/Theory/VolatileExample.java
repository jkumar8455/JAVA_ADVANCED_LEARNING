

public class VolatileExample {
    public static volatile int counter=0;

    public static void main(String[] args) throws InterruptedException {

        Thread t1= new Thread(() ->{
            while(counter==0){
                
            }
            System.out.println(Thread.currentThread().getName()+" stopped");
        });
        t1.start();
        Thread.sleep(1000);
        System.out.println("Stopping the task t1");
        System.out.println(Thread.currentThread().getName()+" changing the value of running to false");
        counter++;
    }
}
