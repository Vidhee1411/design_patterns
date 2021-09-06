package observer;

import observer.Book;
import java.util.ArrayList;

/**
 * BestSellers class register,remove and notify the observer.
 * It also add the book to ArrayList.
 * @author Vidhee Patel
 *
 */

public class BestSellers implements Subject{
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;
    
    public BestSellers() {
        observers = new ArrayList<Observer>();
        bestSellers = new ArrayList<Book>();
    }
    
    /**
     * It register the observer in the list.
     */
    @Override
    public void registerObserver(Observer observer){
            observers.add(observer);
    }
    
    /**
     * It removes the observer from the list.
     */
    @Override
    public  void removeObserver(Observer observer){
            observers.remove(observer);
    }
    
   /**
   * It add the book to bestSeller list and notify the observer.
   * @param book The name of the book
   */
    public  void addBook(Book book){
        bestSellers.add(book);
        notifyObservers(book);
    }
    
    /**
     * It notifies the Observer about the book.
     * @param book The name of the book added.
     */
    @Override
    public void notifyObservers(Book book) {
        for(Observer observer : observers){
            observer.update(book);
            }
        }
}