public class Checker
{
    public static void main(String[] args)
    {
        //create two customer objects
        CheckableCustomer customer1 = new CheckableCustomer("T567", "Abdul Razak",12000);
        CheckableCustomer customer2 = new CheckableCustomer("726", "Usman Attique",8000);
        CheckableCustomer customer3 = new CheckableCustomer("Q2080", "Abdul Razak",12000);

        System.out.println("Customer1: "+checkValidity(customer1));
        System.out.println("Customer2: "+checkValidity(customer2));
        System.out.println("Customer3: "+checkValidity(customer3));

    }
    private static String checkValidity(CheckableCustomer objectIn)
    {
        if(objectIn.check())
        {
            return "VALID";
        }
        else
        {
            return "INVALID";
        }
    }
}
