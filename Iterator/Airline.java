import java.util.Arrays;

import java.util.Iterator;

public class Airline{
    private String title;
    private Flight[] flights;
    private int size = 2;
    
/**
 * Airline  constructor setting the title and creating the flight 
 * @param title
 */
public Airline(String title){
    flights = new Flight[size];
    this.title = title;
}

/**
 * Method addFlight adding the flight.
 * @param flightnum,from,to,duration,transfers are passed to the addFlight method
 */
public void addFlight(String flightNum,String from,String to, int duration, int transfers){
    Flight flight = new Flight(flightNum,from,to,duration,transfers);
    int i=0;
    if(i<=2){
        flights[i] = flight;
        i = i +1;
    }
    else{flights = growArray(flights);
    }
}

/**
 * Method for getting the title
 */
public String getTitle(){
    return title;
}

/**
 * growArray method grows the size of array.
 * @param flights
 * @return flights2
 */
public Flight[] growArray(Flight[] flights){
    Flight[] flights2;
    flights2=Arrays.copyOf(flights, size*2);
    return flights2;

}

/**
 * Creates the iterator
 * @return the flightIterator
 */
public Iterator<Flight> createIterator(){
    return new FlightIterator(flights);
}
}