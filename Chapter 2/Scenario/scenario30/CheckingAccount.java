package scenario30;

public class CheckingAccount extends Account{

    public CheckingAccount(Double balance) {
        super(balance);
        //TODO Auto-generated constructor stub
    }

    @Override
    public Double getInterest() {
        return this.getBalance()*0.01;
    }

}
