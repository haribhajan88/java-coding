import java.util.Scanner;

public class day_4_4 {
    public static char[] getChars(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }
    public static boolean areArraysEqual(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // Main method
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();  // Takes input until space

        char[] customChars = getChars(input);           // User-defined method
        char[] builtInChars = input.toCharArray();      // Built-in method

        boolean result = areArraysEqual(customChars, builtInChars);

        System.out.println("Are both arrays equal? " + result);
    }
}