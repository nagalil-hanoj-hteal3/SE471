package Green;

import Grey.Hazard;
import java.util.List;

/*
 * @brief Administrator java class
 * 
 * @note Extending to Employee class of the clear arrow relationship
 * @note Import List library due to multiplicity (*)
 * @note Similar to Employee.java, had to make an abstract class since seeDanger has no function body
 */
public abstract class Administrator extends Employee{
    public List<Employee> members;

    /*
     * @brief Constructor
     * @param n : String
     * @param m : List<Employee>
     * 
     * @note call super as Employee is a super class
     * @note set members to ArrayList from List object
     */
    public Administrator(String n, List<Employee> m) {
        super(n);
        this.members = m;
    }

    //function will be called from Worker.java as indicated in the lab
    public abstract void seeDanger(HReporter_IF r, Hazard h);
    
    /*
     * @brief evacuate members from the employee class
     * 
     * @note loop through each employee from the array list and evacuate
     * @note 
     */
    public void evacuate(){
        System.out.println("Evacuating members first...");
        for(Employee e : members){
            e.evacuate();
        }
        System.out.println("Employee " + getName() + " has evacuated");
    } 

    /*
     * @brief Getting members to be for the rest of the types of employees within the Company XYZ
     * @return members
     */
    public List<Employee> getMembers(){
        return members;
    }
}
