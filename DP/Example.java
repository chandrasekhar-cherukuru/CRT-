package DP;


// why ?
// to solve problems by breaking them down into smaller sub problemns

// used when problem can be divided  into smaller subproblems

//memoization -> recurssion
// or tabulation -> iteration


// steps to solve dp

// identify characteristics
// memoization
// define dp[i]
// write recurrance relation
// set base cases

public class Example {
    public static void main(String[] args) {
        int n = 3;
        
        //using normal recurssion
        int nth = findFib(n);
        System.out.println(nth);

        //using dp
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }

        int nth2 = findFib2(n, dp);
        System.out.println(nth2);

        //using meoization
        int nth3 = findFib3(n);
        System.out.println(nth3);

    }

    //normal recursion 
    static int findFib(int n){


        if(n == 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }



        return findFib(n - 1) + findFib(n - 2);
    }

    static int findFib2(int n, int[] dp){

        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        if(dp[n] != - 1){
            return dp[n];
        }

        return dp[n]= findFib2( n - 1, dp) + findFib2(n - 2, dp);
    }

    static int findFib3(int n){
        int a = 0;
        int b = 1;
        if(n == 0){
            return a;
        }

        if(n == 1){
            return b;
        }

        for(int i = 2; i <= n; i++){
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }
}
