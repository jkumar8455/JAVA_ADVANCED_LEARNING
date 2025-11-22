package scenario16;

public class Transaction {
    private String transactionId;
    private Double amount;
    public Transaction(String transactionId, Double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }
    public String getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    
}
