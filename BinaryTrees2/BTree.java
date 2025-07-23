package Exam2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class TreeNode{
    int val;
    TreeNode left, right;

    TreeNode(int val){
        this.val = val;
        this.right = null;
        this.left =null;
    }
}
public class BTree {

    static TreeNode invertBtree(TreeNode root){


        if(root == null){
            return null;
        }

        TreeNode leftNode = invertBtree(root.right);
        TreeNode rightNode = invertBtree(root.left);

        root.left = rightNode;
        root.right = leftNode;
        
        return root;

    }

    static Integer prev = null;
    static int minDiff = Integer.MAX_VALUE;

    static void getMinDiff(TreeNode root){

        //we start finding difference fromm the leaf nodes

        if(root == null){
            return;
        }


        getMinDiff(root.left);

        if(prev != null){
            minDiff = Math.min(minDiff, Math.abs(prev - root.val));
        }

        prev = root.val;
        getMinDiff(root.right);

    }
    

    static int minDepth(TreeNode root){

        if(root == null){
            return 0;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if(root.left == null || root.right == null){
            return 1 + Math.max(left, right);
        }

        return 1 + Math.min(left, right);
    }

    static int maxDepth(TreeNode root){

        if(root == null){
            return 0;
        }

        int maxLeft = maxDepth(root.left);
        int maxRight = maxDepth(root.right);

        return 1 + Math.max(maxLeft, maxRight);
    }
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
        System.out.println("Normal Inserting: ");
        inOrderTraversal(root);
        System.out.println();
        insertLevel(arr, 0, arr.length - 1);
        System.out.println("Level inserting: ");
        inOrderTraversal(root);
        int res = 1 +  maxDepth(root);
        System.out.println();
        System.out.println("Maximum Depth: " +res);
        int mindepth = minDepth(root);
        System.out.println("Minimum depth: " +mindepth);
        TreeNode invRoot = invertBtree(root);
        System.out.println("Invert Binary Tree: ");
        inOrderTraversal(invRoot);
        System.out.println();
        System.out.println("Minimum difference: " +minDiff);


    }

    static void inOrderTraversal(TreeNode root){

        if(root == null){
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.val+ " ");
        inOrderTraversal(root.right);

    }

    static TreeNode insertLevel(int[] arr, int start, int end){

        if(start > end){
            return null;
        }

        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(mid);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
       root.left = insertLevel(arr, start, mid - 1);
       root.right = insertLevel(arr, mid + 1, end);
       return root;
    }



    static TreeNode insert(int[] arr){

        int start = 0;

        TreeNode root = new TreeNode(arr[start]);
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        start = start + 1;
        while(!q.isEmpty() && start < arr.length){

            TreeNode current = q.poll();
            if(start < arr.length && arr[start] != -1){
                current.left = new TreeNode(arr[start]);
                q.offer(current.left);
            }
            start++;

            if(start < arr.length && arr[start] != -1){
                current.right = new TreeNode(arr[start]);
                q.offer(current.right);
            }
            start++;

        }


        return root;
    }
}
