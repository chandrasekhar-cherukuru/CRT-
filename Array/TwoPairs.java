
import java.util.HashMap;
import java.util.Map;

public class TwoPairs {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 1, 2, 9, 8};

        Map<Integer, int[]> map = new HashMap<>();



        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){

                int sum = arr[i] + arr[j];

                if(!map.containsKey(sum)){

                    map.put(sum, new int[]{i, j});

                }else {

                    int[] pairs = map.get(sum);
                    int num1 = pairs[0];
                    int num2 = pairs[1];

                    if(num1 != i && num2 != i && num2 != j && num2 != i){
                        System.out.println("True");
                        return;
                    }
                }
            }
        }

        System.out.println("False");
    }
}
