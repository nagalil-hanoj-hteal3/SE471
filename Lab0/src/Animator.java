package LineDrawing;
//package LineDrawing;

//import java.awt.*;
//import javax.swing.JButton;

/*
 * Create an animator class to control the threads
 */
public class Animator implements Runnable{
    /* initalization for button feature */
    private LiningPanel dpanel;
    private boolean stop;

    /*
     * Provide constructor
     * @param panel --> used as lining panel object
     * set both private variables with its default value
     */
    public Animator(LiningPanel panel){
        dpanel = panel; 
        stop = false; 
    }

    /*
     * Verify if the animation is  
     * either running or not.
     * 
     * returned false = animation is runnning
     * returned true = animation is stopped as desired
     */
    public boolean doStop(){
        return stop;
    }

    /*
     * control features for stopping the animation
     * @param stop2 --> check that the animation is 
     * either in resume or stop feature
     */
    public void set_stop(boolean stop2){
        this.stop = stop2;
    }

    /*
     * this will execute the thread that
     * will display the threads used
     * 
     * dpanel is a LiningPanel object in the 
     * LiningPanel
     */
    @Override
    public void run() {
        // TODO Auto-generated method stub
        //when its running
        while(true){ 
            if(!stop){ //if it is still true (or running)
                dpanel.counter(); //implemented from LiningPanel.java
                dpanel.repaint(); //not implemented
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
    


/*public class button_control extends javax.swing.JPanel implements ActionListener{
    
} */