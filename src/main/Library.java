package main;
/**
 * @author: Tristan Vo
 * date: 01/09/2025
 * Library Catalogue Library class
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Library class
 */
public class Library {

    private String name;
    private BookCatalogue catalogue;
    private Queue<User> usersQueue;

    /**
     * Constructor
     * @param name name of the library
     */
    public Library(String name) {
        this.name = name;
        this.catalogue = new BookCatalogue();
        this.usersQueue = new LinkedList<>();
    }

    /**
     * Get the name of the library
     * @return name of the library
     */
    public String getName() {
        return name;
    }

    /**
     * View the books in the catalogue
     */
    public void viewCatalogue() {
        System.out.println("Books availible: ");
        catalogue.viewBooks();
    }

    /**
     * Borrow a book
     * @param input Scanner object
     */
    public void borrowBook(Scanner input) {
        // Add user to queue
        System.out.print("Enter your name: ");
        String username = input.nextLine();

        System.out.print("Enter the title of the book you want to borrow: ");
        String title = input.nextLine();

        // Search for book if availible, borrow it, and if not return error message
        Book book = catalogue.searchBook(title);
        if (book != null && book.isBorrowed() == false) {
            book.borrowItem();
            User user = new User(username);
            usersQueue.add(user);
            System.out.println(user.getName() + " borrowed " + title);
        } else {
            System.out.println("Book not availible or already borrowed.");
        }
    }

    /**
     * Return a book
     * @param input Scanner object
     */
    public void returnBook(Scanner input) {
        System.out.print("Enter the title of the book you want to return:");
        String title = input.nextLine();

        // Search for book and return status
        Book book = catalogue.searchBook(title);
        // Return book if found and borrowed, else return error message
        if (book != null && book.isBorrowed() == true) {
            book.returnItem();
            System.out.println(book.getTitle() + " is returned.");
        } else {
            System.out.println("Book not found or not borrowed.");
        }
    }

    /**
     * Process users in queue
     */
    public void processUsers(Scanner input) {
        if (usersQueue.isEmpty()) {
            System.out.println("No users in queue.");
        } else {
            User user = usersQueue.poll();
            System.out.println("Processing user: " + user.getName());
        }
    }

    /**
     * Search for a book
     * @param input Scanner object
     */
    public void searchBook(Scanner input) {
        System.out.print("Enter the title of the book you want to search: ");
        String title = input.nextLine();

        // Search for book and return status
        Book book = catalogue.searchBook(title);
        if (book != null) {
            System.out.println("Book found: " + book.getTitle() + " by " + book.getAuthor());
            System.out.println("Status of book: " + (book.isBorrowed() ? "Borrowed" : "Availible"));
        } else {
            System.out.println("Book not found.");
        }
    }

    /**
     * Add a book to the catalogue
     * @param input Scanner object
     */
    public void addBook(Scanner input) {
        System.out.print("Enter the title of the book you want to add: ");
        String title = input.nextLine();
        System.out.print("Enter the author of the book: ");
        String author = input.nextLine();

        // Add book to catalogue
        catalogue.addBook(title, author);
    }
}

