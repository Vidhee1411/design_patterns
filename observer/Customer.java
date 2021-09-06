package observer;

import java.util.ArrayList;

/**
 * It implements the Observer. It update and display the wishList of the customer.
 * @author Vidhee Patel
 *
 */
public class Customer implements Observer{
    Subject subject;
    private String firstName;
    private String lastName;
    private ArrayList<Book> wishList = new ArrayList<Book>();
    
    /**
     * It assigns the named parameter to the variables.
     * @param subject The subject
     * @param firstName FirstName of the customer
     * @param lastName LastName of the customer
     */
    public Customer(Subject subject, String firstName, String lastName){
    this.firstName=firstName;
    this.lastName =lastName;
    subject.registerObserver(this);
    }
    
    /**
     * Updates the new added book
     * @param book The name of update book.
     */
    public void update(Book book){
        wishList.add(book);
        }
    
    /**
     * Displays the wishList
     */
    public void display(){
        System.out.println(wishList);
    }
}
