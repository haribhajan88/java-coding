import java.util.*;
/
public class MaxValueKey {
    public static void main(String[] args) {
        Map<String,Integer> m = Map.of("A",10,"B",20,"C",15);
        String ans = Collections.max(m.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(ans); 
    }
}