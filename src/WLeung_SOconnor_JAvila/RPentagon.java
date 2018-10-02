package WLeung_SOconnor_JAvila;

public class RPentagon extends Shape
{
    private int side;

    public RPentagon(int side)
    {
        super("RPentagon");
        this.side = side;
    }
    @Override
    public double getArea()
    {
        return 0.25*Math.sqrt(5*(5+2*Math.sqrt(5)))*(side*side);
    }
    public double getPerimeter()
    {
        return side*5;
    }
}
