public class Scenario24 {
    public static void main(String[] args) {
        String email="jkumar8455@gmail.com";
        if(email.contains("@") && email.endsWith(".com")){
            System.out.println("Valid email");
        }
        else{
            System.out.println("Invalid email");
        }
    }
}
