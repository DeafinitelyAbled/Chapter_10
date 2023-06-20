public class DoublyLinked {

    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();

        Node2 nodeA = new Node2(10);
        Node2 nodeB = new Node2(20);
        Node2 nodeC = new Node2(30);
        Node2 nodeD = new Node2(40);
        Node2 nodeE = new Node2(50);
        Node2 nodeF = new Node2(60);
        Node2 nodeG = new Node2(70);
        Node2 nodeH = new Node2(80);
        Node2 nodeI = new Node2(90);
        Node2 nodeJ = new Node2(100);

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

        list.remove(nodeD);
        System.out.println("\nThe result after removing the head node:");
        list.printInfo();

        list.remove(nodeA);
        System.out.println("\nThe result after removing the node after the specified node:");
        list.printInfo();

        System.out.println("\n\n --- Deafinitely Abled ---");

    }

}
