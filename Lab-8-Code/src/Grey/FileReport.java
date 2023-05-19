package Grey;

import Aqua.Manager;
import Aqua.CEO;

public class FileReport extends Decision {
        
    public FileReport(Manager s, int p, Hazard h){
        super(s, p, h);
    }

    @Override
    public void execute(CEO commander)
    {
        commander.report();
    }
}
