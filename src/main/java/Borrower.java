import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> bookShelf;

    public Borrower() {
        this.bookShelf = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.bookShelf.size();
    }

    public void addBook(Library library) {
        Book book = library.removeBook();
        this.bookShelf.add(book);
    }
}
