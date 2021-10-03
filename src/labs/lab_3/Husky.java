package labs.lab_3;

public class Husky extends Dog
{
    public Husky() {
        super("undefined", "husky");
    }

    public Husky(String name) {
        super(name, "husky");
    }

    public void say_hello() {
        System.out.println("Husky " + this.get_name() + "say hello to you!");
        this.voice();
        this.give_paw();
    }
}
