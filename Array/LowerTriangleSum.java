public class LowerTriangleSum {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };

        int rows = mat.length;
        int cols = mat[0].length;

        int lowSum = 0;


        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){

                if(j <= cols){
                    lowSum += mat[i][j];
                }

            }
            cols--;
            
        }
        System.out.println(lowSum);
    }
}
