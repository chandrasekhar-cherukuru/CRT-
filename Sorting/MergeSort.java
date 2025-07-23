package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int start = 0;
        int end = arr.length - 1;

        mSort(arr, start, end);
        for(int num : arr){
            System.out.print(num+ " ");
        }
    }

    public static void mSort(int[] arr, int start, int end){

        if(start < end){

            int mid = start + (end - start) / 2;
            mSort(arr, start, mid);
            mSort(arr, mid + 1, end);
            merge(arr, start, mid, end);

        }
    }

    public static void merge(int[] arr, int start, int mid, int end){

        int[] arr1 = new int[mid - start + 1];
        int[] arr2 = new int[end - mid];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = arr[start + i];
        }

        for(int i = 0; i < arr2.length; i++){
            arr2[i] = arr[mid + i + 1];
        }

        int i = 0;
        int j = 0;
        int k = start;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                arr[k++] = arr1[i++];
                
            }else{
                arr[k++] = arr2[j++];
                
            }
        }

        while(i < arr1.length){
            arr[k++] = arr1[i++];
        }

        while(j < arr2.length){
            arr[k++] = arr2[j++];
        }
    }
}
