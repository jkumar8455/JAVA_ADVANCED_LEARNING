package scenario31;

public class Main {
    public static void main(String[] args) {
        Transaction transaction1=new BankTransferTransaction();
        Transaction transaction2=new CreditCardTransaction();
        transaction1.processTransaction();
        transaction2.processTransaction();
    }
}
