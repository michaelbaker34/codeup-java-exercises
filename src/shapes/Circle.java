package shapes;

public class Circle {

    private double radius;

    public Circle(double radius) {
        System.out.printf("Circumference: %.2f%n", this.getCircumference(radius));
        System.out.printf("Area: %.2f%n", this.getArea(radius));
    }

    public double getArea(double radius) {
        return Math.PI * (Math.pow(radius, radius));
    }

    public double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

}
