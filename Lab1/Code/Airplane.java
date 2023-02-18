package Code;

public class Airplane extends Vehicle {
    /*
     * Variables declared in Airplane class
     * from UML diagram
     */
    private String type;

    /*
     * Constructor
     * @param maker
     * @param model
     * @param year
     * @param max_seats
     * @param type
     */
    Airplane(String maker, String model, int year, int max_seats, String type){
        //this.maker = maker;
        //this.model = model;
        //this.year = year;
        //this.max_seats = max_seats;
        super(maker, model, year, max_seats); //needed since a constructor was made in the vehicle class
        this.type = type;
    }

    /*
     * get function for intialization
     */
    public String getType() {
        return type;
    }
     /*
      * set function for variables in
      * Vehicle class
      */
    public void setType(String type) {
        this.type = type;
    }
}
