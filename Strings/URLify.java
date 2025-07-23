public class URLify {
    public static void main(String[] args) {
        char[] str = { 'M','r',' ','J','o','h','n',' ','S','m','i','t','h',' ',' ',' ',' '};

        urLify(str);
        for(char ch : str){
            System.out.print(ch+ " ");
        }
    }

    static void urLify(char[] str){

        int totalSpaces = 0;
        int trueLength = 0;
        int start = 1;
        while(start < str.length){

            if(str[start - 1] == ' ' && str[start] != ' '){
                totalSpaces++;
            }

            if(str[start - 1] == ' ' && str[start] == ' '){
                trueLength = start - 2;
                break;
            }

            start++;

        }

        int totalLength = trueLength + (2 * totalSpaces);

        if(str.length < trueLength) return;

        int last = str.length - 1;

        for(int i = trueLength - 1; i >= 0; i--){

            char ch = str[i];

            if(ch == ' '){
                str[last] = '0';
                str[last - 1] = '2';
                str[last - 2] = '%';
                last = last - 3;
            }else{
                str[last] = ch;
                last--;
            }
        }

    }
}
