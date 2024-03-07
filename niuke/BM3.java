import java.util.*;

public class BM3 {
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
    public static ListNode reverseKGroup (ListNode head, int k) {
        if(head==null||head.next==null||k==1){
            return head;
        }
        ListNode temp1 = head;
        ListNode temp2 = head;
        ListNode preTemp1 = new ListNode(0);
        preTemp1.next = temp1;
        ListNode result = preTemp1;
        while(temp2!=null&&temp2.next!=null){
            // 这一部分就是判断能都整除，
            // 如果i=k且temp2==null表示正好能整除，可以反转
            // 如果i<k的情况下temp为空了，表示k远大于剩下的节点数，就不要翻转了，这卡了好久
            // 其实感觉不如先测量长度后再用长度来判断能否整除
            int i=0;
            for(;i<k;i++){
                if(temp2 == null){
                    break;
                }
                temp2 = temp2.next;

            }
            if(i<k&&temp2==null){
                break;
            }
            // 一直到这
            // 这边就是翻转部分了，这个很巧妙
            // 先创建一个头结点在head前面，然后使用pre绑定temp1的前一个节点，然后不断反转，还能保证翻转完头尾还是相连的
            for(int j = 0;j<k-1;j++){
                ListNode temp = temp1.next;
                temp1.next = temp.next;
                temp.next = preTemp1.next;
                preTemp1.next = temp;
            }
            preTemp1 = temp1;
            temp1 = temp2;
        }
        return result.next;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2,3,4,5));
        ListNode head = createLinkedList(list);
        head = reverseKGroup(head, 4);
        outputLinkedList(head);
    }
}