package Code;

public class CharterBus extends Bus{
    /*
     * Variables declared in CharterBus class
     * from the UML diagram
     */
    private String air_condition_type;
    private float rental_pay;
    
    /*
     * Constructor
     * @param maker
     * @param model
     * @param year
     * @param max_seats
     * @param VIN
     * @param PlateNO
     * @param air_condition_type
     * @param rental_pay
     */
    CharterBus(String maker, String model, int year, int max_seats, String VIN, String PlateNO, String air_condition_type, float rental_pay){
        /*
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.max_seats = max_seats;
        this.VIN = VIN;
        this.PlateNO = plateNO;
         */
        super(maker, model, year, max_seats, VIN, PlateNO); //needed since it includes both Bus and Vehicle classes
        this.air_condition_type = air_condition_type;
        this.rental_pay = rental_pay;
    }

    /*
     * get functions for intialization 
     */
    public String getAir_condition_type() {
        return air_condition_type;
    }
    public float getRental_pay() {
        return rental_pay;
    }
     /*
      * set function for variables in 
      * CharterBus class
      */
    public void setAir_condition_type(String air_condition_type) {
        this.air_condition_type = air_condition_type;
    }
}
