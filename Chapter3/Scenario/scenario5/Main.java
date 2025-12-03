package scenario5;

public class Main {
    public static void main(String[] args) {
        Library library=new Library();
        library.addBook("Java", 10);
        library.addBook("C++", 20);
        library.borrowBook("Java", 8);
        library.borrowBook("C++", 10);
        library.borrowBook("Java", 3);
    }
}
