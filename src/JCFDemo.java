import java.util.ArrayList;
import java.util.List;
public class JCFDemo
{
    public static void main(String[] args)
    {
        List<String> printQ = new ArrayList<>();
        List<Oblong> someOblongs = new ArrayList<>();

        printQ.add("Biography");
        printQ.add("History");
        printQ.add("Education");
        printQ.add("Food");
        printQ.add("LifeStyle");
        printQ.add("Fiction");
        printQ.add("Material");
        printQ.add("Physical");
        printQ.add("Social");
        printQ.add("Mercurial");

        someOblongs.add(new Oblong(7, 4));
        someOblongs.add(new Oblong(6, 11));
        someOblongs.add(new Oblong(8, 10));

        System.out.println(printQ);

        printQ.add(0, "Physical"); // The add() method here takes the position and the element to add
        System.out.println(printQ);

        System.out.println();
        printQ.set(2, "Biology");  // the set() method will override the element in the specified index with the given element
        System.out.println();
        System.out.println(printQ);
        System.out.println("Size: " +printQ.size()); // the size of the List

        int index = printQ.indexOf("Food"); // check the index of Food
        if(index != -1)
        {
            System.out.println("Food is at index position: "+index);
        }
        else
        {
            System.out.println("Food is not in list");
        }

        printQ.remove(2);
        printQ.remove("LifeStyle");
        System.out.println(printQ);

        System.out.println("the first item is "+printQ.get(0));  // .get() retrieve an object via the index

        if(printQ.contains("Biology"))  // Using the .contains method to check if "Biology" exist in the list
        {
            System.out.println("Biology is in the list");
        }
        else
        {
            System.out.println("Biology is not in the list");
        }

        System.out.println(printQ);
        if(printQ.isEmpty())    // Using the .isEmpty method to check if the list is empty or not. Returns true or false
        {
            System.out.println("Print Queue is empty");
        }
        else
        {
            System.out.println("Print Queue is not empty");
        }

        for(String item: printQ)  // iterate through all items in the 'printQ' list
        {
            if(item.endsWith("tion")) // check if it actually ends with "ogy"
            {
                System.out.println(item); // display the item
            }
        }
        // Using the forEach loop to iterate through the list
        printQ.forEach(item ->
                 {
                     if(item.endsWith("ial")) // check if an element ends with "ial"
                     {
                         System.out.println(item);  // display the item
                     }
                 });
    }

}
