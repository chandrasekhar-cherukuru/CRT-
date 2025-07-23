// import java.util.Scanner;
// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter no of elemenets: ");
//         int n = sc.nextInt();
//         sc.nextLine();
//         int[] arr = new int[n];
//         System.out.println("Enter the elements separated by space");
//         for(int i = 0; i < arr.length; i++){
//             arr[i] = sc.nextInt();
//         }

//         for(int num : arr){
//             System.out.print(num+ " ");
//         }
//     }
// }


// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter no of elemenets: ");
//         int n = sc.nextInt();
//         sc.nextLine();
//         int[] arr = new int[n];
//         System.out.println("Enter the elements separated by space");
//         for(int i = 0; i < arr.length; i++){
//             arr[i] = sc.nextInt();
//         }
//         int sum = 0;

//         for(int num : arr){
//             sum = sum + num;
//         }
//         System.out.println("Sum is: " +sum);
//     }
// }


//reverse array

// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter no of elemenets: ");
//         int n = sc.nextInt();
//         sc.nextLine();
//         int[] arr = new int[n];
//         System.out.println("Enter the elements separated by space");
//         for(int i = 0; i < arr.length; i++){
//             arr[i] = sc.nextInt();
//         }

//         for(int i = arr.length - 1; i > 0; i--){
//             System.out.print(arr[i]+ " ");
//         }
//     }
// }


//even and odd

// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter no of elemenets: ");
//         int n = sc.nextInt();
//         sc.nextLine();
//         int[] arr = new int[n];
//         System.out.println("Enter the elements separated by space");
//         for(int i = 0; i < arr.length; i++){
//             arr[i] = sc.nextInt();
//         }
        
//         int evCount = 0;
//         int odCount = 0;
//         for(int i = 0; i < arr.length; i++){

//             if(arr[i] % 2 == 0){
//                 evCount++;
//             }else{
//                 odCount++;
//             }
//         }

//         System.out.println("Even Count " +evCount);
//         System.out.println("Odd Count " +odCount);
        
//     }
// }

// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter no of elemenets: ");
//         int n = sc.nextInt();
//         sc.nextLine();
//         int[] arr = new int[n];
//         System.out.println("Enter the elements separated by space");
//         for(int i = 0; i < arr.length; i++){
//             arr[i] = sc.nextInt();
//         }
        
//        Arrays.sort(arr);

        
        
//     }
// }


//printing duplicates


// public class Array {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5, 6, 2, 3};
//         for(int i = 0; i < arr.length; i++){
//             for(int j = i + 1; j < arr.length; j++){

//                 if(arr[i] == arr[j]){
//                     System.out.println(arr[i]);
//                 }
//             }
//         }   
//     }
// }


//unique elements;


// public class Array {
//     public static void main(String[] args) {
//         int[] arr = {4, 5, 6, 2, 5, 6, 7, 9, 1};
        
//         for(int i = 0; i < arr.length; i++){
//             int count = 0;
//             for(int j = 0; j < arr.length; j++){

//                 if(arr[i] == arr[j]){
//                     count++;
//                 }
//             }

//             if(count == 1){
//                 System.out.println(arr[i]);
//             }
//         }
//     }
// }


//most repeating number


// import java.util.*;
// public class Array {
//     public static void main(String[] args) {
//         int[] arr = {4, 5, 6, 2, 5, 6, 7, 9, 1};
        
//         Map<Integer, Integer> map = new HashMap<>();
//         for(int num : arr){
//             if(!map.containsKey(num)){
//                 map.put(num, 1);
//             }else{
//                 map.put(num, map.get(num) + 1);
//             }
//         }

//         int maxCount = 0;
//         int ans = -1;
//         for(Map.Entry<Integer, Integer> map2 : map.entrySet()){

//             int key = map2.getKey();
//             int value = map2.getValue();
//             if(value > maxCount){

//                 maxCount = value;
//                 ans = key;

//             }
//         }

//         System.out.println(ans);
//     }
// }


//leader elements from an given array


// import java.util.*;
// public class Array {
//     public static void main(String[] args) {
//         int[] arr = { 16, 17, 4, 3, 5, 2 };
//         List<Integer> list = new ArrayList<>();

//         int n = arr.length;
//         int maxRight = arr[n - 1];
//         list.add(maxRight);
//         for(int i = n - 2; i > 0; i--){

//             if(arr[i] > maxRight){
//                 maxRight = arr[i];
//                 list.add(0, maxRight);
//             }
//         }

//         for(int i = 0; i < list.size(); i++){
//             int ele = list.get(i);
//             System.out.print(ele+ " ");
//         }
//     }
// }


//frequemcy of given array

// import java.util.*;
// public class Array {
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
//         Map<Integer, Integer> map = new HashMap<>();
//         for(int num : arr){
//             if(!map.containsKey(num)){
//                 map.put(num, 1);
//             }else{
//                 map.put(num, map.get(num) + 1);
//             }
//         }

//         //we need to print array frequenceis now
//         for(int num : arr){
//             if(map.containsKey(num)){
//                 System.out.println(num+ " " +map.get(num));
//                 map.remove(num);
//             }
            
//         }
       
//     }
// }


//first duplicate in a array and last duplicate in a array

public class Array{
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 3, 5, 7, 6, 8};

        //first duplicate
        int num = arr[0];
        for(int i = 1; i < arr.length; i++){
            if((num ^ arr[i]) == num){
                System.out.println(arr[i]);
            }else{
                num = arr[i];
            }
        }
    }
}


//find out nth index of a duplicate element
//delete array element from given index
//first occurence of given element