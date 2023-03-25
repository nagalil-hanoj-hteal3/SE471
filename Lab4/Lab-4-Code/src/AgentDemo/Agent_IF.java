package AgentDemo;

/*
 * @brief: Following the contents of 
 * Agent_IF from UML diagram
 */
public interface Agent_IF{
    public void startTask();
    public void stopTask();
    public void setTaskID(int id);
}