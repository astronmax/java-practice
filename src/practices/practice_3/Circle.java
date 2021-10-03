package practices.practice_3;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends Shape
{
    private double radius;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return (pow(this.radius, 2) * PI);
    }

    public double getPerimeter() {
        return (2 * PI * this.radius);
    }

    public String toString() {
        return ("Shape: circle, radius: " + this.radius+", color: " + this.color);
    }
}
