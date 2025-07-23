

public class TransposeMat {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };

        int rows = mat.length;
        int cols = mat[0].length;
        int[][] finalMat = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = i + 1; j < cols; j++){

                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[i][j] = temp;

            }
        }

         for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){

                System.out.print(mat[i][j]+ "");
            }
            System.out.println();
        }
        


    }
}
