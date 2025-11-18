class Resource1{

}
class Resource2{

}

public class DeadlockExample {
    public static void main(String[] args) throws InterruptedException {
        Resource1 resource1=new Resource1();
        Resource2 resource2=new Resource2();
        Thread t1 = new Thread(()->{
            synchronized(resource1){
                System.out.println("thread "+Thread.currentThread().getName()+" locks the resource "+resource1.getClass());
                synchronized(resource2){
                    System.out.println("thread "+Thread.currentThread().getName()+" locks the resource "+resource2.getClass());
                }
            }
        });

        Thread t2 = new Thread(()->{
            synchronized(resource2){
                System.out.println("thread "+Thread.currentThread().getName()+" locks the resource "+resource2.getClass());
                synchronized(resource1){
                    System.out.println("thread "+Thread.currentThread().getName()+" locks the resource "+resource1.getClass());
                }
            }
        });
        
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Thread Execution Finished");
    }
}
