package practices.practice_2;

public class TestBall 
{
    public static void main(String[] args) {
        Ball ball = new Ball(1, 1);
        System.out.println("X: " + ball.getX());
        System.out.println("Y: " + ball.getY());
        
        System.out.println("\nSet x and y to 2...");
        ball.setX(2.0);
        ball.setY(2.0);
        System.out.println("X: " + ball.getX());
        System.out.println("Y: " + ball.getY());

        System.out.println("\nMoving ball...");
        ball.move(2.0, 4.0);
        System.out.println("X: " + ball.getX());
        System.out.println("Y: " + ball.getY());

        System.out.println(ball.toString());
    }
}
