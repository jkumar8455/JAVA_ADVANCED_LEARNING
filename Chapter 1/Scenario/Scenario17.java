import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scenario17 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number to find its factorial");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(bf.readLine());
        int ans=1;
        for(int i=1;i<=num;i++){
            ans*=i;
        }
        System.out.println("factorial is "+ans);
    }
}
