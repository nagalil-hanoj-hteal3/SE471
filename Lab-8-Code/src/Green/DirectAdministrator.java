package Green;

import Grey.Hazard;
import java.util.List;
/*
 * @brief DirectAdministrator java class
 */
public abstract class DirectAdministrator extends Administrator{

    //private int max_hazard;

    public DirectAdministrator(String n, List<Employee> members) {
            super(n, members);
            //max_hazard = 5;
        }
    
    @Override
    public void seeDanger(HReporter_IF r, Hazard h){

        System.out.println("Instructing all team members to fix it...");
        for(HReporter_IF m : getMembers()){
            if(m != r){
                m.seeDanger(this, h);
            }
        }

        if(getDirectOverseer() != null){
            System.out.println("\nNotifying manager...\n");
            getDirectOverseer().seeDanger(this, h);
        }
    }

    /*
     * @brief 
     * @param hazard : Hazard
     */
    public boolean getFeedback(Hazard hazard){
        //boolean f = hazard.getHazardLevel() >= max_hazard;
        System.out.println("Feedback by [" + getName() + "]");
        return hazard.getHazardLevel() > 0;
    }
    
}
