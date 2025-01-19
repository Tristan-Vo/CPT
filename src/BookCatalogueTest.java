/**
 * @author: Tristan Vo
 * date: 01/09/2025
 * Library Catalogue BookCatalogue Test Cases
 */

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BookCatalogueTest {
    @Test
    public void testGetBooks() {

        // Arrange
        BookCatalogue catalogue = new BookCatalogue();
        
        // Act
        List<Book> actual = new ArrayList<>();
        for(Book book : catalogue.getBooks()) {
            actual.add(book);
        }

        // Assert
        List<Book> expected = catalogue.getBooks();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testSearchBook() {
        // Arrange
        BookCatalogue catalogue = new BookCatalogue();

        // Act
        Book actual = catalogue.searchBook("The Great Gatsby");

        // Assert
        Book expected = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Assertions.assertEquals(expected, actual);
    }
}
