package Aqua;

import Green.Employee;
import Green.HReporter_IF;
import Grey.Hazard;

public class Worker extends Employee{ 

    /*
     * @brief Constructor
     * @param n : String
     */
    public Worker(String n){
        super(n);
    }
    
    /*
     * @brief Triggers a report to notify the overseer of dangers occurred
     * @param r : HReporter_IF
     * @param h : Hazard
     * 
     * @note following the format that was given on the lab (yellow sticky note)
     */
    @Override
    public void seeDanger(HReporter_IF r, Hazard h){
        if(r!=null){
            fixIt();
        }else {
            fixIt();
            System.out.println("Notifying direct overseer...\n");
            getDirectOverseer().seeDanger(this, h);
        }
    }

    /*
     * @brief Output statement that 
     */
    @Override
    public void evacuate(){
        System.out.println("The employee " + getName() + " has evacuated.");
    }

    public void fixIt(){
        System.out.println("\nThe employee " + getName() + " is fixing it.");
    }
}