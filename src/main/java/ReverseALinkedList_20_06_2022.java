//Asked by Google.
//
//Given the head of a singly linked list, reverse it in-place.
//Constraints:
//
//The number of nodes in the list is the range [0, 5000].
//-5000 <= Node.val <= 5000

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}

public class ReverseALinkedList_20_06_2022 {

    Node head;
    ReverseALinkedList_20_06_2022(){
        head = null;
    }

    public static Node solution(Node head){
        if ( head.next == null){
            return head;
        }
        Node prev = null;
        Node curr = head;
        Node temp = null;

        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        head = prev;
        return prev;
    }

}
