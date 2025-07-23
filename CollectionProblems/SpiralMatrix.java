package CollectionProblems;

public class SpiralMatrix {
    public static void main(String[] args) {
        

        //spiral matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rowStart = 0;
        int colStart = 0;
        int rowEnd= matrix.length;
        int colEnd = matrix[0].length;

        while(rowStart < rowEnd && colStart < colEnd){

            for(int i = rowStart; i < colEnd; i++){
                System.out.print(matrix[rowStart][i]+ "->");
            }
            rowStart++;
            
            for(int j = rowStart; j < rowEnd; j++){
                System.out.print(matrix[j][colEnd - 1]+ " ");
            }
            colEnd--;

            for(int k = colEnd; k > rowStart; k--){
                System.out.print(matrix[rowEnd][k]+ " ");
            }

            rowEnd--;

            for(int l = rowEnd; l > rowStart; l--){
                System.out.print(matrix[l][rowStart]);
            }
            colStart++;
        }
    }
}
