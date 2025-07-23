package CustomExceptions;


class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}
public class Custiom2 {
    public static void main(String[] args) {
        
        int age = 9;
        try {
            checkEligibility(age);

        } catch (CustomException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    static void checkEligibility(int age) throws CustomException{

        if(age < 18){
            throw new CustomException("User not eligible");
        }else{
            System.out.println("User is eligible");
        }
    }
}
