import javax.swing.JFrame;
public class Main
    {

        public static void main(String[] args)
        {
            JFrame frame = new JFrame();
            JC Name = new JC();


            frame.setSize(300, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setResizable(false);
            frame.setTitle("Draw NAME");
            frame.add(Name);


        }
    }

