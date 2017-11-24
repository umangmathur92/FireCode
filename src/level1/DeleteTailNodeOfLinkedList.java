package level1;

public class DeleteTailNodeOfLinkedList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, null);
        ListNode output = deleteAtTail(listNode);
        System.out.println(output);
    }

    public static ListNode deleteAtTail(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode currNode = head;
        ListNode prevNode = null;
        while (currNode.next != null) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        prevNode.next = null;
        return head;
    }

    private static class ListNode {

        int value;
        ListNode next;

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return value + " => " + next;
        }
    }

}
