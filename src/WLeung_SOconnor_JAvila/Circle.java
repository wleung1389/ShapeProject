package WLeung_SOconnor_JAvila;

public class Circle extends Shape
{
    private int radius;
    public Circle(int radius)
    {
        super("Circle");
        this.radius = radius;
    }
    @Override
    public double getPerimeter()
    {
        return (2*radius)*Math.PI;
    }
    public double getArea()
    {
        return Math.PI*(radius*radius);
    }
}
