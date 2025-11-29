package scenario31;

public abstract class Transaction {
    public void processTransaction(){
        if(validateTransaction()){
            System.out.println("Transaction Processed successfully");
        }
        else{
            System.out.println("Transaction failed...");
        }
    }
    public abstract boolean validateTransaction();
}
