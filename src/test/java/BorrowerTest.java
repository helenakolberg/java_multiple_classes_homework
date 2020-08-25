import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before() {
        borrower = new Borrower();
        book = new Book("Northern Lights", "Philip Pullman", "fantasy");
        library = new Library(100);
        library.addBook(book);
    }

    @Test
    public void canCheckBookCount() {
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canAddBookToShelfFromLibrary() {
        borrower.addBook(library);
        assertEquals(1, borrower.bookCount());
    }
}
