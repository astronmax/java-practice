package practices.practice_4;

public class Utils {
    
    // Task 8
    private static boolean palindrome(String str) {
        if (str.length() == 0 || str.length() == 1)
            return true;
        
        if (str.charAt(0) == str.charAt(str.length() - 1))
            return palindrome(str.substring(1, str.length() - 1));

        return false;
    }

    private static int reverse_int(int n, int order) {
        if (n == 0)
            return 0;

        return (n % 10) * order + reverse_int(n / 10, order / 10);
    }

    // Wrapper for task 8
    public static boolean is_palindrome(String str) {
        return palindrome(str.replaceAll(" ", "").toLowerCase());
    }

    // Task 9
    public static int count_sequences(int a, int b) {
        if (a == 0 && b != 0)
            return 1;
        
        if ((a > b) || (a <= 0 && b <= 0))
            return 0;
        
        if (a == 1 && b != 0)
            return b + 1;
        
        return (count_sequences(a - 1, b - 1) + count_sequences(a, b - 1));
    }

    // Task 10
    public static int reverse_int(int n) {
        var order = 1;
        while (n / order >= 10)
            order *= 10;
        
        return reverse_int(n, order);
    }
}
