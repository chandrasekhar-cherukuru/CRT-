package CollectionProblems;

public class LongestSubarray {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 12;

        // int start = 0;
        // int end = 0;
        
        // int maxLen = 0;
        // int currSum = 0;
        // while(end < arr.length){

        //   currSum += arr[end];

        //   //now the problem comes with start when currSum > sum
        //   while(currSum > sum && start < end){
        //     currSum -= arr[start];
        //     start++;
        //   }
        //   if(currSum == sum){
        //     maxLen = Math.max(maxLen, end - start + 1);
        //   }

        //   end++;
        // }

        // System.out.println(maxLen);

       //brute force
       int brute = findBrute(arr, sum);
       System.out.println(brute);

    }

    static int findBrute(int[] arr, int sum){

      int maxLen = 0;
      for(int i = 0; i < arr.length; i++){
        int currSum = 0;
        for(int j = i; j < arr.length; j++){

          currSum += arr[j];
          if(currSum == sum){
            maxLen = Math.max(maxLen, j - i + 1);
          }

        }

      }

      return maxLen;
    }

}
