package Code;

public class ExpressBus extends Bus{
    /*
     * Variables declared in the ExpressBus
     * class from UML diagram
     */
    private String transit_type;
    private float ticket_price;

    /*
     * Constructor
     * @param maker
     * @param model
     * @param year
     * @param max_seats
     * @param VIN
     * @param PlateNO
     * @param transit_type
     * @param ticket_price
     */
    ExpressBus(String maker, String model, int year, int max_seats, String VIN, String PlateNO, String transit_type, float ticket_price){
        /*
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.max_seats = max_seats;
        this.VIN = VIN;
        this.PlateNO = plateNO;
         */
        super(maker, model, year, max_seats, VIN, PlateNO); //needed since both Bus and ExpressBus constructors were created
        this.transit_type = transit_type;
        this.ticket_price = ticket_price;
    }

    /*
     * get functions for initialization
     */
    public String getTransit_type() {
        return transit_type;
    }
    public float getTicket_price() {
        return ticket_price;
    }

    /*
     * set function for variables in 
     * ExpressBus class
     */
    public void setTransit_type(String transit_type) {
        this.transit_type = transit_type;
    }
}
