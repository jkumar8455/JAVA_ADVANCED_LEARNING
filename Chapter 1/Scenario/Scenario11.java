import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Scenario11 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        String line=bf.readLine();
        int number=Integer.parseInt(line);
        if(number>0){
            System.out.println("number is positive");
        }
        else if(number<0){
            System.out.println("number is negative");
        }
        else{
            System.out.println("number is zero");
        }
    }
}
