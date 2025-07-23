public class Kpattern {
    public static void main(String[] args) {
        int n = 5;
        
        for(int i = 5; i > 0; i--){
            for(int j = 1; j <= i; j++){
                if(i == n || j == 1 || j == i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            
            System.out.println();
        }

        for(int i = 2; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                if(i == n || j == 1 || j == i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        
    }
}
