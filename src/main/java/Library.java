import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> stock;
    private int capacity;
    private HashMap<String, Integer> genreCount;

    public Library(int capacity) {
        this.stock = new ArrayList<Book>();
        this.capacity = capacity;
        this.genreCount = new HashMap<String, Integer>();
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (isSpace()) {
            this.stock.add(book);
            if (this.genreCount.containsKey(book.getGenre())) {
                this.genreCount.put(book.getGenre(), this.genreCount.get(book.getGenre()) + 1);
            } else {
                this.genreCount.put(book.getGenre(), 1);
            }
        }
    }

    public boolean isSpace() {
        return this.stockCount() < this.capacity;
    }

    public Book removeBook() {
        return this.stock.remove(0);
    }

    public int bookCountByGenre(Book book) {
        return this.genreCount.get(book.getGenre());
    }
}
