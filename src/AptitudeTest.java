import java.io.IOException;
public class AptitudeTest
{
    public static void main(String[] args) throws IOException
    {
        int score;
        System.out.println("Enter aptitude test score: ");
        score = TestException.getInteger();
        if(score >= 50)
        {
            System.out.println("You have a place on the course");
        }
        else
        {
            System.out.println("Sorry, you failed your test");
        }
    }
}
