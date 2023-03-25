package AgentDemo;
import PoolPattern.ObjectCreation_IF;
/*
 * @brief CIA_Agent_Creator class that connects from the pool pattern folder
 * to obtain object creation interface 
 * 
 * @note footPrints string array to identify each CIA_Agent
 * @note index will be initalized 
 */
public class CIA_Agent_Creator implements ObjectCreation_IF {
    private String[] footPrints = {"@", "#", "$", "*", ".", "?"};
    private int index = 0;
    /*
     * @brief creates and returns a CIA agent with 
     * a specific footprint
     * @return the CIA Agent 
     */
    public Object create() {
        CIA_Agent agent = new CIA_Agent(this.footPrints[(index++)]);
        new Thread(agent).start();
        return agent;
    }
}
