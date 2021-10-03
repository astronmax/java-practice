package practices.practice_3;

public class MovableCircle implements Movable
{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return ("Shape: circle (movable), coords: " + this.center.toString());
    }

    public void moveUp() {
        this.center.moveUp();
    }

    public void moveDown() {
        this.center.moveDown();
    }

    public void moveRight() {
        this.center.moveRight();
    }

    public void moveLeft() {
        this.center.moveLeft();
    }

    public int getRadius() {
        return this.radius;
    }
}
