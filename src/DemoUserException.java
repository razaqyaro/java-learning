import java.util.Scanner;
public class DemoUserException
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How old are you");
        int age = keyboard.nextInt();

        if(age > 40)
        {
            throw new HostelException("Age should be less than 40");
        }
        else
        {
            age = 40;
            System.out.println("Age changed successfully");
        }
    }
}
