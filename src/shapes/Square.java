package shapes;

public class Square extends Rectangle {

    public Square (double side) {
        super (side, side);
        length = side;
        width = side;
    }

    public double getArea() {
        System.out.println("--- overridden method ---");
        return length * length;
    }

    public double getPerimeter() {
        System.out.println("--- overridden method ---");
        return length * 4;
    }

}
