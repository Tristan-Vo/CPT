/**
 * @author: Tristan Vo
 * date: 01/09/2025
 * Library Catalogue
 */

 import java.util.Scanner;
 import java.util.Queue;

public class LibraryCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library("Hazel McCallion Central Library");
        boolean run = true;

        while (run){
            System.out.println("Welcome to " + library.getName());
            System.out.println("1. View Catalogue");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. View Users");
            System.out.println("5. Search for a book");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    library.viewCatalogue();
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    run = false;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }

    }
}

class Item {

}

class Book extends Item {

}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Library {
    private String name;

    public Library(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // Methods for actions in the library
    public void viewCatalogue() {

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


