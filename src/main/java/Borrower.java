import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> bookShelf;

    public Borrower() {
        this.bookShelf = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.bookShelf.size();
    }

    public void addBook(Library library, Book book) {
        library.removeBook(book);
        this.bookShelf.add(book);
    }

    public void returnBook(Library library, Book book) {
        this.bookShelf.remove(book);
        library.addBook(book);
    }
}
