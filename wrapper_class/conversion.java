
public class conversion {
    public static int safeParseInt(String input) {
        if (input == null || input.isEmpty()) return -1;

        int i = (input.charAt(0) == '-') ? 1 : 0;

        for (; i < input.length(); i++)
            if (!Character.isDigit(input.charAt(i)))
                return -1;

        return Integer.parseInt(input);
    }

    public static void main(String[] args) {
        String[] inputs = {"123", "abc", "45.6", "0"};
        for (String s : inputs)
            System.out.println("Input: " + s + " → " + safeParseInt(s));
    }}