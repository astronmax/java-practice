package labs.lab_3;

abstract public class Dog
{
    private String m_name;
    private String m_breed;

    public Dog(String name, String breed) {
        this.m_name = name;
        this.m_breed = breed;
    }

    public String get_name() {
        return this.m_name;
    }

    public String get_breed() {
        return this.m_breed;
    }

    public void set_name(String name) {
        this.m_name = name;
    }

    public void set_breed(String breed) {
        this.m_breed = breed;
    }

    public void voice() {
        System.out.println("Woof!");
    }

    public void give_paw() {
        System.out.println("paw has been given");
    }

    public String toString() {
        return ("[Dog] Name: " + this.m_name + "; Breed: " + this.m_breed);
    }
}