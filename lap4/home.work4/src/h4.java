import java.awt.*;

public class h4
{
    public static void main(String[] args)
    {
        Rectangle box=new Rectangle(5,10,20,30);

        box.add(0,0);

        System.out.println("X= "+box.x);
        System.out.println("Y= "+box.y);

        System.out.println("Height= "+box.height);
        System.out.println("Width= "+box.width);

    }
}
