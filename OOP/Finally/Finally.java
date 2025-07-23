package Finally;


//it is never recommended to maintain cleanup code in try block
//because if any exception comes then try block wont work


//final - class, method, varibales
//finally - try catch
//finalize - garbage collector

public class Finally {
    public static void main(String[] args) {
        String str = null;
        int[] arr = {1, 2, 3};
        Object obj = "123";

        try {
            
            System.out.println(10/0);

        } catch (ArithmeticException e) {

            e.printStackTrace();

        }finally{
            System.out.println("Arithmatic operation completed");
        }

        try {
            
            System.out.println(str.length());

        } catch (NullPointerException e) {

            e.printStackTrace();

        }finally{
            System.out.println("Null pointer exception is completed");
        }

        try {
            int i = (int) obj;

        } catch (ClassCastException e) {

            e.printStackTrace();

        }finally{
            System.out.println("Class Cast Exception is completed");
        }

    }
}
