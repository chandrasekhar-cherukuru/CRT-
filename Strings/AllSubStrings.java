public class AllSubStrings {
    public static void main(String[] args) {
        String str = "abc";


        int start = 0;
        int end = str.length() - 1;
        findSubs(str, start, end);

    }

    static void findSubs(String str, int start, int end){

        if(start > end){
            return;
        }

        for(int i = start + 1; i <= end + 1; i++){
            System.out.println(str.substring(start, i));
        }

        findSubs(str, start + 1, end);

    }
}
