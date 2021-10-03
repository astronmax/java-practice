package practices.practice_3;

public class Rectangle extends Shape
{
    protected double width;
    protected double length;

    public Rectangle() {
        super();
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return (this.width * this.length);
    }

    public double getPerimeter() {
        return (2*this.width + 2*this.length);
    }

    public String toString() {
        return ("Shape: rectangle, width: " + this.width + ", length: " + this.length + ", color: " + this.color);
    }
}
