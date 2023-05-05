import java.util.Scanner;
public class ClosingAResourceUsingTryWithResources
{
    public static void main(String[] args)
    {
        try(Scanner keyboard = new Scanner(System.in))
        {
            System.out.println("START TRY");
            String[] colours = {"RED", "BLUE", "GREEN"};
            System.out.println("Which colour? (1, 2, 3)");
            String pos = keyboard.next();

            int i = Integer.parseInt(pos);
            System.out.println(colours[i - 1]);
            System.out.println("END TRY");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ENTER CATCH");
            System.out.println(e);
        }
        System.out.println("Good Bye");
    }
}
