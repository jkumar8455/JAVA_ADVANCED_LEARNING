enum TransactionType{
    DEPOSIT,
    WITHDRAWL,
    TRANSFER
}
public class Scenario21 {
    public static void main(String[] args) {
        TransactionType transactionType=TransactionType.TRANSFER;
        switch (transactionType) {
            case DEPOSIT:System.out.println("Processing Deposit");
                
                break;
            case TRANSFER:System.out.println("Processing TRANSFER");
                
                break;
            case WITHDRAWL:System.out.println("Processing WITHDRAWL");
                
                break;
        
            default: System.out.println("Invalid Transaction Type");
                break;
        }
    }
}
