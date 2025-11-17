import java.util.Scanner;

public class Scenario4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick any choice between 1 to 4");
        int choice=sc.nextInt();
        sc.close();
        switch (choice) {
            case 1: System.out.println("choice 1 selected");
                
                break;
            case 2: System.out.println("choice 2 selected");
                
                break;
            case 3: System.out.println("choice 3 selected");
                
                break;
            case 4: System.out.println("choice 4 selected");                
                break;
        
            default:
            System.out.println("Invalid choice");
                break;
        }
    }
}
