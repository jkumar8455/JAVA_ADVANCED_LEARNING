import java.util.Scanner;

public class Scenario3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num=sc.nextInt();
        if((num&1) == 0){
            System.out.println("Number "+num+" is even");
        }
        else{
            System.out.println("Number "+num+" is odd");
        }
        sc.close();
    }
}
