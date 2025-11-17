import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Scenario1{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new InputStreamReader(new FileInputStream("input1.txt")));
        System.out.println("Enter your age");
        int age=scanner.nextInt();
        if(age<=0){
            System.out.println("Invalid Age");
            System.exit(1);
        }
        System.out.println("Your age :- "+age);
        System.out.println("Enter your Username");
        scanner.nextLine();
        String username=scanner.nextLine();
        if(username.isBlank()){
            System.out.println("Username cannot be empty");
            System.exit(1);            
        }
        System.out.println("Your Username :- "+username);
        scanner.close();
    }
}