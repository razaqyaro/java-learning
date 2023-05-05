public class BankAccount
{
    // the attributes
    private String accountNumber;
    private String accountName;
    private double balance;

    // the methods

    // the constructor
    public BankAccount(String accountNumberIn, String accountNameIn)
    {
        accountNumber = accountNumberIn;
        accountName = accountNameIn;
        balance = 0;
    }

    // methods to read the attributes
    public String getAccountName()
    {
        return accountName;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    // methods to write the attributes
    public void setAccountName(String accountNameIn)
    {
        accountName = accountNameIn;
    }

    public void setAccountNumber(String accountNumberIn)
    {
        accountNumber = accountNumberIn;
    }

    // methods to deposit and withdraw money
    public void deposit(double amountIn)
    {
        balance = balance + amountIn;
    }

    public boolean withdraw(double amountIn)
    {
        if(amountIn > balance)
        {
            return false;
        }
        else
        {
            balance = balance - amountIn;
            return true;
        }
    }
    public double getBalance()
    {
        return balance;
    }
}
