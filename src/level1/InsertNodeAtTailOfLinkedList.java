package level1;

public class InsertNodeAtTailOfLinkedList {

    public static void main(String[] args) {
        ListNode ln = new ListNode(5);
        ln.next = new ListNode(2);
        ln.next.next = new ListNode(7);
        int tail = 9;
        ListNode outputLn = insertAtTail(ln, tail);
        System.out.println(outputLn);
    }

    public static ListNode insertAtTail(ListNode head, int data) {
        if (head == null) {
            head = new ListNode(data);
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new ListNode(data);
        return head;
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
