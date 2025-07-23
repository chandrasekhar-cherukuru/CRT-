package Searching;

public class LinearS {
    public static void main(String[] args) {
        int[] arr = {5, 9, 11, 17, 25, 12, 11};
        int target = 11;
        int pos = linearSearch(arr, target);
    }

    static int linearSearch(int[] arr, int target){
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
        
    }
}
