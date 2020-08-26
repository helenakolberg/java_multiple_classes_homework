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
            String genre = book.getGenre();
            if (this.genreCount.containsKey(genre)) {
                this.genreCount.put(genre, this.genreCount.get(genre) + 1);
            } else {
                this.genreCount.put(genre, 1);
            }
        }
    }

    public boolean isSpace() {
        return this.stockCount() < this.capacity;
    }

    public Book removeBook(Book book) {
        String genre = book.getGenre();
        this.genreCount.put(genre, this.genreCount.get(genre) - 1);
        int index = this.stock.indexOf(book);
        return this.stock.remove(index);
    }

    public int bookCountByGenre(Book book) {
        return this.genreCount.get(book.getGenre());
    }
}
