package Collections.ArrayList;

//ArrayList
import java.util.ArrayList;
public class ArrList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        System.out.println("Size : " +list.size());
        list.add(10);
        list.add("hi");
        list.add(true);
        list.add('a');

        //we can add here different types of varibales cause there is not generics like 
        //<Integer> / <Character> etc

        System.out.println(list); //output : [10, hi, true, a]

        if(list.contains(10)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        //add method

        //if we add with index it the size will be plus one and element(object) is added in the midlle
        list.add(2, "hello");

        System.out.println(list); //output: [10, hi, hello, true, a]

        //cloning the list
        //using - addAll()
        ArrayList list2 = new ArrayList();
        list2.add("hey");
        list2.add("everyone");

        list2.addAll(list);
        System.out.println(list2); //output : [hey, everyone, 10, hi, hello, true, a]
        list2.removeAll(list);
        System.out.println(list2);
        list2.addAll(1, list);
        System.out.println(list2);
        if(list2.containsAll(list)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
