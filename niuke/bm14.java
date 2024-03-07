import java.util.*;

public class bm14 {
    // 创造链表
    public static ListNode createLinkedList(List<Integer> data) {
        ListNode head = new ListNode(data.get(0));
        ListNode current = head;
        for (int i = 1; i < data.size(); i++) {
            ListNode newNode = new ListNode(data.get(i));
            current.next = newNode;
            current = newNode;
        }
        return head;
    }
    // 输出链表
    public static void outputLinkedList(ListNode head) {
        ListNode current = head;
        while(current!= null){
            System.out.println(current.val);
            current = current.next;
        }
    }
    public static ListNode oddEvenList (ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode head2 = head.next;
        // write code here
        ListNode start = head;
        ListNode start2 = head;
        ListNode befstart2=start2;
        while(true){
            start = start2.next;
            if(start==null){
                break;
            }
            start2.next = start.next;
            befstart2 = start2;
            start2 = start.next;
            if(start2==null){
                break;
            }
            start.next = start2.next;
        } 
        if(start2==null){
            befstart2.next = head2;
        }
        if(start==null){
            start2.next = head2;
        }
        return head;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2,3,4,5,6));
        ListNode head = createLinkedList(list);
        ListNode result = oddEvenList(head);
        outputLinkedList(result);
    }
}