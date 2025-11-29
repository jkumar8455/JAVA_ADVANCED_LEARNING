package scenario29;

public class Fiction implements Genre{

    @Override
    public Integer getBorrowingLimit() {
        return 10;
    }

}
