package labs.lab_2;

class Head
{
    // Fields
    private String m_hair;
    private String m_eyes;

    public Head(String hair, String eyes) {
        this.m_hair = hair;
        this.m_eyes = eyes;
    }

    // Getters and setters
    public void set_hair(String hair) {
        this.m_hair = hair;
    }

    public String get_hair() {
        return this.m_hair;
    }

    public void set_eyes(String eyes) {
        this.m_eyes = eyes;
    }

    public String get_eyes() {
        return this.m_eyes;
    }

    // Methods
    public String toString() {
        return ("- Hair: " + this.m_hair + "\n- Eyes: " + this.m_eyes);
    }
}

class Leg
{
    // Fields
    private String m_direct; // is leg left or right
    
    public Leg(String m_direct) {
        this.m_direct = m_direct;
    }

    // Getters and setters
    public void set_direct(String direct) {
        this.m_direct = direct;
    }

    public String get_direct() {
        return this.m_direct;
    }

    // Methods
    public void make_step() {
        System.out.println("- Make step using " + this.m_direct + " leg");
    }
}

class Hand
{
    // Fields
    private String m_direct; // is leg left or right

    public Hand(String direct) {
        this.m_direct = direct;
    }

    // Getters and setters
    public void set_direct(String direct) {
        this.m_direct = direct;
    }

    public String get_direct() {
        return this.m_direct;
    }

    // Methods
    public void wave() {
        System.out.println("- Make wave using " + this.m_direct + " hand");
    }
}

public class Human
{
    // Fields
    private Head m_head; // head
    
    // legs
    private Leg m_rleg;
    private Leg m_lleg;

    // hands
    private Hand m_rhand;
    private Hand m_lhand;

    public Human(String hair, String eyes) {
        this.m_head = new Head(hair, eyes);
        
        this.m_rleg = new Leg("right");
        this.m_lleg = new Leg("left");

        this.m_rhand = new Hand("right");
        this.m_lhand = new Hand("left");
    }

    public Head get_head() {
        return this.m_head;
    }

    public Leg get_rleg() {
        return this.m_rleg;
    }

    public Leg get_lleg() {
        return this.m_lleg;
    }

    public Hand get_rhand() {
        return this.m_rhand;
    }

    public Hand get_lhand() {
        return this.m_lhand;
    }

    public void move() {
        this.m_rleg.make_step();
        this.m_lleg.make_step();
    }
}
