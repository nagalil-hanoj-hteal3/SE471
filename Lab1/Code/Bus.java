package Code;

public class Bus extends Vehicle{
    /*
     * Variables declared in Bus class
     * from UML diagram
     */
    String VIN;
    String PlateNO;
    /*
     * Constructor
     * @param maker
     * @param model
     * @param year
     * @param max_seats
     * @param VIN
     * @param PlateNO
     */
    Bus(String maker, String model, int year, int max_seats, String VIN, String PlateNO){
        /*
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.max_seats = max_seats;
         */
        super(maker, model, year, max_seats); //needed since constructor was made for Vehicle
        this.VIN = VIN;
        this.PlateNO = PlateNO;
    }

    /*
     * get functions for initialization
     */
    public String getVIN() {
        return VIN;
    }
    public String getPlateNO() {
        return PlateNO;
    }
}
