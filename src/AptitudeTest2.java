import java.io.IOException;
public class AptitudeTest2
{
    public static void main(String[] args)
    {
       try
       {
           int score;
           System.out.println("Enter aptitude test score");
           score = TestException.getInteger();
           if(score >= 50)
           {
               System.out.println("You have a place on the course");
           }
           else
           {
               System.out.println("Sorry, you have failed");
           }
       }
       catch(NumberFormatException e)
       {
           System.out.println("You entered an invalid number");
       }
       catch(IOException e)
       {
           System.out.println(e);
       }
    }
}
