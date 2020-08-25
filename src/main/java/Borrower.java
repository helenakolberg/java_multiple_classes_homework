import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> bookShelf;

    public Borrower() {
        this.bookShelf = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.bookShelf.size();
    }
}
