package Code;

public class Highway extends Route{
    /*
     * Declare variables that are in the
     * Highway class from UML diagram
     */
    private int speed_limit;
    private int num_of_lanes;
    /*
     * Constructor
     * @param
     * @param
     * @param
     * @param
     */
    Highway(String start_point, String end_point, String direction, int speed_limit, int num_of_lanes){
        //this.start_point = start_point;
        //this.end_point = end_point;
        //this.direction = direction;
        super(start_point, end_point, direction); // needed for making constructor in Route class
        this.speed_limit = speed_limit;
        this.num_of_lanes = num_of_lanes;
    }

    /*
     * Get functions for initialization
     */
    public int getSpeed_limit() {
        return speed_limit;
    }
    public int getNum_of_lanes() {
        return num_of_lanes;
    }

    /*
     * Set functions for the variables
     * in Highway class 
     */
    public void setSpeed_limit(int speed_limit) {
        this.speed_limit = speed_limit;
    }
    public void setNum_of_lanes(int num_of_lanes) {
        this.num_of_lanes = num_of_lanes;
    }
}
