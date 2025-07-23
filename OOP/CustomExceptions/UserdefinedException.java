package CustomExceptions;



// which are created by the user based on the application requirement
// are called user defined exceptions or custom exceptions

//program to define userdefined exception for Token Validation





class CustomException extends Exception{

    public CustomException(String message){

        super(message);
        
    }
}


public class UserdefinedException {
    public static void main(String[] args) throws CustomException{
        int token = 90; //we need to send for token validation (custome exception)

        tokenValidation(token);
    }

    static void tokenValidation(int token) throws CustomException{ //

        if(token <= 0){
            
            //creating an Exception (here Exception is class) 
            //so we need to define it outside the class

            throw new CustomException(token+ "is Invalid");

        }else{
            System.out.println(token+ "Token is Valid");
        }
    }
}


//program for voter validatrion using custom exceptions
