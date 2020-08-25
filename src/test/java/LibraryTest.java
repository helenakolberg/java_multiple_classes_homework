import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;
    private Book book2;
    private Book book3;

    @Before
    public void before() {
        library = new Library(100);
        book = new Book("The Book Thief", "Markus Zusak", "historical fantasy");
        book2 = new Book("Jonathan Strange and Mr Norrell", "Susanna Clarke", "historical fantasy");
        book3 = new Book("Misery", "Stephen King", "thriller");
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
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.stockCount());
    }

    @Test
    public void canRemoveBook() {
        library.addBook(book);
        library.addBook(book2);
        library.removeBook(book);
        assertEquals(1, library.stockCount());
        assertEquals(1, library.bookCountByGenre(book));
    }

    @Test
    public void canCheckBookCountByGenre() {
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.bookCountByGenre(book));
        assertEquals(1, library.bookCountByGenre(book3));
    }
}
