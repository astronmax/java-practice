package practices.practice_1;

public class TestBall {

    public static void main(String[] args) {
        Ball b1 = new Ball ();
        Ball b2 = new Ball ("brown");
        Ball b3 = new Ball ("white", "soccer");

        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());

        System.out.println("\n[+] Setting colour and sport to the first ball...");
        b1.set_colour("blue");
        b1.set_sport("Soccer");
        System.out.println("[+] Setting sport to the second ball...");
        b2.set_sport("Rugby");

        System.out.println("\nAgain: ");
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
    }
}
