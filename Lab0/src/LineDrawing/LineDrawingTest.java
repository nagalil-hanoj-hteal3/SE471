package LineDrawing;
import java.awt.BorderLayout; //barrier to add for the button
import javax.swing.JFrame; //for the application

public class LineDrawingTest {

    public static void main(String[] args) {
        /* Given */
        JFrame application = new JFrame();
        LiningPanel panel = new LiningPanel();
        /* Added
         * Necessary to be called for
         * displaying the threads that 
         * are displayed on the JFrame
         */
        Animator animation = new Animator(panel);

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* Added
         * Needed to display the barrier
         * or layout of the button within 
         * the application
         */
        application.getContentPane().add(new button_control(animation), BorderLayout.NORTH);
        application.getContentPane().add(panel, BorderLayout.CENTER);
        
        /* Given */
        application.add(panel);
        application.setSize(400, 400);
        application.setTitle("Lining Art");
        application.setVisible(true);

        /* Added
         * Call the main thread
         */
        animation.run();
    }

}