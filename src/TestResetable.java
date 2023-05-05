public class TestResetable
{
    public static void main(String[] args)
    {
        Oblong myOblong = new Oblong(2, 4);
        BankAccount account = new BankAccount("34242422", "Smith");

        account.deposit(1000);
        resetObject(() -> {
                    myOblong.setLength(1);
                    myOblong.setHeight(1);
                }
        );
        resetObject(() -> {
            account.withdraw(1000);
        });

        System.out.println(myOblong.getLength());
        System.out.println(myOblong.getHeight());
        System.out.println(account.getBalance());
    }
    static void resetObject(Resetable objectIn)
    {
        objectIn.reset();
    }
}

