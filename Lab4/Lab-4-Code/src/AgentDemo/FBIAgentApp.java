package AgentDemo;

import PoolPattern.ObjectPool; //with uses relationship on uml

/*
 * @brief FBIAgentApp class that keeps track of the FBI_Agent
 * 
 * @note copied same format for CIAAgentApp.java
 */
public class FBIAgentApp{
    public static void main(String[] args){
        ObjectPool server = ObjectPool.getPoolInstance(new FBI_Agent_Creator(), 5);
        for(int i = 0; i < 10; i++){
            Thread client = new Thread(new TaskRequester(server));
            client.start();
        }
    }
}
