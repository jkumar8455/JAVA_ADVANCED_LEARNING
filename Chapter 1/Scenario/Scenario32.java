import java.util.Scanner;
public class Scenario32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number two find gcd");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        while (num2!=0) {
            int temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        System.out.println("GCD :- "+num1);
        sc.close();
    }
}
