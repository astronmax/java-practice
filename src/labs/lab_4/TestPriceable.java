package labs.lab_4;

public class TestPriceable
{
    public static void main(String[] args) {
        Product prod1 = new Product(42.69, 9000, "Book");
        System.out.println("Product: " + prod1.getName() + "; Price: " + prod1.getPrice());

        Idea idea = new Idea(1000000, "flying cars");
        System.out.println("Idea: " + idea.getSummary() + "; Price: " + idea.getPrice());
    }
}
