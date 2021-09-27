import java.util.Iterator;

public class FlightIterator implements Iterator<Flight>{
    private Flight[] flights;
    private int position = 0;

    /**
     * Creating FLightIterator constructor 
     * @param flights the flight
     */
    public FlightIterator(Flight[] flights){
        this.flights = flights;
    }

    /**
     * Creating boolean hasnext which checks if it has more flights
     */
    public boolean hasNext(){
        if(position >= flights.length || flights[position] == null){
            return false;
        } else {
            return true;
        }
    }

    /**
     * Method next returns the next flight if it has any 
     * @return flight
     */
    public Flight next(){
        if(!hasNext())return null;
        Flight flight = flights[position];
        position = position + 1;
        return flight;
    }
}