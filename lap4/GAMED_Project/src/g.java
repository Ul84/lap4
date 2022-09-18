import java.util.Random;
import java.util.Scanner;

public class g
{
    public static void main(String[] args)
    {
        Random random=new Random();
        Scanner input=new Scanner(System.in);

        int Limit;
        int Guess;
        int rand;

        System.out.println("Enter The Limit of Guessing");
        Limit=input.nextInt();
        rand=random.nextInt(Limit);
        for (int i=0;i<=5;i++)
        {
            System.out.println("Enter The Number You Think Is Correct< 5Try Only >");
            Guess=input.nextInt();

            if (rand==Guess)
            {
                System.out.println("YOY ARE CORRECT!");
             break;
            }
            else if (rand!=Guess)
            {
                System.out.println("SORRY TRY AGAIN");
            }

        }
    }
}

