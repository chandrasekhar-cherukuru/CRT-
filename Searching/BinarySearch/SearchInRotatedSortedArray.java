package Searching.BinarySearch;

import java.lang.classfile.Superclass;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] rotated = {5, 6, 7, 8, 1, 2, 3, 4};

        int target = 2;

        int start = 0;
        int end = rotated.length - 1;
        while(start <= end){

            int mid = start + (end - start) / 2;
            if(rotated[mid] == target){
                System.out.println(mid);
                return;
            }

            if(rotated[start] <= rotated[mid]){

                if(target <= rotated[mid] && target >= rotated[start]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target >= rotated[mid] && target <= rotated[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }

        }

        System.out.println(-1);
        
    }
}
