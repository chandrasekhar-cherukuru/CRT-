public class SumOfRowsnCols {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2},
            {3, 4},
        };


        for(int i = 0; i < mat.length; i++){

            int rowSum = 0;
            for(int j = 0; j < mat[0].length; j++){
                rowSum += mat[i][j];

            }
            System.out.println("Sum of row " +i+ "is " +rowSum);
        }

        for(int j = 0; j < mat[0].length; j++){
            int colSum = 0;
            for(int i = 0; i < mat.length; i++){

                colSum += mat[j][i];
                
            }

            System.out.println("Sum of col " +j+ "is " +colSum);
        }
        
    }
}
