
//to display 2d  array elements in matrix form
public class ArraytoMat {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[][] mat = new int[2][2];
        int start = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){

                if(start < arr.length){
                    mat[i][j] = arr[start];
                    start++;
                }
            }
        }

        for(int[] arr1 : mat){
            for(int arrEle : arr1){

                System.out.print(arrEle+ " ");
            }
            System.out.println();
        }
    }
}
