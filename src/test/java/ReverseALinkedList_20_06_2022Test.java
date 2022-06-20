import org.junit.Test;

public class ReverseALinkedList_20_06_2022Test {

    @Test
    public void testCase_1(){
        ReverseALinkedList_20_06_2022 list = new ReverseALinkedList_20_06_2022();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");

        head = list.solution2(head);
        temp = head;
        while (temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }
}
