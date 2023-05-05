import java.util.Scanner;
public class DemoUserException2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        try
        {
            System.out.println("Enter your age to start");
            int age = keyboard.nextInt();

        }
        catch(HostelException e)
        {

            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println("Other errors");
            e.printStackTrace();
        }
    }
}
