package Code;

public class TourBus extends Bus{
    /*
     * Variables declared in the TourBus
     * class in UML diagram
     */
    private int num_of_monitors;
    private String tourGuide;

    /*
     * Constructor
     * @param maker
     * @param model
     * @param year
     * @param max_seats
     * @param VIN
     * @param PlateNO
     * @param num_of_monitors
     * @param tourGuide
     */

    TourBus(String maker, String model, int year, int max_seats, String VIN, String PlateNO, int num_of_monitors, String tourGuide){
        /*
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.max_seats = max_seats;
        this.VIN = VIN;
        this.PlateNO = plateNO;
         */
        super(maker, model, year, max_seats, VIN, PlateNO); //needed since constructors have been made for Bus and TourBus
        this.num_of_monitors = num_of_monitors;
        this.tourGuide = tourGuide;
    }

    /*
     * get functions for initialization
     */
    public int getNum_of_monitors() {
        return num_of_monitors;
    }
    public String getTourGuide() {
        return tourGuide;
    }

    /*
     * set function for variables in 
     * TourBus class
     */
    public void setNum_of_monitors(int num_of_monitors) {
        this.num_of_monitors = num_of_monitors;
    }
}
