package scenario3;

public class Customer {
    private Double balance;

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Customer(Double balance) {
        this.balance = balance;
    }
    
    public void withdrawBalance(Double widhdrawAmount){
        if(widhdrawAmount>balance){
            throw new InsufficientBalanceException("Your current balance "+balance+" is less than the withdrawAmount "+widhdrawAmount);
        }
        else{
            this.balance=this.balance-widhdrawAmount;
        }
    }
}
