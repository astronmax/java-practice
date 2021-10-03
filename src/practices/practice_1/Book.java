package practices.practice_1;

public class Book
{
    private int m_price;
    private int m_pages;
    private String m_author;

    public Book() {
        this.m_price = 0;
        this.m_pages = 0;
        this.m_author = "Empty";
    }

    public Book(int price) {
        this.m_price = price;
        this.m_pages = 0;
        this.m_author = "Empty";
    }

    public Book(int price, int pages) {
        this.m_price = price;
        this.m_pages = pages;
        this.m_author = "Empty";
    }

    public Book(int price, int pages, String author) {
        this.m_price = price;
        this.m_pages = pages;
        this.m_author = author;
    }

    public void set_price(int price) {
        this.m_price = price;
    }

    public int get_price() {
        return this.m_price;
    }

    public void set_pages(int pages) {
        this.m_pages = pages;
    }

    public int get_pages() {
        return this.m_pages;
    }

    public void set_author(String author) {
        this.m_author = author;
    }

    public String get_author() {
        return this.m_author;
    }

    public String toString() {
        return ("Price: " + this.m_price + ", Pages: " + this.m_pages + ", Author: " + this.m_author);
    }
}
