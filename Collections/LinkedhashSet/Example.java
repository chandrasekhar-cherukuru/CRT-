package Collections.LinkedhashSet;

import java.util.LinkedHashSet;


//insertion order is preserved
//introduced in 1.4v
//hashtable and linkedlist


public class Example {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        System.out.println("is Empty?: " +lhs.isEmpty());
        System.out.println("Size: " +lhs.size());
        lhs.add("BMW");
        lhs.add("Tata");
        lhs.add("Tata");
        lhs.add("Maruti");
        System.out.println(lhs);
    }
}
