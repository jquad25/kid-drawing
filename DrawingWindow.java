import javax.swing.JFrame;
import javax.swing.SwingUtilities;
/**
 * DrawingWindow creates the frame that will contain DrawingArt picture.
 *
 * @author Ursula Jordan Aquadro
 * @version v1.0
 */

public class DrawingWindow extends JFrame {
    public DrawingWindow() {
        setTitle("Drawing Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(new DrawingArt());
        
        setSize(400, 300);
        setLocationRelativeTo(null); // centers window in display screen
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                DrawingArt da = new DrawingArt();
                da.setVisible(true);
            }
        });
    }
}