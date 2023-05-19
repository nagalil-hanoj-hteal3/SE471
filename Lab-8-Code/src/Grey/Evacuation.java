package Grey;

import Aqua.CEO;
import Aqua.Manager;

public class Evacuation extends Decision {

    public Evacuation(Manager s, int p, Hazard h){
        super(s, p, h);
    }
    
    @Override
    public void execute(CEO commander)
    {
        commander.evacuate();
    }
}
