public class Scenario34 {
    public static void main(String[] args) {
        int num=34;
        for(int i=2;i<=(int)Math.sqrt(num);i++){
            if(num%i==0){
                System.out.println("Not a Prime Number");
                System.exit(1);
            }
        }
        System.out.println("Prime Number");
    }
}
