package shapes;

public class Circle {

    private double radius = 3;

    public Circle(double radius) {
    }

    public double getArea() {
        return Math.PI * (Math.pow(radius, radius));
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

}
