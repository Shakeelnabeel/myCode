package DSA.linkedlist;


public class SinglyLinkedList {
    private ListNode head;

    public ListNode getHead(){
        return head;
    }

    public static class ListNode {
        public int data;
        public ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data) {
        ListNode node = new ListNode(data);             // Creates a new node.
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            ListNode n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public int length() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertAtBegin(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        }
        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAt(int position, int data) {
        ListNode node = new ListNode(data);
        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;

        }
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
    }

    public void deleteLast() {
        if (head == null || head.next == null) {
            return;
        }
        ListNode current = head;
        ListNode previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;

    }

    public void deleteAt(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }

    }

    public void search(int data) {
        ListNode current = head;
        while (current != null) {
            if (current.data == data) {
                System.out.println(data + " found in the Linked List!!");
                return;
            }
            current = current.next;
        }
        System.out.println(data + " Not found in the Linked List");
    }

    public boolean containsLoop() {     //  checks for loop in LinkedList
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if (slowPtr == fastPtr) {
                return true;
            }
        }
        return false;
    }

    public DSA.ListNode getLinkedList (){
        DSA.ListNode head = null;
        DSA.ListNode node1 = new DSA.ListNode(1);
        head = node1;

        DSA.ListNode node2 = new DSA.ListNode(1);
        node1 = node2;

        DSA.ListNode node3 = new DSA.ListNode(2);
        node2.next = node3;

        DSA.ListNode node4 = new DSA.ListNode(3);
        node3.next = node4;

        DSA.ListNode node5 = new DSA.ListNode(3);
        node4.next = node5;


        return head;
    }

    public void createALoopInLinkedList() {     // creates a LinkedList with loop
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert(1);
        sll.insert(2);
//
//        sll.insertAtBegin(0);
//        sll.insertAtBegin(9);
//
//        sll.insertAtEnd(6);
//        sll.insertAtEnd(6);
//
//        sll.insertAt(4, 10);
//        sll.insertAt(4, 15);
//
//        sll.search(11);
//
//        sll.deleteAt(2);
//        sll.deleteAt(3);
        sll.display();
//        sll.createALoopInLinkedList();
//        System.out.println(sll.containsLoop());

    }
}