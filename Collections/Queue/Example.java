

// 1. First-In-First-Out (FIFO) Order
// The first element added is the first one removed.
// Real-world analogy: People standing in a line (queue) at a counter.
// Examples:
// Task scheduling
// Print queues
// Message queues
// Customer service systems

//queue is best for BFS

import java.util.*;

public class Example {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();
        System.out.println(queue);
        System.out.println(queue.size());
        for(int i = 1; i <= 5; i++){
            queue.add(i);//Throws an exception if the element 
            //can't be added (e.g., if the queue is full in bounded queues).
        }
        System.out.println(queue);
        queue.clear();
        System.out.println(queue.isEmpty());

//         🔹 offer(E e)
// Does NOT throw an exception.
// Instead, it returns false if the element can't be added.
// Safer for use in bounded or capacity-restricted queues (like ArrayBlockingQueue).
        queue.offer(10);
        queue.offer(20);


    }
}
