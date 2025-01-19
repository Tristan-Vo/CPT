package tests;
/**
 * @author: Tristan Vo
 * date: 01/09/2025
 * Library Catalogue Item class test cases 
 */

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import main.Item;


/**
 * ItemTest class to test the Item class
 */
public class ItemTest {

    /**
     * Test the getAuthor method
     */
    @Test
    void testGetAuthor() {
        // Arrange
        Item item = new Item("The Great Gatsby", "F. Scott Fitzgerald");
        
        // Act
        String actual = item.getAuthor();

        // Assert
        String expected = "F. Scott Fitzgerald";
        assertEquals(actual, expected);
    }

    /**
     * Test the getTitle method
     */
    @Test
    void testGetTitle() {
        // Arrange
        Item item = new Item("The Great Gatsby", "F. Scott Fitzgerald");
        
        // Act
        String actual = item.getTitle();

        // Assert
        String expected = "The Great Gatsby";
        assertEquals(actual, expected);
    }

    /**
     * Test the isBorrowed method
     */
    @Test
    void testIsBorrowed() {
        // Arrange
        Item item = new Item("The Great Gatsby", "F. Scott Fitzgerald");

        // Act
        boolean actual = item.isBorrowed();

        // Assert
        boolean expected = false;
        assertEquals(actual, expected);
    }

    /**
     * Test the borrowItem method
     */
    @Test
    void testToString() {
        // Arrange
        Item item = new Item("The Great Gatsby", "F. Scott Fitzgerald");

        // Act
        String actual = item.toString();

        // Assert
        String expected = "The Great Gatsby by F. Scott Fitzgerald";
        assertEquals(actual, expected);
    }
}
