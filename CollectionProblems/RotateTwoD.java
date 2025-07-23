package CollectionProblems;

public class RotateTwoD {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i = 0; i < rows; i++){
            for(int j = i + 1; j < cols; j++){

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }

        for(int i = 0; i < rows; i++){

            int currRow = matrix[i].length - 1;
            for(int j = 0; j < cols / 2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][currRow];
                matrix[i][currRow ] = temp;
                currRow--;
            }

        }

        //after transpose
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
