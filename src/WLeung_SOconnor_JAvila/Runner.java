package WLeung_SOconnor_JAvila;

public class Runner
{
    public static void main(String[] args)
    {
        Shape shape1 = new Rectangle(5,10);
        Shape shape2 = new ETriangle(5);
        Shape shape3 = new Circle(10);
        Shape shape4 = new RPentagon(5);
        System.out.println("I am a " + shape4 + ".");
        System.out.println("My Perimeter is : " + shape4.getPerimeter());
        System.out.println("My Area is : " + shape4.getArea());
        Shape[] shapes = {shape1, shape2, shape3};

        for(Shape cur : shapes)
        {
            System.out.println(cur);
            System.out.println("My Perimeter is : " + cur.getPerimeter());
            System.out.println("My Area is : "  + cur.getArea());
        }
    }
}
