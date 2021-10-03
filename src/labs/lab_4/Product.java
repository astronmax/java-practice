package labs.lab_4;

public class Product implements Priceable
{
    private double m_price;
    private double m_count;
    private String m_name;

    public Product() {
        this.m_price = 0;
        this.m_count = 0;
        this.m_name = "undefined";
    }

    public Product(double price, double count, String name) {
        this.m_price = price;
        this.m_count = count;
        this.m_name = name;
    }

    // Implementation of priceable class methods
    public double getPrice() {
        return this.m_price;
    }

    public void setPrice(double price) {
        this.m_price = price;
    }

    // Other getters and setters
    public double getCount() {
        return this.m_count;
    }

    public String getName() {
        return this.m_name;
    }

    public void setCount(double count) {
        this.m_count = count;
    }

    public void setName(String name) {
        this.m_name = name;
    }
}
