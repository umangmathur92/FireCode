package level1;

public class FindMiddleNodeOfList {

    public static void main(String[] args) {
        ListNode listNode = new  ListNode(1,new ListNode(5, new ListNode(9, new ListNode(2, new ListNode(8, new ListNode(5, null))))));
        Integer value = listNode.value;
        ListNode middleNode = findMiddleNode(listNode);
        System.out.println(middleNode.value);
    }
    public static ListNode findMiddleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow, fast;
        slow=head;
        fast=head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private static class ListNode {

        Integer value;
        ListNode next = null;

        ListNode(Integer val, ListNode nxt) {
            this.value = val;
            this.next = nxt;
        }
    }
}
