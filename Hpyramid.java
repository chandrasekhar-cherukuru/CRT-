// class Hpyramid {
//     public static void main(String[] args) {
//         int n = 4;
//         int leftStar = n;
//         int righstStar = n; 
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= 2 * n - 1; j++){

//                 if(j == leftStar || j == righstStar || i == n){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//             }
//             leftStar--;
//             righstStar++;
//             System.out.println();
//         }
//     }
// }



class Hpyramid {
    public static void main(String[] args) {
        int n = 4;
       
        for(int i = 1; i <= n; i++){

            //spaces
            for(int j = 1; j <= n - i; j++){
                System.out.print("  ");  
            }
            //leftAngles
            for(int j = 1; j <= i; j++){
                if(j == (n - i) + 1 || i == n){
                    System.out.print("* ");
                }
            }

            //rightAngled
            for(int j = 2; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

