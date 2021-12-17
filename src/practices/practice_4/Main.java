package practices.practice_4;

class Test {

    public static boolean is_palindrome() {
        String[] true_cases = {"qqaaqq", "aaaaaa", "Hello Olleh", "Madam Im Adam"};
        String[] false_cases = {"Hello World", "qwertyuiop", "12"};

        for (var str : true_cases) {
            if (!Utils.is_palindrome(str))
                return false;
        }

        for (var str : false_cases) {
            if (Utils.is_palindrome(str))
                return false;
        }
        
        return true;
    }

    public static boolean count_sequences() {
        if (Utils.count_sequences(2, 3) != 5)
            return false;
        
        if (Utils.count_sequences(3, 4) != 7)
            return false;
        
        if (Utils.count_sequences(4, 3) != 0)
            return false;
        
        if (Utils.count_sequences(0, 0) != 0)
            return false;
        
        return true;
    }

    public static boolean reverse_int() {
        if (Utils.reverse_int(1234) != 4321 || Utils.reverse_int(162935) != 539261)
            return false;
        
        if (Utils.reverse_int(1) != 1 || Utils.reverse_int(9) != 9)
            return false;
        
        return true;
    }
}

public class Main {

    public static void main(String[] args) {
        if (Test.is_palindrome() && Test.count_sequences())
            System.out.println("OK");
        else
            System.out.println("Error");
    }
}