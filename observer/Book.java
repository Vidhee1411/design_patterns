package observer;

public class Book 
{
    private String title;
    private String authorFirstName;
    private String authorLastName;

    /**
     * It assigns the variable.
     * @param title Title of the book
     * @param authorFirstName it is the author first name.
     * @param authorLastName it is the author last name.
     */
     public Book(String title, String authorFirstName, String authorLastName) {
         this.title = title;
         this.authorFirstName = authorFirstName;
         this. authorLastName = authorLastName;
        }
        
     /**
      * It gets you the title
      * @return title
      */
     public String getTitle() {
            return title;
        }
     
     /**
      *It gets you the author first name 
      * @return authorFirstName
      */
     public  String getAuthorFirstName(){
            return authorFirstName;
        }
     
     /**
      * it gets you the author last name
      * @return authorLastName
      */
     
     public String getAuthorLastName(){
            return authorLastName;
        }
     
     /**
      * It connects two strings
      * @return authorFirstName+" "+authorLastName.
      */
     public String toString()
        {
            return authorFirstName+" "+authorLastName;
        }
}
