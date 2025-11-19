package scenario8;

public class RegularUser extends User{

    public RegularUser(String userName) {
        super(userName);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void streamContent() {
        System.out.println(this.getUserName()+" has access to non-premium content");
    }

}
