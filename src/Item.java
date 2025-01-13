/**
 * @author: Tristan Vo
 * date: 01/09/2025
 * Library Catalogue Item class
 */


 /**
  * Item class
  */
public class Item {

    /**
     * title - title of the item
     */
    private String title;

    /**
     * author - author of the item
     */
    private String author;

    /**
     * borrowed - boolean to check if the item is borrowed
     */
    private boolean borrowed;

    /**
     * Constructor
     * @param title - title of the item
     * @param author - author of the item
     * @param borrowed - boolean to check if the item is borrowed
     */
    public Item(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    /**
     * Returns the title of the item
     * @return title - title of the item
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the author of the item
     * @return author - author of the item
     */
    public String getAuthor(){
        return author;
    }

    /**
     * Returns if the item is borrowed
     * @return borrowed - boolean to check if the item is borrowed
     */
    public boolean isBorrowed() {
        return borrowed;
    }

    /**
     * Borrows the item by setting borrowed to true
     * @return void
     */
    public void borrowItem() {
        this.borrowed = true;
    }

    /**
     * Returns the item by setting borrowed to false
     * @return void
     */
    public void returnItem() {
        this.borrowed = false;
    }

    /**
     * Returns the title of the item
     * @return title - title of the item
     */
    @Override
    public String toString() {
        return title;
    }
}
