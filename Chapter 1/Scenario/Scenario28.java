public class Scenario28 {
    public static void main(String[] args) {
        int first=0,second=1;
        System.out.print(first+" "+second+" ");
        for(int i=0;i<=20;i++){
            int third=first+second;
            System.out.print(third+" ");
            first=second;
            second=third;            
        }
    }
}
