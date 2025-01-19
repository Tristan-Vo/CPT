package main;
/**
 * @author: Tristan Vo
 * date: 01/09/2025
 * Library Catalogue Book class
 */


/**
 * Book class that extends Item class
 */
public class Book extends Item {

    /**
     * Constructor for the book class
     * @param title title of the book
     * @param author title of the book
     */
    public Book(String title, String author){
        super(title, author);
    }

    /**
     * Converts the book and its author to a string
     * @return String representation of the book and its author
     */
    @Override
    public String toString(){
        return getTitle() + " by " + getAuthor();
    }
}