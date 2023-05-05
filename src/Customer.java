public class Customer
{
    private String customerId;
    private String name;
    private double creditLimit;

    public Customer(String IdIn, String nameIn, double limitIn)
    {
        this.customerId = IdIn;
        this.name = nameIn;
        this.creditLimit = limitIn;
    }

    public String getCustomerId()
    {
        return customerId;
    }

    public String getName()
    {
        return name;
    }

    public double getCreditLimit()
    {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit)
    {
        this.creditLimit = creditLimit;
    }
}
