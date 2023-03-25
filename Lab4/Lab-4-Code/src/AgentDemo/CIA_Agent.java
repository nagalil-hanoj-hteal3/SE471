package AgentDemo;

/*
 * @brief CIA_Agent class that implements Agent_IF and Runnable
 * 
 * @note Agent_IF is an interface that implements from CIA_Agent
 * @note Runnable is an interface from runnable that implements from CIA_Agent
 * 
 * @note workingInProgress (boolean) is what the agent is working on currently
 * @note myFootPrint (String) is the special character that is based from the foot print
 * 
 * @note taskID (added) to see which agent is doing which task 
 */
public class CIA_Agent implements Runnable, Agent_IF{
    private boolean workingInProgress;
    private int taskID;
    private String myFootPrint;

    /*
    * @brief Constructor
    * @param footprint is the special character to indicate the agent
    * 
    * @note index is to gain access of getting the first element within the footPrints array
    */
    public CIA_Agent(String footprint) {
        int index = this.toString().indexOf("@") + 1;
        String agentID = this.toString().substring(index);
        this.myFootPrint = String.format("CIA - %s", footprint, footprint, agentID, footprint, footprint);
    }
    /*
     * @brief check to see if cia agent is doing a task
     * 
     * @note use a while loop to traverse the CIA_Agents to see which
     * ones are available to call the processing function to display the 
     * CIA_Agent
     * 
     * @note use try-catch for display and writing the specific footprint and ID
     */
    public void run() {
        while(true){
            try {
                if(workingInProgress){
                    processing();
                    setTaskID(taskID);
                    Thread.sleep(100);
                }
                else{
                    Thread.sleep(500);
                }
            } catch (Exception e) {
                System.out.println(this.getClass().getName());
                e.printStackTrace();
            }
        }
    }

    /*
     * @brief display message for what is processed
     */
    private void processing() {
        System.out.printf("%s is working on task %d\n", myFootPrint, taskID);
    }
    /*
     * @brief assign a process to work on a task
     * 
     * @note set to true as task is in use
     */
    public void startTask(){
        System.out.printf("%s STARTED on task %d\n", myFootPrint, taskID);
        this.workingInProgress = true;
    }
    /*
     * @brief assign a process to stop a task
     * 
     * @note set to false as task has been stopped
     */
    public void stopTask(){
        System.out.printf("%s ENDED on task %d\n", myFootPrint, taskID);
        //this.taskID = -1;
        this.workingInProgress = false;
    }
    /*
     * @brief giving an agent a task
     * @param i will repesent the taskID
     * 
     * @note increment taskID for an agent to work on
     */
    public void setTaskID(int i){
        this.taskID = i;
        this.taskID++;
    }
}
