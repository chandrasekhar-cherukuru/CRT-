import java.util.*;
public class Duplicates {
    public static void main(String[] args) {
        String str = "google";

        Map<Character, Integer> map = new HashMap<>();

        String dup = "";
        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }else{
                dup += ch;
                map.put(ch, map.get(ch) + 1);
            }
        }

        System.out.println(dup);
    }
}
