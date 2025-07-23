

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class NewLinkedList{
    Node head;

    public void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertEnd(int data){
        Node newNode = new Node(data);
        //is list is empty
        if(head == null){
            head = newNode;
            return;
        }

        //if list is not empty
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        

    }

    public void insertPos(int data, int pos){

        Node newNode = new Node(data);

        //if list is null or pos -1;
        if(head == null){
            insertFirst(data);
        }

        int count = 0;
        Node temp = head;
        while(count < pos - 1 && temp.next != null){
            temp = temp.next;
            count++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }
    
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data +"->");
            current = current.next;
        }

        if(current == null){
            System.out.print("Null");
        }
    }
    public static void main(String[] args) {
       NewLinkedList list = new NewLinkedList();
       list.insertFirst(10);
       list.insertFirst(20);
       list.insertFirst(30);
       list.insertFirst(40);
       list.insertFirst(50);
       list.insertEnd(5);

       list.insertPos(70, 2);
       list.display();
        
    }
}