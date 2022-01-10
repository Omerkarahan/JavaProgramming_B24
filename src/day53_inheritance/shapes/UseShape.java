package day53_inheritance.shapes;

public class UseShape {
    public static void main(String[] args) {

        Shape shape = new Shape("Shape");
        System.out.println(shape.name);
        System.out.println(shape.area());
        System.out.println(shape.perimeter());

        Square square = new Square(5);
        System.out.println(square.name);
        System.out.println(square.area());
        System.out.println(square.perimeter());

        Circle circle = new Circle(3.5);
        System.out.println(circle.name);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());
    }
}
