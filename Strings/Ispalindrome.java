public class Ispalindrome {
    public static void main(String[] args) {
        String s = "malayalama";

        int start = 0, flag = 1;
        int end = s.length() - 1;

        while(start < end){

            if(s.charAt(start) != s.charAt(end)){
                System.out.println("Not a palindrome");
                                return;
            }else{
                start++;
                end--;
            }
        }

            System.out.println("It is a palindrome");
        
    }
}
