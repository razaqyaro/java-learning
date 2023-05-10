import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorDemo
{
    public static void main(String[] args)
    {
        Set<String> registrationNumbers = new HashSet<>();
        registrationNumbers.add("V53PLS");
        registrationNumbers.add("X85ADZ");
        registrationNumbers.add("L22SBG");
        registrationNumbers.add("W79TRV");
        registrationNumbers.add("E16UEL");

        System.out.println("items before removing: "+registrationNumbers);
        //create an iterator object
        Iterator<String> elements = registrationNumbers.iterator();
        //repeatedly retrieve items as long as there are items to be retrieved
        while(elements.hasNext())
        {
            String item = elements.next(); // retrieve next element from set
            if (item.charAt(0) <= 'T')  // check first letter of registration
            {
                elements.remove();  // call iterator method to remove registration
            }
        }
        System.out.println("items after removing: "+registrationNumbers);
    }
}
