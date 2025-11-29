package scenario30;

public class SavingAccount extends Account{

    public SavingAccount(Double balance) {
        super(balance);
        //TODO Auto-generated constructor stub
    }

    @Override
    public Double getInterest() {
        return this.getBalance()*0.04;
    }

}
