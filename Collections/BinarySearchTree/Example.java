// package Collections.BinarySearchTree;

//the tree looks like this
// 1
//  \
//   2
//    \
//     3
//      \
//       4
//        \
//         5
//          \
//           6


// ⚠️ Note:
// This tree is not balanced. If you care about performance (like keeping height ≈ log(n)), you'd want to use a self-balancing BST like:
// AVL Tree
// Red-Black Tree

class TreeNode{
    int val;
    TreeNode left, right;

    TreeNode(int val){
        this.val = val;
        left = null;
        right = null;
    }
}
public class Example {
    public static void main(String[] args) {
        int[] arr = {10, 12, -1, 3, 9, 14, 19, 23, -100};

        TreeNode root = new TreeNode(arr[0]);

        for(int i = 1; i < arr.length; i++){
            int value = arr[i];
            insertBST(root, value);
        }

        inOrdertraverse(root);

    }

    static void insertBST(TreeNode root, int value){

        if(value < root.val){
            if(root.left == null){

                TreeNode node = new TreeNode(value);
                root.left = node;
            }else{
                insertBST(root.left, value);
            }
        }else{

            if(root.right == null){

                TreeNode node2 = new TreeNode(value);
                root.right = node2;
            }else{
                insertBST(root.right, value);
            }
        }
    }

    static void inOrdertraverse(TreeNode root){

        if(root != null){
            inOrdertraverse(root.left);
            System.out.println(root.val);
            inOrdertraverse(root.right);
        }
    }

}
