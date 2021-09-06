package observer;

import observer.Observer;

/**
 * It is a interface having register, remove and notify observer abstract method.
 * @author Vidhee Patel
 *
 */
public interface Subject {
    public void  registerObserver(Observer observer);
    public void  removeObserver(Observer observer);
    public void  notifyObservers(Book book);
    }
