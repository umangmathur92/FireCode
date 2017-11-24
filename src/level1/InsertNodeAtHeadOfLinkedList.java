package level1;

public class InsertNodeAtHeadOfLinkedList {

    public static void main(String[] args) {
        ListNode ln = new ListNode(5);
        ln.next = new ListNode(2);
        ln.next.next = new ListNode(7);
        int newHead = 9;
        ListNode outputLn = insertAtHead(ln, newHead);
        System.out.println(outputLn);
    }

    public static ListNode insertAtHead(ListNode head, int data) {
        ListNode headLn = new ListNode(data);
        headLn.next = head;
        return headLn;
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
