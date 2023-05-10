import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
public class SetDemo
{
    public static void main(String[] args)
    {
        // creates an empty set of String objects
        Set<String> regNums = new HashSet<>();

        // add some objects to the set
        regNums.add("V53PLS");
        regNums.add("X85ADZ");
        regNums.add("L22SBG");
        regNums.add("W79TRV");

        // display the objects in the set
        System.out.println(regNums);
        System.out.println("Size of Set is: "+regNums.size());

        boolean ok = regNums.add("X85ADZ");  // store a boolean return value
        if(!ok) // check if the method returned a value of false
        {
            System.out.println("Item already in the set!");
        }

        regNums.remove("X85ADZ");
        System.out.println(regNums);

        // Using the enhanced for loop to iterate through the regNums
        for(String item: regNums) // iterate through all the items in 'regNums'
        {
            if(item.charAt(0) > 'T') // check if first letter of registration
            {
                System.out.println(item);   // display this registration
            }
        }

        // Equivalent forEach loop doing same job
        regNums.forEach(item ->
        {
            if(item.charAt(0) > 'T')
            {
                System.out.println(item);
            }
        });
        regNums.add("X85ADZ");
        /*
        An Iterator object can be used with a 'while' loop if we wish to iterate over a set and modify i
        its contents
        * */

        // Creating an Iterator object
        Iterator<String> elements = regNums.iterator();
        // repeatedly  retrieve an object as long as there are items to be retrieved
        while(elements.hasNext())
        {
            String item = elements.next(); // retrieve next element from the set
            if(item.charAt(0) <= 'T') // check first letter of registration
            {
                elements.remove(); // call the iterator method to remove registration
            }
        }
        System.out.println("***********************************");
        System.out.println(regNums);
    }
}
