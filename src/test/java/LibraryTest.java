import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library(100);
        book = new Book("The Book Thief", "Markus Zusak", "historical fantasy");
    }

    @Test
    public void canCountStock() {
        assertEquals(0, library.stockCount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void cannotAddBook() {
        library = new Library(2);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.stockCount());
    }
}
