package CollectionProblems;

public class SecondLarge {
    public static void main(String[] args) {
        int[] arr = {-1, -2, 3, 4, 6, 8, -11};

       int secondMax = findSecMax(arr);
       System.out.println(secondMax);

       int secondMin = findSecMin(arr);
       System.out.println(secondMin);

    }

    static int findSecMax(int[] arr){
        int start = 0;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        while(start < arr.length){

            int currNum = arr[start];

            if(currNum > first){
                second = first;
                first = currNum;
            }else if(currNum > second && currNum < first){
                second = currNum;
            }

            start++;
        }

        return second;
    }

    static int findSecMin(int[] arr){
        int start = 0;
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        while(start < arr.length){

            int currNum = arr[start];

            if(currNum < first){
                second = first;
                first = currNum;
            }else if(currNum < second && currNum < first){
                second = currNum;
            }

            start++;
        }

        return second;
    }
}
