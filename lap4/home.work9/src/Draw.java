import java.awt.*;
import javax.swing.JComponent;
public class Draw extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D graphics2D = (Graphics2D) g;

        g.setColor(Color.BLACK);
        g.fillRect(105, 100, 150, 350);

        g.setColor(Color.RED);
        g.fillOval(130, 110, 100, 100);
        g.setColor(Color.YELLOW);
        g.fillOval(130, 220, 100, 100);
        g.setColor(Color.GREEN);
        g.fillOval(130, 330, 100, 100);
    }
}