/**
 * @author: Tristan Vo
 * date: 01/09/2025
 * Library Catalogue BookCatalogue class
 */

import java.util.List;
import java.util.ArrayList;

public class BookCatalogue {
    private List<Book> books;

    /**
     * Constructor for the BookCatalogue class
     */
    public BookCatalogue() {
        // Initialize the books list
        books = new ArrayList<>();

        // Add some books to the list
        initializeBooks();
    }

    /**
     * Initialize the books list with some books
     */
    public void initializeBooks() {
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien"));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book("Diary of a Wimpy Kid: Dog Days", "Jeff Kinney"));
    }

    /**
     * Get the books list
     * @return books - the books list
     */
    public List<Book> getBooks() {
        return books;
    }

    /**
     * View all availible books in the catalogue
     */
    public void viewBooks() {
        // Loop through the books list and print out the books that are not borrowed
        for (Book book : books) {
            if(book.isBorrowed() == false){
                System.out.println(book);
            }
        }
    }

    /**
     * Search for a book by title
     * @param title - the title of the book to search for
     * @return the book with the given title, or null if no such book is found
     */
    public Book searchBook(String title) {
        // Loop through the books list and return the book with the given title
        for (Book book : books) { 
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    /**
     * Add a new book to the catalogue
     * @param title - the title of the book
     * @param author - the author of the book
     */
    public void addBook(String title, String author) {
        // Add a new book to the books list
        books.add(new Book(title, author));
        System.out.println("Book added: " + title + " by " + author);
    }
}
