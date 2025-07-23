public class Pyramid3 {
    public static void main(String[] args) {
        int n = 5;
        int leftStar = 1;
        int righstStar = 2 * n - 1;
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= 2 * n - 1; j++){
                
                if(j >= leftStar && j <= righstStar){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            leftStar++;
            righstStar--;
            System.out.println();
        }
    }
}
