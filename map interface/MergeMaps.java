import java.util.*;

public class MergeMaps {
    public static void main(String[] args) {
        Map<String,Integer> a = new HashMap<>(Map.of("A",1,"B",2));
        Map<String,Integer> b = Map.of("B",3,"C",4);
        for(var e: b.entrySet()){
            String key = e.getKey();
            Integer val = e.getValue();
            a.put(key, a.getOrDefault(key,0) + val);
        }
        System.out.println(a); 
    }
}