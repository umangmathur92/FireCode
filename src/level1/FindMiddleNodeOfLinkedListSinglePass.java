package level1;

public class FindMiddleNodeOfLinkedListSinglePass {

    public static void main(String[] args) {
        ListNode ln = new ListNode(5);
        ln.next = new ListNode(2);
        ln.next.next = new ListNode(7);
        ln.next.next.next = new ListNode(3);
        ln.next.next.next.next = new ListNode(4);
        ListNode middleNode = findMiddleNode(ln);
        System.out.println(middleNode);
    }

    public static ListNode findMiddleNode(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode cursor1 = head;
        ListNode cursor2 = head;
        while (cursor1.next != null && cursor1.next.next != null) {
            cursor2 = cursor2.next;
            cursor1 = cursor1.next.next;
        }
        return cursor2;
    }

    private static class ListNode {
        int data;
        ListNode next;
        ListNode(int data) { this.data = data; }

        @Override
        public String toString() {
            return data + " => " + next;
        }
    }
}
