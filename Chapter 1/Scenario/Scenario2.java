import java.util.Scanner;

public class Scenario2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age<0){
            System.out.println("Invalid Age");
            System.exit(1);
        }
        else if(age<18){
            System.out.println("Minor");
        }
        else if(age<=60){
            System.out.println("Adult");
        }
        else{
            System.out.println("Senior citizen");
        }
        sc.close();
    }
}