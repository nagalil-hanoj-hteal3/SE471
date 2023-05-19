import java.util.List;

import Aqua.Manager;
import Aqua.ProjectLeader;
import Aqua.Supervisor;
import Aqua.Worker;
import Green.Employee;
import Grey.Hazard;
import Aqua.CEO;

public class Main {
    public static void main(String[] args) {
        //first group of five employees (Boss = Jack -- Supervisor)
        Employee Nick = new Worker("Nick");
        Employee John = new Worker("John");
        Employee Mary = new Worker("Mary");
        Employee Jane = new Worker("Jane");
        Employee Tom = new Worker("Tom");

        List<Employee> underJack = List.of(Nick, John, Mary, Jane, Tom);
        
        //second group of four employees (Boss = Jeff -- Supervisor)
        Employee Rob = new Worker("Rob");
        Employee Ed = new Worker("Ed");
        Employee Rick = new Worker("Rick");
        Employee Michael = new Worker("Michael");

        List<Employee> underJeff = List.of(Rob, Ed, Rick, Michael);
        
        //third group of four employees (Boss = Chuck -- ProjectLeader)
        Employee Joe = new Worker("Joe");
        Employee Frank = new Worker("Frank");
        Employee Sam = new Worker("Sam");
        Employee Greg = new Worker("Greg");

        List<Employee> underChuck = List.of(Joe, Frank, Sam, Greg);
        
        //last group of four employees (Boss = Denise -- ProjectLeader)
        Employee Amy = new Worker("Amy");
        Employee Will = new Worker("Will");
        Employee Nancy = new Worker("Nancy");
        Employee Adam = new Worker("Adam");

        List<Employee> underDenise = List.of(Amy, Will, Nancy, Adam);
        
        //------------------------------------------------------------------------
        
        //First supervisor (Boss = Bob -- Manager)
        Employee Jack = new Supervisor("Jack", underJack);

        Nick.setDirectOverseer(Jack);
        John.setDirectOverseer(Jack);
        Mary.setDirectOverseer(Jack);
        Jane.setDirectOverseer(Jack);
        Tom.setDirectOverseer(Jack);
        
        //Second supervisor (Boss = Bob -- Manager)
        Employee Jeff = new Supervisor("Jeff", underJeff);

        Rob.setDirectOverseer(Jeff);
        Ed.setDirectOverseer(Jeff);
        Rick.setDirectOverseer(Jeff);
        Michael.setDirectOverseer(Jeff);
        
        //------------------------------------------------------------------------

        //First project leader (Boss = Rachel -- Manager)
        Employee Chuck = new ProjectLeader("Chuck", underChuck);
        
        Joe.setDirectOverseer(Chuck);
        Frank.setDirectOverseer(Chuck);
        Sam.setDirectOverseer(Chuck);
        Greg.setDirectOverseer(Chuck);
        
        //Second project leader (Boss = Rachel -- Manager)
        Employee Denise = new ProjectLeader("Denise", underDenise);
        
        Amy.setDirectOverseer(Denise);
        Will.setDirectOverseer(Denise);
        Nancy.setDirectOverseer(Denise);
        Adam.setDirectOverseer(Denise);

        //------------------------------------------------------------------------

        //First manager (Boss = Steve -- CEO)
        List<Employee> underBob = List.of(Jack, Jeff);
        
        Employee Bob = new Manager("Bob", underBob);

        Jack.setDirectOverseer(Bob);
        Jeff.setDirectOverseer(Bob);

        //Second manager (Boss = Steve -- CEO)
        List<Employee> underRachel = List.of(Chuck, Denise);
        
        Employee Rachel = new Manager("Rachel", underRachel);

        Chuck.setDirectOverseer(Rachel);
        Denise.setDirectOverseer(Rachel);

        //-------------------------------------------------------------------------

        //Only CEO (Highest of the position)
        List<Employee> underSteve = List.of(Bob, Rachel);

        Employee Steve = new CEO("Steve", underSteve);
        
        Bob.setDirectOverseer(Steve);
        Rachel.setDirectOverseer(Steve);

        //-------------------------------------------------------------------------
        
        //simulation

        //scenario
        System.out.println("A worker John observed a gas leak of a big tank and triggered method to report it to his supervisor");
        //                             --type--        --description--       --hazard level--
        Hazard hazard = new Hazard("Gas leak", "Gas leak from a big tank", 10);
        John.seeDanger(null, hazard);
    }    
}
