package practices.practice_2;

public class TestAuthor
{
    public static void main(String[] args) {
        Author author = new Author("John", "john@gmail.com", 'M');
        System.out.println("Name: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gender: " + author.getGender());

        author.setEmail("other@gmail.com");
        System.out.println("Email after changing: " + author.getEmail());

        System.out.println("\nString: " + author.toString());
    }
}
