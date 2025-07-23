public class AllCombinations {
    public static void main(String[] args) {
        String str = "abc";

        int start = 0;
        String str2 = " ";
        findAll(str, start, str2);

    } 
    static void findAll(String str, int start, String curr){

        if(start == str.length()){

            if(curr.length() != 0){
                System.out.println(curr);
            }

            return;
        }

        findAll(str, start + 1, curr + str.charAt(start));

        findAll(str, start + 1, curr);
    }  
}
