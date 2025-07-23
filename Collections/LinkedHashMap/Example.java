package Collections.LinkedHashMap;

import java.util.LinkedHashMap;

public class Example {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(101, "Hi");
        lhm.put(102, "Hii");
        lhm.put(103, "Hiii");
        lhm.put(104, "Hiiiii");
        System.out.println(lhm);
    }
}
