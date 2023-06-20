public class LinkedList2 {
    private Node2 head;
    private Node2 tail;

    public LinkedList2() {
        tail = null;
        head = null;
    }
    // appending a new node at the end of a list
    public void append(Node2 newNode) {
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
    public void prepend(Node2 newNode) {
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
    public void insertAfter(Node2 currNode, Node2 newNode) {
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
    public void remove(Node2 currNode) {
        Node2 sucNode = currNode.next;
        Node2 preNode = currNode.previous;

        if (sucNode != null) {
            sucNode.previous = preNode;
        }
        if (preNode != null) {
            preNode.next = sucNode;
        }
        if (currNode == head) {
            head = sucNode;
        }
        if (currNode == tail) {
            tail = preNode;
        }
    }
    // printing the result nodes
    public void printInfo() {
        Node2 node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

}

