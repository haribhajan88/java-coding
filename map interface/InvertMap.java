import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        Map<String,Integer> m = Map.of("A",1,"B",2,"C",1);
        Map<Integer,List<String>> res = new HashMap<>();
        for(var e: m.entrySet()){
            Integer value = e.getValue();
            String key = e.getKey();
            res.computeIfAbsent(value, k-> new ArrayList<>()).add(key);
        }
        System.out.println(res);
    }
}