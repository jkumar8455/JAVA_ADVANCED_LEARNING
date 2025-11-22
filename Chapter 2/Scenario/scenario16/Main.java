package scenario16;

public class Main {
    public static void main(String[] args) {
        Transaction transaction=new Transaction("Transaction1234", 1234.00);
        System.out.println(transaction.getTransactionId());
        System.out.println(transaction.getAmount());
    }
}
