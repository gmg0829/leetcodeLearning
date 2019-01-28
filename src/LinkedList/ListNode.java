package LinkedList;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description: 单向链表
 * @date 2019/1/28  15:29
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }

    public ListNode() {
    }

    /*
       保存当前头结点的下个节点。
        将当前头结点的下一个节点指向“上一个节点”，这一步是实现了反转。
        将当前头结点设置为“上一个节点”。
        将保存的下一个节点设置为头结点。
     */
    public static ListNode reverse1(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next; //next指向了节点2，先将节点2保存起来
            head.next = prev;//将pre变量赋值给了head.next，即节点1指向了null
            prev = head;//将head赋值给了pre，即pre指向节点1，将节点1设为“上一个节点”。
            head = next;//将next赋值给head，即head指向了节点2。将节点2设置为“头结点”。
        }
        return prev;
    }

    // recursive method 递归
    public static ListNode reverse2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        ListNode newHead = reverse2(next);
        next.next = head;
        head.next = null;
        return newHead;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.val = 1;

        head.next = new ListNode();
        head.next.val = 2;

        head.next.next = new ListNode();
        head.next.next.val = 3;

        head.next.next.next = new ListNode();
        head.next.next.next.val = 4;

        head.next.next.next.next = new ListNode();
        head.next.next.next.next.val = 5;

        head.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.val = 6;

        head.next.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.next.val = 7;

        head.next.next.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.next.next.val = 8;

        head.next.next.next.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.next.next.next.val = 9;
        head=reverse1(head);
        printList(head);
    }
}
