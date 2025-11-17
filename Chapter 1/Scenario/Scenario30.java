import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scenario30 {
    public static void main(String[] args) throws IOException{
        String storedUsername="jitendra";
        String storedPassword="jitendra123";
        System.out.println("Enter username");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String username=bf.readLine();
        System.out.println("Enter Password");
        String password = bf.readLine();
        if(storedPassword.equals(password) && storedUsername.equals(username)){
            System.out.println("Welcome");
        }
        else{
            System.out.println("Invalid username/password");
        }
    }
}
