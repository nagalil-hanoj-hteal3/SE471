package Grey;

public class Hazard {
    private String type;
    private String desp;
    private int hazard_level;

    /*
     * @brief Constructor
     * @param t : String
     * @param d : String
     * @param h : int
     */
    public Hazard(String t, String d, int h){
        this.type = t;
        this.desp = d;
        this.hazard_level = h;
    }
    /*
     * @brief Obtain the hazard level
     * 
     * @note Used for DirectAdministrator getFeedback 
     */
    public int getHazardLevel() {
        return hazard_level;
    }

    public String getType(){
        return type;
    }

    public String getDesp(){
        return desp;
    }
}
