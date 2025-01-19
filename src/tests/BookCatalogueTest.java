package tests;
/**
 * @author: Tristan Vo
 * date: 01/09/2025
 * Library Catalogue BookCatalogue Test Cases
 */

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.Book;
import main.BookCatalogue;

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
        List<Book> expected = new ArrayList<>();
        expected.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        expected.add(new Book("The Lord of the Rings", "J.R.R. Tolkien"));
        expected.add(new Book("To Kill a Mockingbird", "Harper Lee"));
        expected.add(new Book("Diary of a Wimpy Kid: Dog Days", "Jeff Kinney"));
        expected.add(new Book("The Catcher in the Rye", "J.D. Salinger"));
        expected.add(new Book("The Hobbit", "J.R.R. Tolkien"));
        expected.add(new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling"));

        Assertions.assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            Assertions.assertEquals(expected.get(i).getTitle(), actual.get(i).getTitle());
            Assertions.assertEquals(expected.get(i).getAuthor(), actual.get(i).getAuthor());
        }
    }


    @Test
    void testSearchBook1() {
        // Arrange
        BookCatalogue catalogue = new BookCatalogue();

        // Act
        Book actual = catalogue.searchBook("The Great Gatsby");

        // Assert
        Book expected = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        Assertions.assertNotNull(expected.getTitle(), actual.getTitle());
        Assertions.assertNotNull(expected.getAuthor(), actual.getAuthor());
    }


    @Test
    void testSearchBook2() {
        // Arrange
        BookCatalogue catalogue = new BookCatalogue();

        // Act
        Book actual = catalogue.searchBook("the great gatsby");

        // Assert
        Book expected = null;
        Assertions.assertEquals(expected, actual);
    }
}


