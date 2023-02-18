package Code;

public class Trip {
    /*
     * Declare attributes from the Trip
     * class in UML diagram
     */
    private String from; //original area (or start area)
    private String destination; //desired area to go

    /*
     * Get functions for initalization
     */
    public String getFrom() {
        return from;
    }
    public String getDestination() {
        return destination;
    }

    /*
     * Set functions for the variables 
     * in Trip class
     */
    public void setFrom(String from) {
        this.from = from;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
}
