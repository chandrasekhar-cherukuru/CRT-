package CollectionProblems;

public class Kadanes {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        //we need to return the maximum subarry sum
        int start = 0;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        while(start < arr.length){
            currSum = Math.max(arr[start], currSum + arr[start]);
            maxSum = Math.max(currSum, maxSum);
            start++;
        }

        System.out.println(maxSum);
    }
}
