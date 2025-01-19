package main;
/**
 * @author: Tristan Vo
 * date: 01/09/2025
 * Library Catalogue User class
 */

/**
 * User class
 */
public class User {

    /**
     * Username
     */
   private String name;

   /**
    * Constructor
    * @param name username
    */
   public User(String name) {
       this.name = name;
   }

   /**
    * Get username
    * @return username
    */
   public String getName() {
       return name;
   }
}