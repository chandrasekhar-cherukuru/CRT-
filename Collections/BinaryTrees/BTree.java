package Collections.BinaryTrees;


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
}
public class BTree {
    public static void main(String[] args) {
         BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.printinOrderTraversal();


    }
}
