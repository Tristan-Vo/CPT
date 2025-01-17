/**
 * @author: Tristan Vo
 * date: 01/09/2025
 * Library Catalogue BookCatalogue Test Cases
 */

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class BookCatalogueTest {
    @Test
    public void testGetBooks() {

        // Arrange
        BookCatalogue catalogue = new BookCatalogue();
        List<Book> actual = new ArrayList<>();
        actual.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        actual.add(new Book("The Lord of the Rings", "J.R.R. Tolkien"));
        actual.add(new Book("To Kill a Mockingbird", "Harper Lee"));
        actual.add(new Book("Diary of a Wimpy Kid: Dog Days", "Jeff Kinney"));
        actual.add(new Book("The Catcher in the Rye", "J.D. Salinger"));
        actual.add(new Book("The Hobbit", "J.R.R. Tolkien"));
        actual.add(new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling"));

        // Act
        List<Book> expected = catalogue.getBooks();

        // Assert
        assertEquals(expected, actual);

    }

    @Test
    void testSearchBook() {
        // Arrange
        BookCatalogue catalogue = new BookCatalogue();
        Book actual = catalogue.searchBook("The Great Gatsby");

        // Act

        Book expected = "The Great Gatsby";
        // Assert
        assertEquals(expected, actual);

    }
}
