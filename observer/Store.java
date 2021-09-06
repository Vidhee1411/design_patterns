package observer;

import observer.BestSellers;
import java.util.LinkedList;
import java.util.Queue;
import observer.Book;

/**
 * The class Store implements Observer.It holds a top 5 best seller queue.
 * It updated the book as it is added to bestSeller list and display it.
 * @author Vidhee Patel
 *
 */
public class Store implements Observer {
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers = new LinkedList<>();
     
    public  Store(Subject subject){
    	this.subject = subject;
    	subject.registerObserver(this);
     }
    
    /**
     * It updates the bestseller list.
     * @param book The name of new added book.
     */
    
    public void update(Book book) {
    	queueadd(book);
    	bestSellers.remove();
        System.out.println("removed" +subject);
        bestSellers.add(book);
    }
    
    /**
     * It adds book to the queue
     * @param book Name of the book added
     */
    public void queueadd(Book book){
    	for(int i = 0; i < 5 ; i++)
            bestSellers.add(book);
    }
    
    /**
     * It displays the bestSellers list.
     */
    public void display(){
        System.out.println(bestSellers);
    }
}
