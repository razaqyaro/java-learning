import java.util.Scanner;
public class ClosingAResourceUsingFinally
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        try
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
        finally
        {
            System.out.println("ENTER FINALLY");
            keyboard.close();
            System.out.println("Scanner CLOSED");
        }
        System.out.println("GOod bye");
    }
}
