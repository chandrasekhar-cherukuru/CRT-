package Collections.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String str = "this is this is class for class";
        String[] sArray = str.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for(String s : sArray){

            if(!map.containsKey(s)){
                map.put(s, 1);
            }else{
                map.put(s, map.get(s) + 1);
            }

        }

        for(String s : map.keySet()){
            char ch = s.charAt(0);

            String ss =Character.toUpperCase(ch) +  s.substring(1, s.length());
            System.out.println(ss+ " " +map.get(s));
        }
    }
}
