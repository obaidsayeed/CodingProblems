//Asked by Google.
//
//Given k sorted singly linked lists, write a function to merge all the lists
// into one sorted singly linked list.


public class MergeLinkedList_24_06_2022 {
    public static Node solution(Node[] arr){
        int n = arr.length;

        for (int i = 1; i < n; i++)
        {
            while(true)
            {

                // head of both the lists,
                // 0 and ith list.
                Node head_0 = arr[0];
                Node head_i = arr[i];

                // Break if list ended
                if (head_i == null)
                    break;

                // Smaller than first element
                if(head_0.val >= head_i.val)
                {
                    arr[i] = head_i.next;
                    head_i.next = head_0;
                    arr[0] = head_i;
                }
                else
                {

                    // Traverse the first list
                    while (head_0.next != null)
                    {

                        // Smaller than next element
                        if (head_0.next.val >= head_i.val)
                        {
                            arr[i] = head_i.next;
                            head_i.next = head_0.next;
                            head_0.next = head_i;
                            break;
                        }

                        // go to next node
                        head_0 = head_0.next;

                        // if last node
                        if (head_0.next == null)
                        {
                            arr[i] = head_i.next;
                            head_i.next = null;
                            head_0.next = head_i;
                            head_0.next.next = null;
                            break;
                        }
                    }
                }
            }
        }
        return arr[0];
    }

    public static void printList(Node head){
        while (head.next != null){
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("null");
    }
}
