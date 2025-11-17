public class Scenario20 {
    public static void main(String[] args) throws InterruptedException {
        int countDown=5;
        while (countDown>0) {
            System.out.println("countdown :- "+countDown);
            Thread.sleep(1000);            
            countDown--;
        }
    }
}
