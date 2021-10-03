package practices.practice_1;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog ();
        Dog d2 = new Dog ("Wolfy");
        Dog d3 = new Dog ("Max", 5);

        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());

        System.out.println("\n[+] Setting name and age to the first dog...");
        d1.set_name("Alexia");
        d1.set_age(4);
        System.out.println("[+] Setting age to the second dog...");
        d2.set_age(3);

        System.out.println("\nAgain: ");
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());

        System.out.println("\n[+] Get dog's ages in human-like style:");
        System.out.println(d1.get_name() + ": " + d1.get_human_age());
        System.out.println(d2.get_name() + ": " + d2.get_human_age());
        System.out.println(d3.get_name() + ": " + d3.get_human_age());
    }
}
