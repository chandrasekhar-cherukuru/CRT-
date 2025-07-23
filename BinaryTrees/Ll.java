package Exam;
import java.util.Scanner;
class ListNode{
    ListNode next;
    int val;
    
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class Ll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        System.out.println("Enter " +n+ " nodes");
        int[] arr = new int[n];
        int[] arr2 = new int[3];
        arr2[0] = 3;
        arr2[1] = 4;
        arr2[2] = 8;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original linked list: ");
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        int start = 1;
        while(start < arr.length){

            ListNode cur = new ListNode(arr[start]);
            current.next = cur;
            current = current.next;
            start++;

        }

        ListNode head2 = new ListNode(arr2[0]);
        ListNode current2 = head2;
        int start2 = 1;
        while(start2 < arr2.length){

            ListNode cur = new ListNode(arr2[start2]);
            current2.next = cur;
            current2 = current2.next;
            start2++;

        }
        

        printL(head);
        System.out.println();
        // System.out.println("Reversed linked list");
        // reverseLL(head);
        System.out.println("Merge of two lists: ");
        merge(head, head2);


    }
    static void printL(ListNode head){

        ListNode dummy = head;
        ListNode curr = dummy;
        while(curr != null){
            System.out.print(curr.val+ " -> ");
            curr = curr.next;
        }
        System.out.print("null");
        
    }

    static void reverseLL(ListNode head){

        ListNode dummy = head;
        ListNode prev = null;
        ListNode curr = dummy;
        ListNode next = curr.next;

        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(curr != null) next = curr.next;
        }
        printL(prev);
    }

    static void merge(ListNode node1, ListNode node2){
        ListNode head = new ListNode(0);
        ListNode current1 = node1;
        ListNode current2 = node2;
        ListNode current = head;
        while(current1 != null && current2 != null){

             int one = current1.val;
             int two = current2.val;
             if(one <= two){
                ListNode node = new ListNode(one);
                current.next = node;
                current = current.next;
                current1 = current1.next;
             }else if(two < one){
                ListNode node = new ListNode(two);
                current.next = node;
                current = current.next;
                current2 = current2.next;
             }
        }

        while(current1 != null){
            ListNode node = new ListNode(current1.val);
            current.next = node;
            current = current.next;
            current1 = current1.next;
        }

        while(current2 != null){
            ListNode node = new ListNode(current2.val);
            current.next = node;
            current = current.next;
            current2 = current2.next;
        }

        printL(head.next);
    }
}
