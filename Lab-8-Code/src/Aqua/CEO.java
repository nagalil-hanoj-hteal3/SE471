package Aqua;

import java.util.List;
import java.util.ArrayList;

import Green.Administrator;
import Green.Employee;
//import Green.Employee;
import Green.HReporter_IF;
import Grey.Decision;
import Grey.Hazard;

/*
 * @brief CEO java class
 * 
 * @note Extends to Administrator with relationship on lab
 */
public class CEO extends Administrator{

    /*
     * @brief Constructor
     * @param n : String
     * @param m : List<Employee>
     * 
     * @note Since 
     */
    public CEO(String n, List<Employee> m) {
        super(n, m);
    }

    public void implementDecision(List<Decision> ds){
        ds = sortByPriority(ds);

        for(int i = 0; i < 2; i++){
            System.out.println("\nDecision " + i + ":");
            ds.get(i).execute(this);
        }
    }

    private List<Decision> sortByPriority(List<Decision> ds){
        List<Decision> sortPriority = new ArrayList<>();

        while(!ds.isEmpty()){
            int index = 0;
            int priority = -1;
            for(int i = 0; i < ds.size(); i++){
                if(ds.get(i).getPriority() > priority){
                    priority = ds.get(i).getPriority();
                    index = i;
                }
            }
            sortPriority.add(ds.get(index));
            ds.remove(index);
        }
        return sortPriority;
    }

    @Override
    public void seeDanger(HReporter_IF r, Hazard h){
        List<Decision> ds = new ArrayList<>();

        System.out.println("Collecting decisions from managers...");
        for(HReporter_IF member : getMembers()){
            Manager manager = (Manager) member;
            ds.addAll(manager.suggestDecisions(h));
        }

        System.out.println("\nMaking final decisions...");
        implementDecision(ds);
    }

    public void report(){
        System.out.println("The city's environmental department is notified.\n");
    }
}
