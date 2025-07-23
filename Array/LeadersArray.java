import java.util.*;
public class LeadersArray {
    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        List<Integer> list = new ArrayList<>();

        int n = arr.length;
        int maxRight = arr[n - 1];
        list.add(maxRight);
        for(int i = n - 2; i > 0; i--){

            if(arr[i] > maxRight){
                maxRight = arr[i];
                list.add(0, maxRight);
            }
        }

        for(int i = 0; i < list.size(); i++){
            int ele = list.get(i);
            System.out.print(ele+ " ");
        }
    }
}
