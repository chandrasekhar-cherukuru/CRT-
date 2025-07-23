

public class StringObjectApproach {
    public static void main(String[] args) {
        String s1 = new String("Car");
        String s2 = new String("Car");

        int s1hash = s1.hashCode();
        int s2hash = s2.hashCode();

        //hashcode is same cause content of the string is same
        System.out.println(s1.hashCode()); //hashcode in integers
        System.out.println(s2.hashCode());

        //hash code is same when the content is same
        System.out.println(Integer.toHexString(s1hash)); //hash code in hexa
        System.out.println(Integer.toHexString(s2hash));

        //.equals() returns true cause it checks content
        System.out.println(s1.equals(s2));

        // == operator returns false cause it checks for address
        System.out.println(s1 == s2); 



        //methods


        String str = "banana";
        System.out.println(str.indexOf('a'));

        int index = str.indexOf('a');
        while(index != - 1){
            System.out.println(index);
            index =  str.indexOf('a', index + 1);
        }

        String str2 = "cat";
        str.concat(str2);
        System.out.println(str);
        System.out.println(str.concat(str2));

        str.split("a");
        String[] strArr = str.split("a");
        for(String strs : strArr){
            System.out.print(strs+ " ");
        }

    }
}
