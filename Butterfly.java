public class Butterfly {
    public static void main(String[] args) {
        int n = 3;
        int start = 1;
        int end = 2 * n; //change end to -1 to get diferent butterfly

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j > start && j < end) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            start++;
            end--;
            System.out.println();
        }

        start = start - 1;
        end = end + 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2 * n; j++){

                if(j >= start && j <= end){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }

            start--;
            end++;
            System.out.println();
        }
    }
}
