package WLeung_SOconnor_JAvila;

public class Rectangle extends Shape
{
    public double length;
    public double width;
    public Rectangle(double length, double width)
    {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea()
    {
        return length * width;
    }
    @Override
    public double getPerimeter()
    {
        return (2 * length) + (2 * width);
    }
}
