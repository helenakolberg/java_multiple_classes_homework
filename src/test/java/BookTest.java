import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void before() {
        book = new Book("The Book Thief", "Makus Zusak", "historical fantasy");
    }

    @Test
    public void hasTitle() {
        assertEquals("The Book Thief", book.getTitle());
    }
}
