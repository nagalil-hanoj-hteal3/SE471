package Code;

public class Route {
    /*
     * Declare attributes of Route in the 
     * UML diagram
     */
    private String start_point; //start from initial point
    private String end_point; //stop from initial point to new point
    private String direction; //check if it is NORTH/EAST/WEST/SOUTH
    
    /*
     * Constructor
     * @param start_point
     * @param end_point
     * @param direction
     */
    Route(String start_point, String end_point, String direction){
        this.start_point = start_point;
        this.end_point = start_point;
        this.direction = direction;
    }
    

    /*
     * Create get functions to indicate
     * the following variables in Route class
     */
    public String getStart_point() {
        return start_point;
    }
    public String getEnd_point() {
        return end_point;
    }
    public String getDirection() {
        return direction;
    }
}
