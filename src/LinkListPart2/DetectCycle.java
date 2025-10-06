package LinkListPart2;

import LinkList.ReverseLinkList;

public class DetectCycle {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node node3 = head.next.next;
        Node node5 = head.next.next.next.next;

        // Create a cycle by pointing node 5 to node 3
        node5.next = node3;

        System.out.println(isCycle(head));

    }
}
