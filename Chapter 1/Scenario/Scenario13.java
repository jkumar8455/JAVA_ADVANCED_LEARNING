import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scenario13{
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(bf.readLine());
        if(num%2==0 && num%3==0){
            System.out.println("Number is divisible by both 2 & 3");
        }
        else{
            System.out.println("Number is not divisible by both 2 & 3");
        }
    }
}