import java.util.*;

public class bm15 {
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
    public static ListNode deleteDuplicates (ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode start = head;
        while(true){
            if(start==null||start.next==null){
                break;
            }
            while(start.val==start.next.val){
                ListNode temp = start.next;
                start.next = temp.next;
                if(start.next == null){
                    break;
                }
            }
            start=start.next;
        }
        return head;
        // write code here
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 1,1));
        ListNode head = createLinkedList(list);
        ListNode result = deleteDuplicates(head);
        outputLinkedList(result);
    }
}