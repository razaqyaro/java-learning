import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
public class ForEachRemainingDemo
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

        // the lambda expression is applied to each remaining item in the collection
        elements.forEachRemaining(item ->{
                                            if(item.charAt(0) <= 'T')
                                            {
                                                elements.remove();
                                            }
                                          }
                                  );
        System.out.println(registrationNumbers);
    }
}
