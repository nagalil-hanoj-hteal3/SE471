package LineDrawing;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;


public class LiningPanel extends javax.swing.JPanel {
    /*
     * Added:
     * Vars included count, colorArray
     * 
     * Updated:
     * lines --> set it as the limit barrier
     * that will exceed on the drawing
     */
    private Color colorArray[];
    private static final double lines = 15.0;
    private int count;

    /*
     * Constructor
     * 
     * Variables used
     * - count --> set it back to the original value
     * - colorArray --> tracking the number of lines
     * 
     * Functions used
     * - colors() --> to receive the random color to generate
     */
    public LiningPanel() {
        
        count = 0; //sdefault value
        colorArray = new Color[(int)lines+1];

        colors();
    }

    /*
     * Increment tracker of lines
     */
    public void counter(){
        count = (int)((++count)%(lines+1.0));
        colors();
    }

    private void colors() {
        Random rd = new Random();
        int c1 = rd.nextInt(255); //color 1
        int c2 = rd.nextInt(255); //color 2
        int c3 = rd.nextInt(255); //color 3
        colorArray[count] = new Color(c1,c2,c3);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int w = getWidth();
        int h = getHeight();
        
        //double lines = 15.0; //increment the spaces
        for(int i = 0; i < count; i++)
        {   
            int w2 = (int)((i/lines)*w); 
            int h2 = (int)((i/lines)*h); 

            g.setColor(colorArray[i]);// setting color
            g.drawLine(0,  h2, w2, h); //bottom left
            g.drawLine(w2,  0, 0, h - h2); //top left
            g.drawLine(w,  h2, w2, 0); //top right
            g.drawLine(w - w2,  h, w, h2); //bottom right
        }
    }
}