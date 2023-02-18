package Code;

public class FlightRoute extends Route{
    /*
     * Variables that will be in the FlightRoute
     * class from UML diagram
     */
    private int flight_num;
    private String flight_ID;
    private int num_of_delays;

    /*
     * Constructor
     * @param start_point
     * @param end_point
     * @param direction
     * @param flight_num
     * @param flight_ID
     * @param num_of_delays
     */
    FlightRoute(String start_point, String end_point, String direction, int flight_num, String flight_ID, int num_of_delays){
        //this.start_point = start_point;
        //this.end_point = end_point;
        //this.direction = direction;
        super(start_point, end_point, direction); //needed since a constructor was made in Route class
        this.flight_num = flight_num;
        this.flight_ID = flight_ID;
        this.num_of_delays = num_of_delays;
    }

    /*
     * get functions for initialization
     */
    public int getFlight_num() {
        return flight_num;
    }
    public String getFlight_ID() {
        return flight_ID;
    }
    public int getNum_of_delays() {
        return num_of_delays;
    }

    /*
     * set functions for variables in 
     * FlightRoute class
     */
    public void setFlight_num(int flight_num) {
        this.flight_num = flight_num;
    }
    public void setFlight_ID(String flight_ID) {
        this.flight_ID = flight_ID;
    }
    public void setNum_of_delays(int num_of_delays) {
        this.num_of_delays = num_of_delays;
    }
}
