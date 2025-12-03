package scenario5;

public class Book {
    private String bookName;
    private Integer quantity;
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Book(String bookName, Integer quantity) {
        this.bookName = bookName;
        this.quantity = quantity;
    }
}
