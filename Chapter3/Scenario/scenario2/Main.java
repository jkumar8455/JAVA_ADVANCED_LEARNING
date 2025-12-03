package scenario2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        
        try{
            System.out.println("Enter numerator");
            Integer numerator=Integer.parseInt(bf.readLine());
            System.out.println("Enter denominator");
            Integer denominator=Integer.parseInt(bf.readLine());
            System.out.println(numerator/denominator);
        }
        catch(NumberFormatException ex){
            System.out.println("Invalid number format :- "+ex.getMessage());
        }
        catch(ArithmeticException ex){
            System.out.println("An Arithmetic Error Occurred :- "+ex.getMessage());
        }
        bf.close();
    }
}
