package Throws;


//if any checked exception raised in our program 
//we must handle it by using try and catch block or by using throws statement

//this statement is impleted "along with method definition"


public class Throws {
    public static void main(String[] args) throws ArithmeticException {

        System.out.println(10/0);
        //used throws alomg with method works same as try and catch bloclk


        // try {
        //     System.out.println(10/0);
        // } catch (ArithmeticException ae) {
        //     ae.printStackTrace();
        // }

    }
}
