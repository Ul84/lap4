import javax.swing.JFrame;
public class Main
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        Draw F = new Draw();

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Traffic Signal Light");
        frame.setResizable(false);

        frame.add(F);
    }
}
