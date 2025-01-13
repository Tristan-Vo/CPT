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
     * User name
     */
   private String name;

   /**
    * Constructor
    * @param name - user name
    */
   public User(String name) {
       this.name = name;
   }

   /**
    * Get user name
    * @return user name
    */
   public String getName() {
       return name;
   }
}