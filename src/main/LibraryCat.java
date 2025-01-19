package main;
/**
 * @author: Tristan Vo
 * date: 01/09/2025
 * Library Catalogue
 */

 import java.util.Scanner;

/**
 * LibraryCat class
 */
public class LibraryCat {
    /**
     * Main method
     * @param args arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Library library = new Library("Hazel McCallion Central Library");
        boolean run = true;

        while (run){
            System.out.println("Welcome to " + library.getName());
            System.out.println("1. View Catalogue");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Process users");
            System.out.println("5. Search for a book");
            System.out.println("6. Add a book");
            System.out.println("7. Exit");
            System.out.print("Select an option: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    library.viewCatalogue();
                    break;
                case 2:
                    library.borrowBook(input);
                    break;
                case 3:
                    library.returnBook(input);
                    break;
                case 4:
                    library.processUsers(input);
                    break;
                case 5:
                    library.searchBook(input);
                    break;
                case 6:
                    library.addBook(input);
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    run = false;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }

        input.close();

    }
}