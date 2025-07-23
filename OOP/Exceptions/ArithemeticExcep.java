package Exceptions;

public class ArithemeticExcep {
    public static void main(String[] args) {
        

        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException ae) {

            //User - end Statements
            System.out.println("Arithmetic Exceptiom");

            //Developer End statements
            System.out.println("---------");
            ae.printStackTrace();

            System.out.println("---------");
            System.out.println(ae.toString());

            System.out.println("---------");
            System.out.println(ae.getMessage());
        }
    }
}