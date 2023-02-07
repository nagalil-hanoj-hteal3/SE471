package LineDrawing;

import java.awt.event.*; //Action performed and action listener
import javax.swing.JButton; //for the stop, resume, draw
//import javax.swing.JPanel;

public class button_control extends javax.swing.JPanel implements ActionListener {
    /* Added */
    private Animator animate;
    private JButton control_button;

    /*
     * Constructor
     * 
     * @param --> using an animator object
     * used to animate the jpanel
     */
    public button_control(Animator control) {
        animate = control;
        control_button = new JButton("Draw");

        animate.set_stop(true);

        control_button.addActionListener(this);
        this.add(control_button);

    }

    /*
     * Control features using button
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (animate.doStop()) {
            animate.set_stop(false);
            control_button.setText("Stop");
        } else {
            animate.set_stop(true);
            control_button.setText("Resume");
        }
    }
}