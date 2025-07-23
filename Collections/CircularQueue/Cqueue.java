// package Collections.CircularQueue;





public class Cqueue {
    public int[] queue;
    public int size, front, rear, capacity;

//     🚩 Key differences:

// ✅ front:

// Points to where you remove.
// Only changes during dequeue.
// ✅ rear:

// Points to where you add.
// Changes during enqueue.
// ✅ They work together to:

// Track which elements are in the queue.
// Ensure FIFO order while supporting circular wrap-around.

    public Cqueue(int capacity){
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    boolean isFull(){
        return size == capacity;
    }

    boolean isEmpty(){
        return front == -1;
    }

    //adding val
    void enqueue(int val){
        if (isFull()){
            System.out.println("Queue is full");
            return;
        }
        
        if(front == -1){ //queue is empty
            
            //hence the queue is empty we are adding a new element so the front becomes 0
            front = 0;
            
        }

        rear = (rear + 1) % capacity;
        queue[rear] = val;
        size++;

    }

    void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }

        if(front == rear){
            front = -1;
            rear = -1;
        }else{

            //the element that needs to be removed in the index of
            front = (front + 1) % capacity;
        }

        size--;

    }

    void display(){

        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }

        for(int i = 0; i < size; i++){

            //since we need to print in the order of fifo\
            System.out.println(queue[(front + i) % capacity]);

        }
        System.out.println();
    }


    public static void main(String[] args){

        Cqueue cq = new Cqueue(5);
        cq.enqueue(10);
        cq.display();
        
    }
}
