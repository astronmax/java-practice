package labs.lab_3;

public class TestDog
{    
    public static void main(String[] args) {
        Corgi c = new Corgi("Leo");
        System.out.println(c.toString());
        c.run();

        Husky h = new Husky("Alex");
        System.out.println(h.toString());
        h.say_hello();
    }
}