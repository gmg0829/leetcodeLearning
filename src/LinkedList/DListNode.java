package LinkedList;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description: 双向链表
 * @date 2019/1/28  15:41
 */
public class DListNode {
    int val;
    DListNode prev, next;
    DListNode(int val) {
        this.val = val;
        this.prev = this.next = null;
    }

    public DListNode() {
    }

    public static DListNode reverse(DListNode head) {
        DListNode curr = null;
        while (head != null) {
            curr = head;
            head = curr.next;
            curr.next = curr.prev;
            curr.prev = head;
        }
        return curr;
    }

}
