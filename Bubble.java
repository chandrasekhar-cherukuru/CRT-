public class Bubble {
    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 3, 2, 1};
        bubbleSort(arr);
        for(int num : arr){
            System.out.print(num+ " ");
        }
    }

    static void bubbleSort(int[] arr ){

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - i - 1; j++){

                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
