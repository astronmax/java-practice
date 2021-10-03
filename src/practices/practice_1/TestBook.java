package practices.practice_1;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book ();
        Book b2 = new Book (13);
        Book b3 = new Book (13, 395, "Raymond Murphy");

        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());

        System.out.println("\n[+] Setting price, pages and author to the first book...");
        b1.set_price(15);
        b1.set_pages(452);
        b1.set_author("Andrew Johnson");
        System.out.println("[+] Setting pages and author to the second book...");
        b2.set_pages(327);
        b2.set_author("Tom Harly");

        System.out.println("\nAgain: ");
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
    }
}
