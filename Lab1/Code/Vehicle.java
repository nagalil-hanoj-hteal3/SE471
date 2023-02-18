package Code;

public class Vehicle {
    /*
     * Variables to be declared in the
     * Vehicle class
     */
    private String maker;
    private String model;
    private int year;
    private int max_seats;

    /*
     * Constructor
     * @param maker
     * @param model
     * @param year
     * @param max_seats
     */
    Vehicle(String maker, String model, int year, int max_seats){
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.max_seats = max_seats;
    }

    /*
     * get functions for initialization
     */
    public String getMaker() {
        return maker;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public int getMax_seats() {
        return max_seats;
    }
}
