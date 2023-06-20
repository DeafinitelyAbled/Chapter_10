public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        tail = null;
        head = null;
    }
    // appending a new node at the end of a list
    public void append(Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    // prepending a new node at the beginning of a list
    public void prepend(Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }
    // inserting a new node after a current node
    public void insertAfter(Node currNode, Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else if (currNode == tail) {
            tail.next = newNode;
            tail = newNode;
        }
        else {
            newNode.next = currNode.next;
            currNode.next = newNode;
        }
    }
    // removing a node after the current node
    public void removeAfter(Node currNode) {
        // special case: remove head
        if (currNode == null && head != null) {
            Node succNode = head.next;
            head = succNode;

            if (succNode == null) {
                tail = null;
            }
        }
        else if (currNode.next != null) {
            Node succNode = currNode.next.next;
            currNode.next = succNode;

            if (succNode == null) {
                tail = currNode;
            }
        }
    }
    // printing the result nodes
    public void printInfo() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

}


