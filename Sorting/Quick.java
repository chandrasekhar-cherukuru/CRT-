package Sorting;

public class Quick {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int start = 0;
        int end = arr.length - 1;
        quickSort(arr, start, end);
        for(int num : arr){
            System.out.print(num+ " ");
        }

    }

    static void quickSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];
        while(start < end){
            while(arr[start] < pivot){
                start++;
            }

            while(arr[end] > pivot){
                end--;
            }

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

            quickSort(arr, low, end);
            quickSort(arr, start, high);
        }
    }
}
