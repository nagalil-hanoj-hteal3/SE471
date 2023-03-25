package AgentDemo;

/*
 * @brief FBI_Agent class that implements Agent_IF and Runnable
 * 
 * @note Agent_IF is an interface that implements from FBI_Agent
 * @note Runnable is an interface from runnable that implements from FBI_Agent
 * 
 * @note workingInProgress (boolean) is what the agent is working on currently
 * @note myFootPrint (String) is the special character that is based from the foot print
 * 
 * @note taskID (added) to see which agent is doing which task 
 */
public class FBI_Agent implements Runnable, Agent_IF{
   private boolean workingInProgress; 
   private String myFootPrint;

   private int taskID;

   /*
    * @brief Constructor
    * @param footprint is the special character to indicate the agent
    * 
    * @note index is to gain access of getting the first element within the footPrints array
    */
    public FBI_Agent(String footprint){
       int index = this.toString().indexOf("@") + 1;
       String agentID = this.toString().substring(index);
       //workingInProgress = true;
       this.myFootPrint = String.format("FBI - %s", footprint, agentID);
    }

    /*
     * @brief assign a process to work on a task
     * 
     * @note set to true as task is in use
     */
    @Override
    public void startTask(){
        System.out.printf("%s has STARTED on task %d\n", myFootPrint, taskID);
        this.workingInProgress = true;
    }

    /*
     * @brief assign a process to stop a task
     *
     * @note set to false as task has been stopped
     */
    @Override
    public void stopTask(){
        System.out.printf("%s has ENDED on task %d\n", myFootPrint, taskID);
        //this.taskID = -1;
        this.workingInProgress = false;
    }

    /*
     * @brief giving an agent a task
     * @param i will repesent the taskID
     * 
     * @note increment taskID for an agent to work on
     */
    @Override
    public void setTaskID(int i){
        this.taskID = i;
        this.taskID++;
        //System.out.println("fffffffffff" + taskID);
    }

    /*
     * @brief check to see if fbi agent is doing a task
     * 
     * @note use a while loop to traverse the FBI_Agents to see which
     * ones are available to call the processing function to display the 
     * FBI_Agent
     * 
     * @note use try-catch for display and writing the specific footprint and ID
     * @note copied format from CIA_Agent java class
     */
    @Override
    public void run(){
        while(true){
            try {
                if(workingInProgress){
                    Thread.sleep(100);
                    setTaskID(taskID);
                    processing();
                }
                else{
                    Thread.sleep(500);
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(this.getClass().getName());
                e.printStackTrace();
            }
        }
    }

    /*
     * @brief display message for what is processed
     */
    private void processing(){
        //setTaskID(taskID);
        System.out.printf("%s is working on task %d\n", myFootPrint, taskID);
    }
}
