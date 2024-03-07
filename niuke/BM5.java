import java.util.*;

public class BM5 {
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
    public  static ListNode mergeKLists (ArrayList<ListNode> lists) {
        ListNode head= null;
        if(lists.size()==0){
            return head;
        }
        if(lists.size()==1){
            head = lists.get(0);
            return head;
        }
        int k =0;
        for(;k<lists.size();k++){
            head = lists.get(k);
            if(head!=null){
                break;
            }
        }
        // ListNode head= lists.get(0);
        for(int i =k+1;i<lists.size();i++){
            ListNode temp = lists.get(i);
            if(temp!=null){
                if(head.val>temp.val){
                    ListNode tt = head;
                    head = temp;
                    temp = tt;
                }
                ListNode start = head;
                while(start!=null&&temp!=null){
                    if(temp.val>=start.val){
                        if(start.next == null){
                            start.next=temp;
                            break;
                        }
                        if(temp.val<start.next.val){
                            ListNode tt2 = temp;
                            temp = temp.next;
                            tt2.next = start.next;
                            start.next = tt2;
                            start = start.next;
                        }   
                        else{
                            start = start.next;
                        }
                    }
                }
            }
            
        }
        // write code here
        return head;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,6,7));
        ListNode head1 = createLinkedList(list);
        ListNode head2 = createLinkedList(list2);
        ArrayList<ListNode> listNodes = new ArrayList<>();
        listNodes.add(head1);
        listNodes.add(head2);
        ListNode result = mergeKLists(listNodes);
        outputLinkedList(result);
    }
}