import java.util.Scanner;

public class Scenario6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any text");
        String text=sc.nextLine();
        if(text==null || text.isEmpty()){
            System.out.println("Invalid Input");
        }
        else{
            System.out.println("Entered text :- "+text);
        }
        sc.close();
    }
}
