public class ThreeDArray {
    public static void main(String[] args) {
        int[][][] threeD = new int[3][3][3];

        int start = 1;
        for(int i = 0; i < threeD.length; i++){
            for(int j = 0; j < threeD[0].length; j++){
                for(int k = 0; k < threeD[i][j].length; k++){
                    threeD[i][j][k] = start;
                    start++;
                }
            }
        }


        for(int i = 0; i < threeD.length; i++){

            System.out.println("Layer " +i+ " is");
            for(int j = 0; j < threeD[0].length; j++){
                for(int k = 0; k < threeD[i][j].length; k++){
                    System.out.print(threeD[i][j][k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
