import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JPanel;
/**
 * DrawingSurface contains the code to display an image.
 *
 * @author Ursula Jordan Aquadro
 * @version v1.0
 */
public class DrawingArt extends JPanel {
   public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        // draw a light blue sky
        g2d.setColor(new Color(213,230,245));
        g2d.fillRect(0, 0, getWidth(), getHeight());
        
        // draw green grass
        g2d.setColor(new Color(30,128,3));
        g2d.fillRect(0, 300, getWidth(), getHeight()-300);
        
        // draw the red wall
        g2d.setColor(new Color(212,82,30));
        g2d.fillRect(100, 200, 150, 150);
        
        // draw the window
        g2d.setColor(new Color(241,242,223));
        g2d.fillRect(120, 220, 35, 35);
        
        // draw the door
        g2d.setColor(new Color(173,144,111));
        g2d.fillRect(175, 275, 50, 75);
        
        // draw the sun
        g2d.setColor(new Color(252,252,13));
        g2d.fillOval(275, 50, 75, 75);
        
        // draw the doorknob
        g2d.setColor(new Color(201,188,2));
        g2d.fillOval(180, 310, 5, 5);
        
        // draw the roof
        Polygon p = new Polygon();
        p.addPoint(75,200);
        p.addPoint(175,125);
        p.addPoint(275,200);
        g2d.setColor(new Color(173,144,111));
        g2d.fillPolygon(p);
        
        //draw the tree trunk
        g2d.setColor(new Color(117,98,41));
        g2d.fillRect(280, 380, 25, 70);
        
        //draw the tree leaves
        g2d.setColor(new Color(120,158,111));
        g2d.fillOval(275, 310, 50, 50);
   }
}
