package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode{
    int val;
    TreeNode left, right;

    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
class BinaryTree {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes");
        int n = sc.nextInt();

        System.out.println("Enter " +n+ " nodes");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        TreeNode root = insert(arr);
        System.out.println("In order traversal");
        inOrderTraversal(root);

    }

    static TreeNode insert(int[] arr){

        int start = 0;
        TreeNode root = new TreeNode(arr[start]);
        start = start + 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty() && start < arr.length){

            TreeNode current = q.poll();
            if(start < arr.length && current != null){
                current.left = new TreeNode(arr[start]);
                q.offer(current.left);
            }

            start++;

            if(!q.isEmpty() && start < arr.length){
                current.right = new TreeNode(arr[start]);
                q.offer(current.right);
            }

            start++;
        }

        return root;
    }

    static void inOrderTraversal(TreeNode root){

        if(root == null){
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);

    }
}