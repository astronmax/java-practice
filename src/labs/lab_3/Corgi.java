package labs.lab_3;

public class Corgi extends Dog
{
    public Corgi() {
        super("undefined", "corgi");
    }

    public Corgi(String name) {
        super(name, "corgi");
    }

    public void run() {
        System.out.println("Cogri " + this.get_name() + " starts running");
        this.voice();
    }
}
