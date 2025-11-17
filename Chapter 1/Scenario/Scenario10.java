public class Scenario10 {
    public static void main(String[] args) {
        int x=10;
        if(x>5){
            int y=5;
            System.out.println("y is "+y);
        }
        // System.out.println("y = "+y); // error y is out of scope
    }
}
