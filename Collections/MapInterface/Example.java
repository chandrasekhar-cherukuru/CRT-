package Collections.MapInterface;

import java.util.*;
public class Example {
    public static void main(String[] args) {
        int[] arr = {11, 2, 13, 2, 4, 5, 2, 6};
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue());
        }

        // map.forEach((k, v) ->{
        //     System.out.println((v == 1) ? "Yes" : "No");
        // });



        
    }
    
}

//program to find out word frequency from given statement or paragraph
