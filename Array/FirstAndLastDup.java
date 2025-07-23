import java.util.*;
public class FirstAndLastDup {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 3, 5, 7, 6, 8};

        Set<Integer> set = new HashSet<>();
        int firstDupInd = 0;
        for(int num : arr){
            if(!set.contains(num)){
                set.add(num);
            } else {
                if(firstDupInd == 0){
                    System.out.println("First Duplicate is: " +num);

                    firstDupInd = 1;

                }else{
                    System.out.println("Second Duplicate is: " +num);
                }
            }
        }
    }
}
