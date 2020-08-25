import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void before() {
        book = new Book("The Book Thief", "Markus Zusak", "historical fantasy");
    }

    @Test
    public void hasTitle() {
        assertEquals("The Book Thief", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Markus Zusak", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("historical fantasy", book.getGenre());
    }
}
