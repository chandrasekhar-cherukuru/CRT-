
//     public NewException(String message){
//         super(message);
//     }
// }
// public class VoterEligibility {
//     public static void main(String[] args) {
        
//         int age = 16;

//         try {
//             checkEligibility(age);
//         }catch (NewException e){
//             System.out.println("Exception: " + e.getMessage());
//         }

        
//     }

//     static void checkEligibility(int age) throws NewException{

//         if(age < 18){
//             throw new NewException("Age " + age + "is invalid");
//         }else{
//             System.out.println("Age" +age+ "is valid");
//         }
//     }
// }

class CustomException extends Exception{

    public CustomException(String message){
        super(message);

    }
}
class VoterEligibility {
    public static void main(String[] args) {
        int age = 16;

        try {

            checkEligibility(age);

        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkEligibility(int age) throws CustomException{

        if(age < 16){
            throw new CustomException("Age is invalid");
        }else{
            System.out.println("Age is valid ");
        }
    }
}