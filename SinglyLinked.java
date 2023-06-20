public class SinglyLinked {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        Node nodeA = new Node(10);
        Node nodeB = new Node(20);
        Node nodeC = new Node(30);
        Node nodeD = new Node(40);
        Node nodeE = new Node(50);
        Node nodeF = new Node(60);
        Node nodeG = new Node(70);
        Node nodeH = new Node(80);
        Node nodeI = new Node(90);
        Node nodeJ = new Node(100);

        list.append(nodeA);
        list.append(nodeC);
        list.append(nodeE);
        list.append(nodeG);
        list.append(nodeF);
        System.out.println("The result after appending nodes:");
        list.printInfo();

        list.prepend(nodeB);
        list.prepend(nodeD);
        System.out.println("\nThe result after prepending nodes:");
        list.printInfo();

        list.insertAfter(nodeA, nodeI);
        list.insertAfter(nodeG, nodeH);
        list.insertAfter(nodeE, nodeJ);
        System.out.println("\nThe result after inserting the given nodes after the specified nodes:");
        list.printInfo();

        list.removeAfter(null);
        System.out.println("\nThe result after removing the head node:");
        list.printInfo();

        list.removeAfter(nodeA);
        System.out.println("\nThe result after removing the node after the specified node:");
        list.printInfo();

        System.out.println("\n\n --- Deafinitely Abled ---");

    }

}