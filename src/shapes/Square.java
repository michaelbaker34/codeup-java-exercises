package shapes;

import java.awt.*;

public class Square extends Quadrilateral {

    public Square (double side) {
        super (side, side);
    }

    public void setLength(double length) {
        super.length = length;
    }

    public void setWidth(double width) {
        super.width = width;
    }

    public double getArea() {
//        System.out.println("--- overridden method ---");
        return super.length * super.length;
    }

    public double getPerimeter() {
//        System.out.println("--- overridden method ---");
        return super.length * 4;
    }

}
