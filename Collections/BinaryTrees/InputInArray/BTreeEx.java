package Collections.BinaryTrees.InputInArray;

import java.util.*;

//so if the input is in the formar of arrat we need to use queue because

//to learn this clearly come from queues

//methods of queue are 
// -> offer
// -> poll

// ✅ Diagram of a Queue
// Front → [10] [20] [30] [40] [50] ← Rear
// Front: the element at the beginning (first to come out)
// Rear: the element at the end (last inserted)
// When you add (offer()) → goes to rear
// When you remove (poll()) → comes from front

// 🔷 Queue Concept (FIFO)
// A Queue is a linear data structure that follows the FIFO principle – First In, First Out.

// ✅ Why Queue?
// A queue is perfect for this because:

// It follows FIFO (First-In-First-Out)
// We can process nodes level by level
// For each node we dequeue:
// Assign the next array value as left child
// Then assign the next as right child
// Enqueue the newly created left/right children for further processing

//to make it happen we make another method

class Node{
    int data;
    Node left, right;


    Node(int value){
        this.data = value;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree{
    Node root;

    void inOrderTraversal(Node node){

        if(node == null){
            return;
        }

        if(node != null){
            inOrderTraversal(node.left);
            System.out.println(node.data);
            inOrderTraversal(node.right);
        }
    }

    void printinOrderTraversal(){

        inOrderTraversal(root);

    }

//     🔴 Problem with int[]
// If you try this:

// int[] arr = {1, 2, 3, 4, 5, null, null}; // ❌ ERROR
// This won’t compile — because:

// int is a primitive type and cannot hold null
// You must use a value, like 0 or -1 or something else
// But that creates ambiguity: is 0 a real node value or a "no node"?


    Node insertLevelOrder(Integer[] arr){

        //we need queue and Node here

        if (arr.length == 0 || arr[0] == null) return null;
        
        Node root = new Node(arr[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int start = 1;
        while(start < arr.length){

            Node current = queue.poll();

            //checking left
            if(start < arr.length && arr[start] != null){

                current.left = new Node(arr[start]);

                queue.offer(current.left);

            }

            start++;

            //checking right
            if(start < arr.length && arr[start] != null){
                current.right = new Node(arr[start]);
                queue.offer(current.right);
            }
            start++;
        }

        return root;
    }
}
public class BTreeEx {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // tree.root = new Node(1);
        // tree.root.left = new Node(2);
        // tree.root.right = new Node(3);
        // tree.root.left.left = new Node(4);
        // tree.root.left.right = new Node(5);

        // tree.printinOrderTraversal();

        Integer[] arr = {1, 2, 3, 4, 5, null, null};
        tree.root = tree.insertLevelOrder(arr);
        tree.printinOrderTraversal();



    }
}
