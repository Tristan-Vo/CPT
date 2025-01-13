import java.util.List;
import java.util.ArrayList;

public class BookCatalogue {
    private List<Book> books;

    public BookCatalogue() {
        books = new ArrayList<>();

        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien"));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book("Diary of a Wimpy Kid: Dog Days", "Jeff Kinney"));
    }
}
