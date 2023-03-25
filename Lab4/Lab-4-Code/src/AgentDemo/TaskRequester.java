package AgentDemo;

import PoolPattern.ObjectPool;
/*
 * @brief TaskRequester will be a class that connects from
 * the ObjectPool java file and runnable
 * 
 * @note since server is an ObjectPool object, it has to be
 * called from the import from the pool pattern folder
 */
public class TaskRequester implements Runnable{
    private ObjectPool server;

    /*
     * @brief Constructor
     * @param p to be used for task requesting services
     */
    public TaskRequester(ObjectPool p){
        this.server = p;
    }

    /*
     * @brief given an available agent from the object pool, 
     * it will search through any tasks given a period of time.
     * 
     * @note this function will be using threads from runnable 
     * @note try-catch will get the agent's record for tasks given.
     * To add on, as mentioned on the uml, we followed the format of the first and last two lines
     */
    @Override
    public void run(){
        //Agent_IF agent;
        try {
            Agent_IF agent = (Agent_IF)server.waitForObject();
            //agent.setTaskID();
            agent.startTask();
            Thread.sleep(2000);
            agent.stopTask();
            server.release(agent);
        } catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
