package Aqua;

import Green.Administrator;
import Green.DirectAdministrator;
import Green.Employee;
import Green.HReporter_IF;
import Grey.Decision;
import Grey.Evacuation;
import Grey.FileReport;
import Grey.Hazard;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Administrator{
    //apparently making it a static boolean fixed the evacuation process, not sure why -_-
    private static boolean report = false;

    public Manager(String n, List<Employee> members) {
        super(n, members);
    }

    @Override
    public void seeDanger(HReporter_IF r, Hazard h){
        boolean reportCEO = true;

        System.out.println("Asking for feedback from all supervisors...");
        for(HReporter_IF m : getMembers()){
            DirectAdministrator DA = (DirectAdministrator)m;
            if(!DA.getFeedback(h)){
                reportCEO = false;
            }
        }
    
        if(reportCEO && getDirectOverseer() != null){
            System.out.println("\n\nNotifying CEO...\n");
            getDirectOverseer().seeDanger(this, h);
        }

    }
    
    public List<Decision> suggestDecisions(Hazard h){
        List<Decision> suggestion = new ArrayList<>();
        int hazard_level = h.getHazardLevel();
        //boolean report = false; <-- epic fail

        if(!report){
            suggestion.add(new FileReport(this, 5, h));
            report = true;
        }
        else{
            if(hazard_level >= 10){
                suggestion.add(new Evacuation(this, 10, h));
            }else if(hazard_level >= 1){
                suggestion.add(new FileReport(this, 5, h));
            }
        }
        return suggestion;
    }
}
