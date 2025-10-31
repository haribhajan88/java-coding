
public class utility_mode {
    public static void main(String[] args) {
        int intValue = Integer.parseInt("123");
        System.out.println("Integer.parseInt(\"123\"): " + intValue);

        
        double doubleValue = Double.parseDouble("3.14");
        System.out.println("Double.parseDouble(\"3.14\"): " + doubleValue);

        
        boolean booleanValue = Boolean.parseBoolean("true");
        System.out.println("Boolean.parseBoolean(\"true\"): " + booleanValue);

        
        String binaryString = Integer.toBinaryString(10);
        System.out.println("Integer.toBinaryString(10): " + binaryString);

        
        boolean isDigit = Character.isDigit('5');
        System.out.println("Character.isDigit('5'): " + isDigit);

        
        char upperChar = Character.toUpperCase('a');
        System.out.println("Character.toUpperCase('a'): " + upperChar);
    }
}
