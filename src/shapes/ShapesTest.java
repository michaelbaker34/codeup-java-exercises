package shapes;

public class ShapesTest {

    public static void main(String[] args) {

//        Rectangle box1 = new Rectangle(5, 4);
//        Rectangle box2 = new Square(5);

//        System.out.println("Rectangle");
//        System.out.printf("Perimeter: %.2f%n", box1.getPerimeter());
//        System.out.printf("Area: %.2f%n", box1.getArea());
//        System.out.println("Square");
//        System.out.printf("Perimeter: %.2f%n", box2.getPerimeter());
//        System.out.printf("Area: %.2f%n", box2.getArea());

        Quadrilateral quad1;
        quad1 = new Rectangle(5, 4);

        Quadrilateral quad2;
        quad2 = new Square(5);

        System.out.println("Rectangle");
        System.out.printf("Area: %.2f%n", quad1.getArea());
        System.out.printf("Perimeter: %.2f%n", quad1.getPerimeter());
        System.out.println("Square");
        System.out.printf("Area: %.2f%n", quad2.getArea());
        System.out.printf("Perimeter: %.2f%n", quad2.getPerimeter());

    }

}
