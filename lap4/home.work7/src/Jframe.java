import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
public class Jframe extends JFrame
{
    public Jframe()
    {
        setSize(630,630);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
        setTitle("Drw Rectangle");
        ImageIcon imageIcon=new ImageIcon("img.jpg");

    }

    public void paint(Graphics dro)
    {

        dro.setColor(Color.pink);
        dro.fillRect(300,300,100,100);
       // dro.setColor(Color.BLACK);//dro.drawString("MOHAMMED",200,200);
        dro.setColor(Color.magenta);
        dro.fillRect(400,400,100,100);


    }

    public static void main(String[] args)
    {
        Jframe F=new Jframe();
        F.paint(null);

    }



}