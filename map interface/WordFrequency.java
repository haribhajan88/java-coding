import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String s = "Hello world, hello Java!";
        s = s.toLowerCase().replaceAll("[^a-z ]", "");
        
        String[] words = s.split("\s+");
       
        Map<String,Integer> map = new HashMap<>();
       
        for(String w: words){
            if(w.isEmpty()) continue;
           
            map.put(w, map.getOrDefault(w,0) + 1);
        }
       
        System.out.println(map);
    }
}