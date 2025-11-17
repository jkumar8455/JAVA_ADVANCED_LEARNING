import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scenario16 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your password");
        String password = bf.readLine();
        if(password.length()<8){
            System.out.println("Password must contain at least 8 character");
            System.exit(1);
        }
        System.out.println("Your Password is :- "+password);
    }
}
