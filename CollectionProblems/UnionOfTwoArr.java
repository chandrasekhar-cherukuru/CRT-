package CollectionProblems;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArr {
    public static void main(String[] args) {
        //unique of two arrs
        int[] arr1 = {1, 3, 5, 6, 7, 4};
        int[] arr2 = {3, 4, 5, 6, 8, 10, 12};

        //if any array length is 0 return other array

        Set<Integer> set = new HashSet<>();
        for(int num : arr1){
            set.add(num);
        }

        for(int num2 : arr2){
            set.add(num2);
        }

        System.out.println(set);
    }
}
