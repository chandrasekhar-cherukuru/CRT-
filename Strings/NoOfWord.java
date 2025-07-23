

public class NoOfWord {
    public static void main(String[] args) {
        String str = "This is java class";

        // int start = 0;
        // int count = 1;
        // while(start < str.length()){

        //     char ch = str.charAt(start);
        //     if(ch == ' '){
        //         count++;
        //     }

        //     start++;
        // }
        // System.out.println(count);

        //using split method

        String[] ss = str.split(" ");

        System.out.println(ss.length);

        String rev = "";

        //reverse every word in string
        for(int i = 0; i < ss.length; i++){

            String s = ss[i];
            int end = s.length() - 1;
            StringBuilder sb = new StringBuilder();
            while(end >= 0){
                sb.append(s.charAt(end));
                end--;
            }

            rev = rev + sb.toString() + " ";
        }
        System.out.println(rev);
        
    }


}
