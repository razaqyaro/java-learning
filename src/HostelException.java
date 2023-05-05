public class HostelException extends RuntimeException
{
    public HostelException()
    {
        super("Error in Application");
    }
    public HostelException(String message)
    {
        super(message);
    }
}
