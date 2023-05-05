public class Oblong
{
    // the attributes
    private double length;
    private double height;

    //the methods

    //constructor
    public Oblong (double lengthIn, double heightIn)
    {
        length = lengthIn;
        height = heightIn;
    }

    // this method allows us to read the length attribute
    public double getLength()
    {
        return length;
    }

    // this method allows us to read the height attribute

    public double getHeight()
    {
        return height;
    }

    // the ff two methods allows us to write to the length and height attributes
    public void setLength(double lengthIn)
    {
        length = lengthIn;
    }

    public void setHeight(double heightIn)
    {
        height = heightIn;
    }

    // calculates the area
    public double calculateArea()
    {
        return length * height;
    }

    // calculates the perimeter

    public double calculatorPerimeter()
    {
        return 2 * (height + length);
    }
}
