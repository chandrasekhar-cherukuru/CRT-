package Spiral;
import java.util.Scanner;
public class SpiralFromMiddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] mat = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        System.out.println("Spiral from middle");
        int total = n * m;
        int r = n / 2;
        int c = n/2;
        int layer = 1;


        int printed = 0;

        while(printed < total){
            
            for(int i = 1; i <= layer && printed < total; i++){

                if(c + i < m){
                    System.out.print(mat[r][c + i]+ " -> ");
                    printed++;
                }
            }
            c++;

            for(int i = 1; i <= layer && printed < total; i++){
                if(r + i < n){
                    System.out.println(mat[r + i][c]+ " -> ");
                    printed++;
                }
            }
            r++;

            for(int i = 1; i <= layer && printed < total; i++){

                if()
            }
        }

    }
}
