
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";

        if(str1.length() != str2.length()){
            System.out.println("Not an anagram");
        }

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str1.length(); i++){
            char ch = str1.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }else{

                map.put(ch, map.get(ch) + 1);

            }
        }

       for(int i = 0; i < str2.length(); i++){
        char ch = str2.charAt(i);
        if()
       }
    }
}
