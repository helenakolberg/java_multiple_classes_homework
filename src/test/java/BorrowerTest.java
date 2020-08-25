import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Book book;

    @Before
    public void before() {
        borrower = new Borrower();
        book = new Book("Northern Lights", "Philip Pullman", "fantasy");
    }

    @Test
    public void canCheckBookCount() {
        assertEquals(0, borrower.bookCount());
    }
}
