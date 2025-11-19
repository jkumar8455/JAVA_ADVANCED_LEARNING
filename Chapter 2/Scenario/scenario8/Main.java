package scenario8;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user1=new PremiumUser("User1");
        User user2=new RegularUser("User2");
        List<User> users=new ArrayList<>(Arrays.asList(user1,user2));
        for(User user:users){
            user.streamContent();
        }
    }
}
