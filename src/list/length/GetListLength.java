package list.length;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2019/2/18  9:30
 */
/*
 * 求单链表中结点的个数: getListLength
 */
public class GetListLength {
    public static void main(String[] args) {
        list.reverse.Node head = new list.reverse.Node(3);
        list.reverse.Node node1 = new list.reverse.Node(5);
        list.reverse.Node node2 = new list.reverse.Node(6);
        list.reverse.Node node3 = new list.reverse.Node(9);
        list.reverse.Node node4 = new list.reverse.Node(7);
        list.reverse.Node node5 = new list.reverse.Node(2);
        list.reverse.Node node6 = new list.reverse.Node(1);
        head.next = node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;

        int listLength = getListLength(head);
        System.out.println(listLength);
    }
    // 打印链表的方法，方便test函数
    public static void printList(list.reverse.Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    /*
     * 求单链表中结点的个数
     * 注意检查链表是否为空。时间复杂度为O（n）
     */
    public static int getListLength(list.reverse.Node head) {
        // 注意头结点为空情况
        if (head == null) {
            return 0;
        }

        int len = 0;
        list.reverse.Node cur = head;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        return len;
    }

}
// 建立链表结构类 val和next
class Node{
    int val;
    list.reverse.Node next;
    public Node(int val){
        this.val=val;
        this.next=null;
    }
}
