package scenario31;

public class CreditCardTransaction extends Transaction{

    @Override
    public boolean validateTransaction() {
        System.out.println("Validating Credit Card Transction");
        return true;
    }

}
