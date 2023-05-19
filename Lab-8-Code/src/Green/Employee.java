package Green;
import Grey.Hazard;

/*
 * @brief Employee java class 
 * 
 * @note include the employee name
 * @note make each function public to have the visibility recognized from HReporter_IF
 * @note calling abstract would not require functions without function bodies have syntax errors
 * 
 * @note create a constructor to store the name value
 */
public abstract class Employee implements HReporter_IF{
    public String name;
    public Administrator overseer;

    /*
     * @brief Employee constructor
     * @param n : String
     */
    public Employee(String n){
        this.name = n;
    }

    //seeDanger func will be used in Worker.java
    public abstract void seeDanger(HReporter_IF r, Hazard h);
    
    //Evacuate func to be used in Administrator.java
    public abstract void evacuate();

    /*
     * @brief Set func for "-overseer" that is called from Administrator
     * @param r : HReporter_IF
     * 
     * @note Used type casting for Adminstrator to assign overseer with passed param of HReporter_IF
     */
    public void setDirectOverseer(HReporter_IF r){
        this.overseer = (Administrator) r;
    }

    /*
     * @brief Get func for overseer variable
     * @return overseer --> boss/administrator
     */
    public HReporter_IF getDirectOverseer(){
        return this.overseer;
    }

    public String getName(){
        return this.name;
    }

}
