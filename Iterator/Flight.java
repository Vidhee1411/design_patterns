public class Flight {
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;

    /**
     * Flight constructor setting the vaules to the variables
     * @param flightnum,from,to,duration,transfers are passed to the method.
     */
    public Flight(String flightNum, String from, String to, int duration, int transfers){
        this.flightNum=flightNum;
        this.duration=duration;
        this.from=from;
        this.to=to;
        this.transfers=transfers;
    }

    /**
     * Gives the place of departure of the flight
     * @return from 
     */
    public String getFrom(){
        return from;
    }

    /**
     * Gives the destination of the flight
     * @return to
     */
    public String getTo(){
        return to;
    }

    /**
     * gives the duration of the flight
     * @return duration
     */
    public int getDuration(){
        return duration;
    }

    /**
     * gives the number of transfer
     * @return tranfers
     */
    public int getNumTransfer(){
        return transfers;
    }

    /**
     * toString formating the output
     */
    public String toString(){
        String result ="";
        result += "FlightNumber: "+flightNum +"\n";
        result += "From:" +getFrom() +"\n";
        result += "To: "+getTo() +"\n";
        result += "Duration: "+getDuration()+"\n";
        if(getNumTransfer()== 0){
            result += "Direct Flight \n";
        }
        else{
            result += "Direct Flight "+getNumTransfer() +"\n";
        }
        return result;
    }

}
