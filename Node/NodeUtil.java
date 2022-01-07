package Node;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-12-29
 * Time: 17:20
 */
public class NodeUtil {
    /**
     * 根据数组生成链表
     *
     * @param arr
     * @return
     */
    public static ListNode genListNode(int[] arr) {
        ListNode n = new ListNode(arr[0]);
        ListNode head = n;
        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            n.next = node;
            n = node;
        }
        n.next = null;
        return head;
    }

    /**
     * 打印链表
     *
     * @param node
     */
    public static void printListNode(ListNode node) {
        while (node != null) {
            String result = node.next == null ? node.val + "" : node.val + ",";
            node = node.next;
            System.out.print(result);
        }
    }
}
