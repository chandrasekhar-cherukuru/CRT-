public class Wordcapital {
    public static void main(String[] args) {
        String s = "this is java program hi";

        // StringBuilder sb = new StringBuilder();
        // int start = 0;
        // while(start < s.length()){

        //     char ch = s.charAt(start);
            
        //     if(start == 0){

        //         char curch = Character.toUpperCase(ch);
        //         sb.append(curch);
        //         start++;
        //         continue;

        //     }else if(start > 0 && s.charAt(start - 1) == ' '){

        //         char curch = Character.toUpperCase(ch);
        //         sb.append(curch);
        //         start++;
        //         continue;
        //     }

        //     sb.append(ch);

        //     start++;
            
        // }

        // System.out.println(sb.toString());


        //using split method

        StringBuilder sb = new StringBuilder();

        String[] ss = s.split(" ");
        for(String srs : ss){
            
            sb.append(Character.toUpperCase(srs.charAt(0)) + srs.substring(1) + " ");
            
        }

        // if(sb.length() > 0){
        //     sb.deleteCharAt(sb.length() - 1);
        // }

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
        
    }
}
