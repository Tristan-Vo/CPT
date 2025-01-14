/**
 * @author: Tristan Vo
 * date: 01/09/2025
 * Library Catalogue Library class
 */

import java.util.Queue;

public class Library {
    private String name;
    private BookCatalogue catalogue;

    public Library(String name) {
        this.name = name;
        this.catalogue = new BookCatalogue();
    }
    public String getName() {
        return name;
    }

    // Methods for actions in the library
    public void viewCatalogue() {
        System.out.println("Books availible: ");
        catalogue.viewBooks();
    }

    public void borrowBook() {

    }

    public void returnBook() {

    }

    public void viewUsers() {

    }

    public void searchBook() {

    }
}

