package scenario30;

public abstract class Account {
    private Double balance;

    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public Account(Double balance) {
        this.balance = balance;
    }
    public abstract Double getInterest();
    @Override
    public String toString() {
        return "Account [balance=" + balance + "]";
    }
    
}
