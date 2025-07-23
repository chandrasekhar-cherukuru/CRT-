package TryCatch;

public class Trycatch {
    public static void main(String[] args) {
        

        // try{
            
        // }catch(Exception e) {

        //     System.out.println("Hi bitch");
        // }


        //Array Index Out of Bound

        // int[] arr = {1, 2, 3, 4, 5};

        // try {

        //     System.out.println("Index of 3: " +arr[3]);
        //     System.out.println("Index of 5: " +arr[5]);
            
        // } catch (ArrayIndexOutOfBoundsException e) {

        //     e.printStackTrace();
        // }

        //String Index Out of Bound

        //class cast exception
        // -> exception rises due to casting the data from different datatype

        // Object obj = "123";

        // try {
        //     int i = (int) obj;

        // } catch (ClassCastException e) {

        //     e.printStackTrace();

        // }

        //illegal argument exception
        //providung illegal or out of range values as input
        //we cannot implement this using try catch because we cannot get exception due to else block for false condition
        //always in try block
        //so we implement this explicitly, means that creating object instance for exception
        //so we use throw

        int age = -12;

        // try {
            
        //     if(age >= 0){
        //         System.out.println("Valid age");
        //     }else{
        //         System.out.println("Invalid Age");
        //     }
        // } catch (IllegalArgumentException e) {//never goes to catch

        //     e.printStackTrace();
        // }

        //using throw

        //explicityly saying to JVM
        if(age <= 0){
            throw new IllegalArgumentException("Invalid Age");
        }else{
            System.out.println("Valid Age");
        }



        
    }
}
