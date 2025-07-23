class Pattern1{
    public static void main(String[] args){
        int n = 7;
        int end = n;
        int start = 1;
        for(int i = n; i > 0; i--){
            for(int j = 1; j <= 2 * n - 1; j++){

               if(j >= n && j <= end && start <= n){
                System.out.print(start+ " ");
                start++;
               }else if(j < i){
                System.out.print(" ");
               }
            }
            end++;
            start = 1;
            System.out.println();
        }

        end = end - 1;
        start = 1;
        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= 2 * n -1; j++){

               if(j >= i && j <= end && start <= (n - i) + 1){
                System.out.print(start+ " ");
                start++;
               }else if(j < i){
                System.out.print(" ");
               }
            }
            end--;
            start = 1;
            System.out.println();
        }
    }
}