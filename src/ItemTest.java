import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ItemTest {
    @Test
    void testGetAuthor() {

        // Arrange
        Item item = new Item("The Great Gatsby", "F. Scott Fitzgerald");
        String actual = item.getAuthor();
        
        // Act
        String expected = "F. Scott Fitzgerald";

        // Assert
        assertEquals(actual, expected);
    }



    @Test
    void testGetTitle() {

    }

    @Test
    void testIsBorrowed() {

    }

    @Test
    void testToString() {

    }
}
