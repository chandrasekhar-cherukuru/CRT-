package Throw;


//exception is throw by JVM in throw method
//we use throw method inside main


//single exception -> throw
//multiple exceptions -> throws

public class Throw {
    public static void main(String[] args) {

        System.out.println(10/0);
        //here the exception object is created and handover to JVM by main method
        
       throw new ArithmeticException("Cannot divide with zero......");
       //here exception object is created and handover to JVM by using throw (manually) statement
       
    }    
}
