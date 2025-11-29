package scenario31;

public class BankTransferTransaction extends Transaction{
    @Override
    public boolean validateTransaction() {
        System.out.println("Validating Bank Transfer Transction");
        return false;
    }
}
