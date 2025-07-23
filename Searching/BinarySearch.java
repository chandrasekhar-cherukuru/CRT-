package Searching;

public class BinarySearch {

    static int res = -1;
    public static void main(String[] args) {
        
        int[] arr = { 3, 5, 7, 8, 10, 12, 15};
        int target = 7;

        
        int start = 0;
        int end = arr.length - 1;
        binarySearch(arr, start, end, target);
        System.out.println(res);
    }
    
    static void binarySearch(int[] arr, int start, int end, int target){
        
        
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            res = mid;
            return;
        }

        if(arr[mid] < target){
            binarySearch(arr, mid + 1, end, target);
        }else{
            binarySearch(arr, start, mid - 1, target);
        }
    }
}
