package practices.practice_3;

public class TestMovable
{
    public static void main(String[] args) {
        Movable circle = new MovableCircle(1, 1, 2, 2, 5);
        System.out.println("[BEFORE] " + circle.toString());
        circle.moveUp();
        System.out.println("[AFTER] " + circle.toString());

        Movable rectangle = new MovableRectangle(3, 3, 1, 1, 2, 1);
        System.out.println("\n[BEFORE] " + rectangle.toString());
        rectangle.moveUp();
        System.out.println("[AFTER] " + rectangle.toString());
    }
}
