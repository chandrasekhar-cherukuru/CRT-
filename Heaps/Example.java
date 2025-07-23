
import java.util.PriorityQueue;


//Max - heap - Each parent node is greater than or equal to its children
//Min - heap - Each parent node is smalled than or equal to its children
// Real life application
// Job scheduling
//dijkstar

class Example{
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        

        pq.add(100);
        pq.add(19);
        pq.add(4);
        pq.add(200);
        System.out.println(pq);

        System.out.println(pq.peek());
        System.out.println(pq.poll());

        System.out.println(pq);


    }
}