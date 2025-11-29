package scenario29;

public class Main {
    public static void main(String[] args) {
        Genre genre1=new NonFiction();
        Genre genre2=new Fiction();
        System.out.println(genre1.getBorrowingLimit());
        System.out.println(genre2.getBorrowingLimit());
    }
}
