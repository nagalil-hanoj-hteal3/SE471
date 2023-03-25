package AgentDemo;
import PoolPattern.ObjectCreation_IF;
/*
 * @brief FBI_Agent_Creator class that connects from the pool pattern folder
 * to obtain object creation interface 
 * 
 * @note footPrints string array to identify each FBI_Agent
 * @note index will be initalized 
 */
public class FBI_Agent_Creator implements ObjectCreation_IF{
    private String[] footPrints = {"@","#","$","*",".","?"};
    private int index = 0;

    /*
     * @brief creates and returns a FBI agent with 
     * a specific footprint
     * @return the FBI Agent 
     * 
     * @note copied the same format with the CIA_Agent_Creator java file
     */
    @Override
    public Object create(){
        FBI_Agent agent = new FBI_Agent(footPrints[(index++)]);
        new Thread(agent).start();
        return agent;
    }
}
