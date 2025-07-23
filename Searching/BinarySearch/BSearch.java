package Searching.BinarySearch;

public class BSearch {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 8, 10, 12, 15};
        int target = 10;
        int start = 0;
        int end = arr.length - 1;
        int index = findB(arr, start, end, target);
        System.out.println(index);
    }

    static int findB(int[] arr, int start, int end, int target){

        int mid = start +(end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid] < target){
            return findB(arr, mid + 1, end, target);
        }else{
            return findB(arr, start, mid - 1, target);
        }
    }
}
