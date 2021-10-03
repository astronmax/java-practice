package labs.lab_4;

public class Idea implements Priceable
{
    private double m_price;
    private String m_summary;

    public Idea() {
        this.m_price = 0;
        this.m_summary = "undefined";
    }

    public Idea(double price, String summary) {
        this.m_price = price;
        this.m_summary = summary;
    }

    // Implementation of priceable class methods
    public double getPrice() {
        return this.m_price;
    }

    public void setPrice(double price) {
        this.m_price = price;
    }

    // Other getters and setters
    public void setSummary(String summary) {
        this.m_summary = summary;
    }

    public String getSummary() {
        return this.m_summary;
    }
}
