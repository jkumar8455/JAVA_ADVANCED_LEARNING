enum Role{
    USER,ADMIN
}

public class Scenario31 {
    public static void main(String[] args) {
        Role role=Role.USER;
        switch (role) {
            case USER:System.out.println("You have user level acess");
                
                break;
            case ADMIN:System.out.println("You have admin level acess");
                
                break;

            default: System.out.println("Invalid Role");
                break;
        }
    }
}
