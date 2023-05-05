
import java.io.IOException;
public class TestException
{
    // this method is declared 'static' as it is a class method
    public static int getInteger() throws IOException
    {
        byte[] buffer = new byte[512]; //declare a large byte array
        System.in.read(buffer);
        String s = new String(buffer);
        s = s.trim();
        int num = Integer.parseInt(s);
        return num;
    }
}
