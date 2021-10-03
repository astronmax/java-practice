package practices.practice_1;

public class Ball
{
    private String m_colour;
    private String m_sport;

    public Ball() {
        this.m_colour = "Empty";
        this.m_sport = "Empty";
    }

    public Ball(String colour) {
        this.m_colour = colour;
        this.m_sport = "Empty";
    }

    public Ball(String colour, String sport) {
        this.m_colour = colour;
        this.m_sport = sport;
    }

    public void set_colour(String colour) {
        this.m_colour = colour;
    }

    public String get_colour() {
        return this.m_colour;
    }

    public void set_sport(String sport) {
        this.m_sport = sport;
    }

    public String get_sport() {
        return m_sport;
    }

    public String toString() {
        return ("Colour: " + this.m_colour + ", Sport: " + this.m_sport);
    }
}
