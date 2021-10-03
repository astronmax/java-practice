package labs.lab_2;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human("black", "green");
        System.out.println("[+] Info about human");
        System.out.println(human.get_head().toString());

        System.out.println("[+] Make movement");
        human.move();

        System.out.println("[+] Make wave");
        human.get_rhand().wave();
        human.get_lhand().wave();
    }
}
