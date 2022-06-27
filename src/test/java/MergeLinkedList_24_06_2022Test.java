import org.junit.Test;

public class MergeLinkedList_24_06_2022Test {
    @Test
    public void testCase_1(){
        Node[] heads = new Node[3];
        heads[0] = new Node(0);
        heads[0].next = new Node(3);
        heads[0].next.next = new Node(6);
        heads[0].next.next.next = new Node(9);

        heads[1] = new Node(1);
        heads[1].next = new Node(4);
        heads[1].next.next = new Node(7);
        heads[1].next.next.next = new Node(10);

        heads[2] = new Node(2);
        heads[2].next = new Node(5);
        heads[2].next.next = new Node(8);
        heads[2].next.next.next = new Node(11);
        MergeLinkedList_24_06_2022.printList(MergeLinkedList_24_06_2022.solution(heads));
    }
}
