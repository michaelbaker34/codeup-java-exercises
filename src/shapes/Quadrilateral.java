package shapes;

public abstract class Quadrilateral implements Measurable{
    protected double length;
    protected double width;

    public abstract void setLength(double length);
    public abstract void setWidth(double width);

    public Quadrilateral(double length, double width) {
        setLength(length);
        setWidth(width);
    }



}
