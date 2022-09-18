import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;

public class h10
{
    public static void main(String[] args)
    {
    JFrame Frame=new JFrame();
    ImageIcon imageIcon=new ImageIcon("apple.png");

    Frame.setSize(200*2,200*2);
    Frame.setLocation(400,230);


    JLabel label=new JLabel("Hello,Mohammed!");
    label.setOpaque(true);
    label.setBackground(Color.LIGHT_GRAY);
    Frame.setIconImage(Frame.getIconImage());


    Frame.add(label);
    Frame.setVisible(true);
    Frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
