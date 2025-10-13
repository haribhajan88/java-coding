
package functional;
import java.util.function.Function;
public class str_length {
    public static void main(String[] args) {
        Function<String, Integer> messageLength = message -> message.length();

        String message = "Hello sir ji";
        int length = messageLength.apply(message);

        if (length > 50) {
            System.out.println("character limit: " + length + " characters.");
        } else {
            System.out.println("within the limit: " + length + " characters.");
        }
    }
}

