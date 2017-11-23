package level1;

public class DeleteHeadNodeOfLinkedList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(5, new ListNode(2, new ListNode(7, new ListNode(9, null))));
        ListNode lNode = deleteAtHead(listNode);
        System.out.println(lNode);
    }

    public static ListNode deleteAtHead(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode tempNode = head.next;
        head.next = null;
        head = tempNode;
        return head;
    }

    private static class ListNode {

        int value;
        ListNode next;

        ListNode(int val, ListNode node) {
            this.value = val;
            this.next = node;
        }

        @Override
        public String toString() {
            return value + " => " + next;
        }

    }


}
