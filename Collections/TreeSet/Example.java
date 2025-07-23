package Collections.TreeSet;

import java.util.TreeSet;

public class Example {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();

        for(int i = 1; i <= 10; i++){
            tree.add(i);
        }

        System.out.println(tree);
        System.out.println(tree.higher(5));
        System.out.println(tree.lower(5));
    }
}
