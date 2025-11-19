package scenario8;

public class PremiumUser extends User{

    public PremiumUser(String userName) {
        super(userName);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void streamContent() {
        System.out.println(this.getUserName()+" has access to premium content");
    }

}
