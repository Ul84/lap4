import java.util.Scanner;

public class Rectangle
{
    private double Length;
    private double Width;
    private double Area;

    public void setLength(double l)
    {
        Length=l;
    }
    public void setWidth(double w)
    {
        Width=w;
    }
    public double getArea()
    {
        return Length*Width;
    }

    public static void main(String[] args)
    {
        Scanner Input=new Scanner(System.in);
        Rectangle r1=new Rectangle();
        double Len,Wid;
        System.out.println("Enter The Length OF The Rectangle");
        Len= Input.nextDouble();
        System.out.println("Enter The Width OF The Rectangle");
        Wid=Input.nextDouble();
        r1.setLength(Len);
        r1.setWidth(Wid);
        System.out.println("The Area OF Rectangle= "+r1.getArea());
    }

}
