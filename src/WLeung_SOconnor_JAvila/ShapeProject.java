package WLeung_SOconnor_JAvila;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public abstract class ShapeProject
{
    public abstract class Shape
    {
        private String type;
        public Shape(String type)
        {
            this.type = type;
        }
        public abstract  double getArea();
        public abstract double getPerimeter();
        public String toString()
        {
            return "I am a " + type + ".";
        }
    }
}
public class runner
{
    public static void main(String[] args)
    {
        Shape shape1 = new Rectangle(5,10);
        Shape shape2 = new ETriangle(5);
        Shape shape3 = new Circle(10);
        Shape shape4 = new RPentagon(5);
        System.out.println(shape4);
        System.out.println("My Perimeter is : " + shape4.getPerimeter());
        System.out.println("My Area is : " +  shape4.getArea());
        Shape[] shapes {shape1, shape2, shape3};

        for(Shape cur : shapes)
        {
            System.out.println(cur);
            System.out.println("My Perimeter is : " + cur.getArea());
            System.out.println("My Area is : "  + cur.getArea());
        }

    }
}
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

    public double getPerimter()
    {
        return side*5;
    }
}
public abstract class Rectangle extends Shape
{

}
public abstract class Circle extends Shape
{

}
public abstract class ETriangle extends Shape
{

}