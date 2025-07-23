package Collections.LinkedList;

import java.util.LinkedList;

//insertion
//-> insertion at beginning
//-> insertion at end
public class Example {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        System.out.println(ll);
        
        ll.addFirst(100);
        ll.addFirst(300);
        ll.addFirst(300);
        ll.addLast(400);

        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        
        System.out.println(ll.size());

        // LinkedList head = ll.get(0);

    }
}
