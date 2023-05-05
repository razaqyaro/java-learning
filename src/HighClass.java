public class HighClass
{
    private int num;
    private  String str;

    public HighClass() {
        this.num = 0;
        this.str = "Hello";
    }

    public HighClass(int numIn, String strIn)
    {
        this.num = numIn;
        this.str = strIn;
    }
    public void display(int mult)
    {
        System.out.println(100 + mult * num);
    }

    public void display(String strIn)
    {
        System.out.println(str + strIn);
    }
}
