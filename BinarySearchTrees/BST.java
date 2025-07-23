package BinarySearchTrees;

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


public class BST {

    static int count = 0;
    static Integer res = null; 

    static int kthSmallest(TreeNode root, int k){

        if(root == null){
            return -1;
        }

        kthSmallest(root.left, k);
        count++;
        if(count == k){
            res = root.val;
        }
        kthSmallest(root.right, k);

        return res;
        
    }

    static void inOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.val+ " ");
        inOrderTraversal(root.right);
    }

    static TreeNode deleteNode(TreeNode root, int node){

        if(root == null){
            return null;
        }

        if(root.val < node){
            deleteNode(root.right, node);
        }else if(root.val > node){
            deleteNode(root.left, node);
        }else{

            //node is found
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }else if(root.left == null && root.right == null){
                return null;
            }else{

                //node has two childrens
                TreeNode nextNode = findMin(root.right);
                root.val = nextNode.val;
                root.right = deleteNode(root.right, node);

            }
        }

        return root;

    }

    static TreeNode findMin(TreeNode root){

            while(root.left != null){

                root = root.left;

            }

            return root;

    }

    static TreeNode search(TreeNode root, int node){

        if(root == null){
            return null;
        }

        if(root.val == node){
            return root;
        }

        if(node < root.val){
            return search(root.left, node);
        }else{
            return search(root.right, node);
        }

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes");
        int n = sc.nextInt();
        System.out.println("Enter " +n+ " nodes");

        TreeNode root = null;

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            root = insertBST(root, num);
        }
        inOrderTraversal(root);

        System.out.println("Enter node to search: ");
        int nod = sc.nextInt();
        TreeNode node = search(root, nod);
        

    }

    static TreeNode insertBST(TreeNode root, int num){

        if(root == null){
            return new TreeNode(num);
        }

        if(num < root.val){

            root.left = insertBST(root.left, num);

        }else if(num > root.val){

            root.right = insertBST(root.right, num);


        }

        return root;
    }
}
