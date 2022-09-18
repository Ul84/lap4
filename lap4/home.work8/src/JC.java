import java.awt.*;
import javax.swing.JComponent;
public class JC extends JComponent
{

        public void paintComponent(Graphics g)
        {
            Graphics2D G= (Graphics2D) g;

            g.setColor(Color.BLUE);
            g.fillRect(50, 50, 150, 100);
            g.setColor(Color.RED);
            g.drawString("MOHAMMED",90,100);
        }
}


