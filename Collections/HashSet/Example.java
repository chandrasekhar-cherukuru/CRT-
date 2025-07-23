package Collections.HashSet;

import java.util.HashSet;

public class Example {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        int num = 10;
        for(int i = 1; i <= 5; i++){
            hs.add(num);
            num += 10;
        }

        System.out.println(hs);
        hs.add(20);
        System.out.println(hs);
        
    }
}
