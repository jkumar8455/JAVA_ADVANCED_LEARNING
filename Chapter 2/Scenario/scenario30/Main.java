package scenario30;

public class Main {
    public static void main(String[] args) {
        Account account1=new CheckingAccount(100.0);
        Account account2=new SavingAccount(100.0);
        System.out.println(account1.getInterest());
        System.out.println(account2.getInterest());
    }
}
