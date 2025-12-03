package scenario5;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books=new ArrayList<>();
    }

    public void addBook(String bookName,Integer quantity){
        boolean ifBookExist=false;
        Book currentBook=null;
        for(Book book:books){
            if(book.getBookName().equals(bookName)){
                currentBook=book;
                ifBookExist=true;
            }
        }
        if(ifBookExist){
            currentBook.setQuantity(currentBook.getQuantity()+quantity);
        }
        else{
            books.add(new Book(bookName, quantity));
        }
    }

    public void borrowBook(String bookName,Integer quantity){
        boolean ifBookExist=false;
        Book currentBook=null;
        for(Book book:books){
            if(book.getBookName().equals(bookName) && book.getQuantity().compareTo(quantity)>=0){
                currentBook=book;
                ifBookExist=true;
            }
        }
        if(ifBookExist){
            System.out.println("Book borrowed Successfully");
            currentBook.setQuantity(currentBook.getQuantity()-quantity);
        }
        else{
            throw new BookNotAvailableException("Quantity "+quantity+" is not avaliable of book"+bookName);
        }
    }
    
}
