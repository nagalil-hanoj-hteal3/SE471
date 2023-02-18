package Code;

public class Trail extends Route {
    /*
     * Declare attributes from the Trail and
     * Route class from UML diagram
     */
    private String name; //name of the trail
    private String terrain; //biome or region of the area

    /*
     * Constructor
     * @param start_point (Route class) 
     * @param end_point (Route class)
     * @param direction (Route class)
     * @param name (Trail class)
     * @param terrain (Trail class)
     */
    Trail(String start_point, String end_point, String direction, String name, String terrain){
        //this.start_point = start_point;
        //this.end_point = end_point;
        //this.direction = direction;
        super(start_point,end_point,direction); //used when having a constructor for Route class
        this.name = name;
        this.terrain = terrain;
    }
    /*
    * Get functions for initialization
    */
    public String getName() {
        return name;
    }
    public String getTerrain() {
        return terrain;
    }
    /*
    * Set functions for the variables
    * in Trail class
    */
    public void setName(String name) {
        this.name = name;
    }
    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }
}
