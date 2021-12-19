package practices.practice_6;

public class Student {
    
    private int idNumber;
    private String name;
    private int gpa;

    public Student() {
        idNumber = 0;
        name = "";
        gpa = 0;
    }

    public Student(int idNumber, String name, int gpa) {
        this.idNumber = idNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public int get_id() {
        return idNumber;
    }

    public String get_name() {
        return name;
    }

    public int get_gpa() {
        return gpa;
    }

    public String toString() {
        return "[Name: " + get_name() + "; id: " + get_id() + "; gpa: " + get_gpa() + "]";
    }

    public int compareTo(Student other) {
        return (other.get_gpa() - this.get_gpa());
    }
}
