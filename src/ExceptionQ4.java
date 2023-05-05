import java.util.Scanner;
public class ExceptionQ4
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int[] someArray = {12, 9, 3, 11};
        int position = getPosition();
        display(someArray, position);
    }
    static int getPosition()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter array position to display");
        String positionEntered = keyboard.next();
        return Integer.parseInt(positionEntered);
    }
    static void display(int[] arrayIn, int posIn)
    {
        System.out.println("Item at this position is: "+ arrayIn[posIn]);
    }
}
