package practices.practice_1;

public class Dog
{
    private String m_name;
    private int m_age;

    public Dog(String name, int age) {
        this.m_name = name;
        this.m_age = age;
    }

    public Dog(String name) {
        this.m_name = name;
        this.m_age = 0;
    }

    public Dog() {
        this.m_name = "Empty";
        this.m_age = 0;
    }

    public void set_name(String name) {
        this.m_name = name;
    }

    public String get_name() {
        return this.m_name;
    }

    public void set_age(int age) {
        this.m_age = age;
    }

    public int get_age() {
        return this.m_age;
    }

    public String toString() {
        return ("Name: " + this.m_name + ", Age: " + this.m_age);
    }

    public int get_human_age() {
        return (this.m_age * 7);
    }
}