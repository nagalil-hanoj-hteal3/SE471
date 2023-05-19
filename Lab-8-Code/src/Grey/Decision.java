package Grey;

import Aqua.Manager;
import Aqua.CEO;

public abstract class Decision {

    public Manager suggestedBy;
    public int priority;
    public Hazard hazard;

    public Decision(Manager s, int p, Hazard h){
        this.suggestedBy = s;
        this.priority = p;
        this.hazard = h;
    }

    public abstract void execute(CEO commander);

    public Manager getSuggestedBy(){
        return suggestedBy;
    }

    public Hazard getHazard(){
        return hazard;
    }

    public int getPriority() {
        return priority;
    }
}
