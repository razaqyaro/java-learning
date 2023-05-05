public class CheckableCustomer extends Customer implements Checkable
{
    public CheckableCustomer(String IdIn, String nameIn, double limitIn)
    {
        super(IdIn, nameIn, limitIn);
    }
    @Override
    public boolean check()
    {
        if(getCustomerId().length() != 4)
        {
             return false;
        }
        if(!Character.isLetter(getCustomerId().charAt(0)))
        {
            return false;
        }
        for(int i = 1; i < 4; i++)
        {
           // char c = getCustomerId().charAt(i);
            if(!Character.isDigit(getCustomerId().charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
}
