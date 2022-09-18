public class h3
{
    public static void main(String[] args)
    {
        String name="Mississippi";
         int Length;
        Length=name.length();
        name=name.replace("i","!");
        Length=name.length();
        System.out.println("The Replace OF (I) "+name+("\nThe Length= "+Length));
        name=name.replace("s","$");
        Length=name.length();
        System.out.println("The Replace OF (S) "+name+"\nThe Length= "+Length);
    }
}
