public class ReverseStr {
    public static void main(String[] args) {
        String str = "banana";
        // StringBuilder sb = new StringBuilder();
        // for(int i = str.length() - 1; i >= 0; i--){
        //     sb.append(str.charAt(i));

        // }
        // System.out.println(sb.toString());


        //without using stringbuilder

        char[] carr = str.toCharArray();
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--){

            rev = rev + carr[i];
        }

        System.out.println(rev);
    }
}
