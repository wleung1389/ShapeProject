package WLeung_SOconnor_JAvila;

public class ETriangle extends Shape
{
    private int side;
    public ETriangle(int side)
    {
        super("ETriangle");
        this.side = side;
    }
    @Override
    public double getArea()
    {
        return (Math.sqrt((side*side) - ((side*.5) * (side*.5)))*side)/2;
    }

    @Override
    public double getPerimeter()
    {
        return side*3;
    }

}