package Code;

public class Schedule {
    /*
     * Declare the attributes of UML diagram
     * for Schedule class
     */
    private String start_time; //set a time with format hours:minutes:seconds 
    private String end_time; //same as prior variable

    /*
     * Constructor
     * @param start_time
     * @param end_time
     */
    Schedule(String start_time, String end_time){
        this.start_time = start_time;
        this.end_time = end_time;
    }

    /*
     * Have get functions that is
     * from the methods location
     */
    public String getStart_time() {
        return start_time;
    }
    public String getEnd_time() {
        return end_time;
    }

    /*
     * Have set functions to assign the
     * string types 
     */
    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }
}
